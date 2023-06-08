SUMMARY = "Community maintained hooks for PyInstaller"
DESCRIPTION = "Community maintained hooks for PyInstaller"
LICENSE = "Apache-2.0 | GPL-2.0-only"

PV = "2023.0"

RPM_NAME = "python311-pyinstaller-hooks-contrib-2023.0-1.4.noarch.rpm"
RPM_HASH = "725d792003e906ad16446d9f260005c9affaaf00d67ef6e8fa9d181dd6cee5a7442a0a1acd27b50dbb4ab8f4780f3636b516ccef78650d7e2cf034f8ba6a49d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyinstaller-hooks-contrib) python311-pyinstaller-hooks-contrib python3dist(pyinstaller-hooks-contrib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
