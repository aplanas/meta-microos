SUMMARY = "Extension for pytest to enforce minimum tests pass"
DESCRIPTION = "PyTest Plus extends pytest functionality to enforce PYTEST_REQPASS tests passed."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-pytest-plus-0.4.0-1.1.noarch.rpm"
RPM_HASH = "5873519dc67dfea37543849e9699bb8b0fbc3accb0c05f7f165b402fc54fe1000b2fc0008c2f42faac5bfe962e63ca99babeb8d184c24f973607ec9e2548232d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-plus \
python3.10dist(pytest-plus) \
python310-pytest-plus \
python3dist(pytest-plus)"
RDEPENDS:${PN} += "python(abi) \
python310-pytest"

inherit rpm
