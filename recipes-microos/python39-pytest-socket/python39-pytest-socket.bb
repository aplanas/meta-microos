SUMMARY = "Pytest Plugin to disable socket"
DESCRIPTION = "A Pytest Plugin to disable socket calls during tests."
LICENSE = "MIT"

PV = "0.3.5"

RPM_NAME = "python39-pytest-socket-0.3.5-1.12.noarch.rpm"
RPM_HASH = "45aef50516f9eacfc8f74def9e7f4ea2f08c2871e758d893532df3a4c7d8f455f5fb1dde06a1b42adaa1bc1cf32ca05367d4c60b8c7815e0c3f7e8803db49147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-socket) python39-pytest-socket python3dist(pytest-socket)"
RDEPENDS:${PN} += "python(abi) python39-pytest"

inherit rpm
