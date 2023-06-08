SUMMARY = "Extension for pytest to enforce minimum tests pass"
DESCRIPTION = "PyTest Plus extends pytest functionality to enforce PYTEST_REQPASS tests passed."
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "python39-pytest-plus-0.2-1.12.noarch.rpm"
RPM_HASH = "09b137ba1349a67460ee20444cd3a15d1ef01e2e69fc6265b2f70c078c29231bb37563f63bd5ab6fdaab4407fc06afaaf33fa6245d1c2cacf4a1c00e3abf8210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-plus) python39-pytest-plus python3dist(pytest-plus)"
RDEPENDS:${PN} += "python(abi) python39-pytest"

inherit rpm
