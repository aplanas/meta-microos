SUMMARY = "Improvements over the standard pathlib module and pathlib2 package"
DESCRIPTION = "Improvements over the standard pathlib module and pathlib2 package."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python310-ruamel.std.pathlib-0.9.2-2.3.noarch.rpm"
RPM_HASH = "02e5c01f7ff6e9155e2c4eac04ea1dda5e24b3d1d39815674d52a7a4f86ee5cc4e32f45ee40ec1f5e3a5f9e09b9684c306c3575b4617ce176c16636df7e437af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ruamel.std.pathlib \
python3.10dist(ruamel.std.pathlib) \
python310-ruamel.std.pathlib \
python3dist(ruamel.std.pathlib)"
RDEPENDS:${PN} += "python(abi) \
python310-ruamel.base"

inherit rpm
