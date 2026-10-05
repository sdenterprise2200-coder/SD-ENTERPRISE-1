# SD Enterprise Android APK project

## Open and build
1. Install Android Studio (latest stable).
2. Open this folder as a project.
3. Let Gradle sync and install Android SDK Platform 35 / Build Tools when prompted.
4. Before building, open `app/src/main/assets/index.html` and replace the `firebaseConfig` placeholders with your Firebase Web App config.
5. In Firebase Authentication, enable Email/Password.
6. Create Firestore and apply the security rules from the web project's README.
7. Build → Generate App Bundles or APKs → Generate APKs.

## Package
`com.sdenterprise.shop`

## Important
The HTML app is bundled locally inside the APK and connects to Firebase over HTTPS for login and live sync. Firebase Web config is not a secret key; never put a Firebase service-account private key in this APK.
