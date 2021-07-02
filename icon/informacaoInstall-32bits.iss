; Script generated by the Inno Setup Script Wizard.
; SEE THE DOCUMENTATION FOR DETAILS ON CREATING INNO SETUP SCRIPT FILES!

#define MyAppName "System Clinica"
#define MyAppVersion "1.5"
#define MyAppPublisher "System Clinica"
#define MyAppURL "http://www.example.com/"
#define MyAppExeName "appClinica.jar"

[Setup]
; NOTE: The value of AppId uniquely identifies this application. Do not use the same AppId value in installers for other applications.
; (To generate a new GUID, click Tools | Generate GUID inside the IDE.)
AppId={{7991CFAF-7501-4D15-8DCB-5F3448FF351F}
AppName={#MyAppName}
AppVersion={#MyAppVersion}
;AppVerName={#MyAppName} {#MyAppVersion}
AppPublisher={#MyAppPublisher}
AppPublisherURL={#MyAppURL}
AppSupportURL={#MyAppURL}
AppUpdatesURL={#MyAppURL}
DefaultDirName=C:\{#MyAppName}
DisableProgramGroupPage=yes
; Uncomment the following line to run in non administrative install mode (install for current user only.)
;PrivilegesRequired=lowest
OutputDir=D:\System Clinica\tmp
OutputBaseFilename=Gra�aSoft
SetupIconFile=C:\Users\luanp\eclipse-workspace\Graca_Software\icon\icone.ico
Password=ads54321
Compression=lzma
SolidCompression=yes
WizardStyle=modern

[Languages]
Name: "english"; MessagesFile: "compiler:Default.isl"
Name: "brazilianportuguese"; MessagesFile: "compiler:Languages\BrazilianPortuguese.isl"

[Tasks]
Name: "desktopicon"; Description: "{cm:CreateDesktopIcon}"; GroupDescription: "{cm:AdditionalIcons}"; Flags: unchecked


[Files]
Source: "D:\System Clinica\appClinica.jar"; DestDir: "{app}"; Flags: ignoreversion
Source: "D:\System Clinica\Bibliotecas\*"; DestDir: "C:\System Clinica\Bibliotecas"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: "D:\System Clinica\bkp\*"; DestDir: "C:\System Clinica\bkp"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: "D:\System Clinica\icon\*"; DestDir: "C:\System Clinica\icon"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: "D:\System Clinica\imagens\*"; DestDir: "C:\System Clinica\imagens"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: "D:\System Clinica\tmp"; DestDir: "C:\System Clinica\tmp"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: "D:\System Clinica\xml\*"; DestDir: "C:\System Clinica\xml"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: "D:\System Clinica\masque.ttf"; DestDir: "C:\System Clinica\"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: "D:\System Clinica\SicrozGoogle.exe"; DestDir: "C:\System Clinica\"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: "D:\System Clinica\execZap.bat"; DestDir: "C:\System Clinica\"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: "D:\System Clinica\ComandCreateBD.bat"; DestDir: "{app}"; Flags: ignoreversion
Source: "D:\System Clinica\JavaSetup8u191.exe"; DestDir: "{app}"; Flags: ignoreversion
Source: "D:\System Clinica\postgresql-9.4.26-1-windows-32btis.exe"; DestDir: "{app}"; Flags: ignoreversion
Source: "D:\System Clinica\whatsappBot.vbs"; DestDir: "{app}"; Flags: ignoreversion
Source: "D:\System Clinica\WhatsAppSetup.exe"; DestDir: "{app}"; Flags: ignoreversion
Source: "D:\System Clinica\icone.ico"; DestDir: "{app}"; Flags: ignoreversion  
; NOTE: Don't use "Flags: ignoreversion" on any shared system files

[Icons]
Name: "{autoprograms}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"
Name: "{autodesktop}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"; IconFilename:{app} icone.ico


[Run]

Filename: "{app}\JavaSetup8u191.exe";Flags: runminimized; StatusMsg: Instalando java....;
Filename: "{app}\WhatsAppSetup.exe"; Flags: runminimized; StatusMsg: Instalando Whatsapp...;
Filename: "{app}\SicrozGoogle.exe"; Flags: runminimized; StatusMsg: Instalando SicronizinGoogle...;
Filename: "{app}\postgresql-9.4.26-1-windows-32btis.exe"; Parameters: --serverport 5433 --locale C --superaccount postgres --superpassword ads54321 --unattendedmodeui minimal --debuglevel 2 --mode unattended; StatusMsg: Aguarde at� que a instala��o chegue ao fim...
;--create_shortcuts 0 (Adicione para n�o criar atalhos no postgre)
Filename: "{app}\ComandCreateBD.bat"; Parameters: """{pf32}"" ""{pf32}"""; StatusMsg: Atualizando o banco de dados;
Filename: "{app}\{#MyAppExeName}"; Description: "{cm:LaunchProgram,{#StringChange(MyAppName, '&', '&&')}}"; Flags: shellexec postinstall skipifsilent

