SUMMARY = "A simple network listener for py.test"
DESCRIPTION = "Simple JSON listener using TCP that listens for data and stores it in a queue for later retrieval."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-pytest-listener-1.7.0-4.3.noarch.rpm"
RPM_HASH = "45873d959758722fbc2c97407a7254c772b94709bac643f058d9d11216253f460051961655ba7b87080215dc87fcd2b8016081599042775c6ebea8a0fea68287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-listener) python311-pytest-listener python3dist(pytest-listener)"
RDEPENDS:${PN} += "python(abi) python311-pytest-server-fixtures"

inherit rpm
