SUMMARY = "Pytest plugin for test session metadata"
DESCRIPTION = "Pytest plugin for test session metadata."
LICENSE = "MPL-2.0"

PV = "2.0.4"

RPM_NAME = "python39-pytest-metadata-2.0.4-1.3.noarch.rpm"
RPM_HASH = "8d923ac6a60a662664e4cf5b3f24c84dafd8572e942a42f7c85e99bd644246dcb41ada59860879c78be187f1002410866ff3cd4d7d422ded87d9bffe14a37a23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-metadata) python39-pytest-metadata python3dist(pytest-metadata)"
RDEPENDS:${PN} += "python(abi) python39-pytest"

inherit rpm
