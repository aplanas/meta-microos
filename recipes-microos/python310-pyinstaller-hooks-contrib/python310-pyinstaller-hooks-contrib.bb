SUMMARY = "Community maintained hooks for PyInstaller"
DESCRIPTION = "Community maintained hooks for PyInstaller"
LICENSE = "Apache-2.0 | GPL-2.0-only"

PV = "2023.0"

RPM_NAME = "python310-pyinstaller-hooks-contrib-2023.0-1.4.noarch.rpm"
RPM_HASH = "c23c2014504ee4047b00add3b780b30b44dd902e1e967f0e8d8fc22376b9631481b411ed0ae9070cfae9e2608ce5a69589e583aadab4170dcf38745ae78625b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyinstaller-hooks-contrib \
python3.10dist(pyinstaller-hooks-contrib) \
python310-pyinstaller-hooks-contrib \
python3dist(pyinstaller-hooks-contrib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
