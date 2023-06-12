SUMMARY = "Programmatic API to create and use a devpi server process"
DESCRIPTION = "This package provides a programmatic API to create and use a \
devpi server process."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-devpi-process-0.3.0-1.1.noarch.rpm"
RPM_HASH = "927cf4bddbbf1681a4f8d191b87598588cc4ff3a545e627c187c52e125a397d64ce723394fc8e3f62e238d21e771d44ad5b01c65f1fe5260f2fd2acf397dfded"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-devpi-process \
python3.10dist(devpi-process) \
python310-devpi-process \
python3dist(devpi-process)"
RDEPENDS:${PN} += "python(abi) \
python310-devpi-client \
python310-devpi-server"

inherit rpm
