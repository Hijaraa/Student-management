# MySQL Service Management Instructions

## Issue: Permission Denied When Stopping MySQL Service

The error message you're seeing:
```
net stop MySQL80 
L'erreur système 5 s'est produite.
Accès refusé.
```

This error occurs because Windows requires administrative privileges to stop services.

## Solution: Run Command Prompt as Administrator

To properly stop the MySQL service, follow these steps:

1. Click on the Windows Start menu
2. Type "cmd" in the search box
3. Right-click on "Command Prompt" in the search results
4. Select "Run as administrator"
5. When prompted by User Account Control (UAC), click "Yes"
6. In the elevated Command Prompt, type the following command:
   ```
   net stop MySQL80
   ```

## Alternative Methods

### Using Windows Services Manager
1. Press `Win + R` to open the Run dialog
2. Type `services.msc` and press Enter
3. Find "MySQL80" in the list of services
4. Right-click on it and select "Stop"

### Using PowerShell as Administrator
1. Right-click on the Windows Start menu
2. Select "Windows PowerShell (Admin)"
3. When prompted by UAC, click "Yes"
4. Run the following command:
   ```powershell
   Stop-Service -Name MySQL80
   ```

## Starting MySQL Service

To start the MySQL service again, use the same administrative Command Prompt and run:
```
net start MySQL80
```

## Note About Your Application Configuration

Your Spring Boot application is configured to connect to MySQL with:
- URL: jdbc:mysql://localhost:3306/studentdb
- Username: root
- Password: (empty)

Make sure MySQL is running before starting your application.