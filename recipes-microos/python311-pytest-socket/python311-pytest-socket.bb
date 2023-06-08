SUMMARY = "Pytest Plugin to disable socket"
DESCRIPTION = "A Pytest Plugin to disable socket calls during tests."
LICENSE = "MIT"

PV = "0.3.5"

RPM_NAME = "python311-pytest-socket-0.3.5-1.12.noarch.rpm"
RPM_HASH = "e5a611c55aac9bd46370afc9bb7ae5a777bf5e4d080deed4557455559e171cd777559154c0cb8b88d472b7d8cf8dae1d4f8c91150f64417c1495f5a7b8da2d26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-socket) python311-pytest-socket python3dist(pytest-socket)"
RDEPENDS:${PN} += "python(abi) python311-pytest"

inherit rpm
