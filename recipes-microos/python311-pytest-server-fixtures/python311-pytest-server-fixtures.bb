SUMMARY = "Extensible server fixtures for pytest"
DESCRIPTION = "Extensible server fixtures for pytest"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-pytest-server-fixtures-1.7.0-8.4.noarch.rpm"
RPM_HASH = "501d32a32f60191e7a80ebb5532d21d6248e5455b136e846400fc952cc271871fe07fd7ea917b8909c784aace03359e183f614be6102a13ab5573a5b607d510a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-server-fixtures) python311-pytest-server-fixtures python3dist(pytest-server-fixtures)"
RDEPENDS:${PN} += "lsof net-tools-deprecated python(abi) python311-future python311-psutil python311-pytest python311-pytest-fixture-config python311-pytest-shutil python311-requests python311-retry"

inherit rpm
