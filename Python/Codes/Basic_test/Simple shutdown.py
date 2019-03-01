import os;
import tempfile

print("1. Shutdown Computer");
print("2. Restart Computer");
print("3. Exit");
choice = int(input("\nEnter your choice: "));
if (choice >= 1 and choice <= 2):
    if choice == 1:
        os.system("shutdown /s /t 1");
    else:
        os.system("shutdown /r /t 1");
else:
    exit();