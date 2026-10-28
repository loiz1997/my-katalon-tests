
import { defineConfig, devices } from '@playwright/test';
import { getGlobalSetupPath } from '@katalon/playwright-reporter';

export default defineConfig({
  testDir: './tests',
  fullyParallel: false,
  workers: 1,
  reporter: [
    ['list'],
    [
      '@katalon/playwright-reporter',
      {
        outputDir: './reports',
        ...(process.env.KATALON_API_KEY && {
          platform: {
            apiKey: process.env.KATALON_API_KEY,
            projectId: process.env.KATALON_PROJECT_ID,
            baseUrl: process.env.KATALON_BASE_URL,
            authUrl: process.env.KATALON_AUTH_URL,
          },
        }),
      },
    ],
  ],

  use: {
    baseURL: 'https://opensource-demo.orangehrmlive.com',
    trace: 'retain-on-failure',
    screenshot: 'only-on-failure',
  },

  projects: [
    {
      name: 'chromium',
      use: {
        ...devices['Desktop Chrome'],
        browserName: 'chromium',
      },
    },
  ],
});
