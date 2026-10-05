# SD Enterprise — One-click APK build

## Upload the project
1. Create a GitHub repository.
2. Upload all files from this project to the repository.
3. Make sure `.github/workflows/build-apk.yml` is included.
4. Commit/push to the `main` branch.

## Build the APK
- Open the repository on GitHub.
- Go to **Actions**.
- Select **Build SD Enterprise APK**.
- Click **Run workflow**.
- Wait for the green check.
- Open the completed workflow run.
- Under **Artifacts**, download `SD-Enterprise-debug-apk`.
- Extract the downloaded artifact and install the `.apk` on Android.

## Important
This workflow creates a **debug APK** for testing. It is not a Play Store release APK.

Before building a real production release, configure Firebase in the app and use a proper Android signing key. Never put Firebase Admin/service-account private keys in the APK or repository.

If GitHub Actions cannot find `./gradlew`, make sure the Gradle wrapper files (`gradlew`, `gradlew.bat`, and `gradle/wrapper/...`) are present in the repository.
