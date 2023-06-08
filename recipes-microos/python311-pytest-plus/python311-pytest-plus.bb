SUMMARY = "Extension for pytest to enforce minimum tests pass"
DESCRIPTION = "PyTest Plus extends pytest functionality to enforce PYTEST_REQPASS tests passed."
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "python311-pytest-plus-0.2-1.12.noarch.rpm"
RPM_HASH = "5ac8d3ddeb241418d13f2411d38047bd8c2ed1f153e81a88f18937ef9d47b3219551a3f946ad8ed243cdd4f14eb0bdd956992154165fd900feed0c5b7f5835d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-plus) python311-pytest-plus python3dist(pytest-plus)"
RDEPENDS:${PN} += "python(abi) python311-pytest"

inherit rpm
