
import { test, expect } from '@playwright/test';

const username = process.env.ORANGEHRM_USERNAME ?? 'Admin';
const password = process.env.ORANGEHRM_PASSWORD ?? 'admin123';

test.describe('OrangeHRM Login', () => {
  test.beforeEach(async ({ page }) => {
  await page.goto('/web/index.php/auth/login');
});

  test('01 - Login page displays required controls', async ({ page }) => {
    await expect(
      page.getByRole('heading', { name: 'Login' })
    ).toBeVisible();

    await expect(page.getByPlaceholder('Username')).toBeVisible();
    await expect(page.getByPlaceholder('Password')).toBeVisible();
    await expect(page.getByRole('button', { name: 'Login' })).toBeVisible();
  });

  test('02 - Username field accepts demo username', async ({ page }) => {
    const usernameField = page.getByPlaceholder('Username');

    await usernameField.fill(username);
    await expect(usernameField).toHaveValue(username);
  });

  test('03 - Password field accepts and masks password', async ({ page }) => {
    const passwordField = page.getByPlaceholder('Password');

    await passwordField.fill(password);

    await expect(passwordField).toHaveValue(password);
    await expect(passwordField).toHaveAttribute('type', 'password');
  });

  test('04 - Valid login can be submitted with Enter', async ({ page }) => {
    await page.getByPlaceholder('Username').fill(username);
    await page.getByPlaceholder('Password').fill(password);
    await page.getByPlaceholder('Password').press('Enter');

    await expect(page).toHaveURL(/dashboard/);
    await expect(
      page.getByRole('heading', { name: 'Dashboard' })
    ).toBeVisible();
  });

  test('05 - Login button opens dashboard', async ({ page }) => {
    await page.getByPlaceholder('Username').fill(username);
    await page.getByPlaceholder('Password').fill(password);
    await page.getByRole('button', { name: 'Login' }).click();

    await expect(page).toHaveURL(/dashboard/);
    await expect(
      page.getByRole('heading', { name: 'Dashboard' })
    ).toBeVisible();
  });
});
