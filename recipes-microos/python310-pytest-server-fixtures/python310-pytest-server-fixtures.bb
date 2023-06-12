SUMMARY = "Extensible server fixtures for pytest"
DESCRIPTION = "Extensible server fixtures for pytest"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-pytest-server-fixtures-1.7.0-8.4.noarch.rpm"
RPM_HASH = "33a42e4d0f57bae802ef9c6b3da2a0881f87660deb7ad2ed2b3efba3f165b96108ee62006212a4a662f8b27fb6e0b2e34104a0682d8132f898864f56a4b8f8da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-server-fixtures \
python3.10dist(pytest-server-fixtures) \
python310-pytest-server-fixtures \
python3dist(pytest-server-fixtures)"
RDEPENDS:${PN} += "lsof \
net-tools-deprecated \
python(abi) \
python310-future \
python310-psutil \
python310-pytest \
python310-pytest-fixture-config \
python310-pytest-shutil \
python310-requests \
python310-retry"

inherit rpm
