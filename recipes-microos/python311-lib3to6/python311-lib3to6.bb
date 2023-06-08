SUMMARY = "Module to compile Python 3.6+ code to Python 2.7+"
DESCRIPTION = "A module to compile Python 3.6+ code to Python 2.7+."
LICENSE = "MIT"

PV = "202107.1047"

RPM_NAME = "python311-lib3to6-202107.1047-2.4.noarch.rpm"
RPM_HASH = "c0fea0bf5fdfaa4b51d10990e8f3d76c904b31b1011f91c3bf7831166c6dae3c4a87b8f2a2748f223f1fd9f56302ff3f252c2a3174e2b6f4e2ddbeeac5b648e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(lib3to6) python311-lib3to6 python3dist(lib3to6)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-astor python311-click python311-typing python311-wheel update-alternatives"

inherit rpm
