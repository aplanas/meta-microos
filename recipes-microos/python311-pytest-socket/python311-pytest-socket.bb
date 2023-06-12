SUMMARY = "Pytest Plugin to disable socket"
DESCRIPTION = "A Pytest Plugin to disable socket calls during tests."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python311-pytest-socket-0.6.0-1.1.noarch.rpm"
RPM_HASH = "e9a89243bab749dfcb92007ee762afc025e4357a75a05850d09c728a82dea764301b291a9e6994ac4e2a8f940c1ae54a13dcb7b4b7b5b804f19e985592f3b13e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-socket) python311-pytest-socket python3dist(pytest-socket)"
RDEPENDS:${PN} += "python(abi) python311-pytest"

inherit rpm
