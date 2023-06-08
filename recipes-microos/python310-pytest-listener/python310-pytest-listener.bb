SUMMARY = "A simple network listener for py.test"
DESCRIPTION = "Simple JSON listener using TCP that listens for data and stores it in a queue for later retrieval."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-pytest-listener-1.7.0-4.3.noarch.rpm"
RPM_HASH = "f3335b74f6ea497be1c35ee6d447736575b6a12577605432905e1e61997e97fdfc7153aa64197c2d42695de267c8c10bb24c537d18de066c0f56ed74cd90c759"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-listener python3.10dist(pytest-listener) python310-pytest-listener python3dist(pytest-listener)"
RDEPENDS:${PN} += "python(abi) python310-pytest-server-fixtures"

inherit rpm
