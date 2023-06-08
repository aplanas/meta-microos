SUMMARY = "Extension for pytest to enforce minimum tests pass"
DESCRIPTION = "PyTest Plus extends pytest functionality to enforce PYTEST_REQPASS tests passed."
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "python310-pytest-plus-0.2-1.12.noarch.rpm"
RPM_HASH = "1597c3a0fc6c6b3794d3b4e02ec6b4f29994ef8bd461e326b81ab5f88dfb8547f39ef09eb4404e829f77133bab4067e9c789c8e45312734e21333ac33ba43218"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-plus python3.10dist(pytest-plus) python310-pytest-plus python3dist(pytest-plus)"
RDEPENDS:${PN} += "python(abi) python310-pytest"

inherit rpm
