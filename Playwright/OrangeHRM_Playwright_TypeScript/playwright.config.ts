import 'dotenv/config';
import { defineConfig, devices } from '@playwright/test';
import { getGlobalSetupPath } from '@katalon/playwright-reporter';

export default defineConfig({
  testDir: './tests',
  timeout: 60000,

  expect: {
    timeout: 10000,
  },
  globalSetup: getGlobalSetupPath(),
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
  headless: true,
  viewport: { width: 1280, height: 720 },
  deviceScaleFactor: 1,
  locale: 'en-US',
  serviceWorkers: 'block',
  trace: 'retain-on-failure',
  screenshot: 'only-on-failure',

  launchOptions: {
    args: ['--disable-dev-shm-usage'],
  },
},

  projects: [
  {
    name: 'chromium',
    use: {
      ...devices['Desktop Chrome'],
      browserName: 'chromium',
      channel: 'chrome',
      headless: true,
      viewport: { width: 1280, height: 720 },
    },
  },
],
});
