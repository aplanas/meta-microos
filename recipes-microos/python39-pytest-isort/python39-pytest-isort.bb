SUMMARY = "Pytest plugin to check import ordering using isort"
DESCRIPTION = "This is a pytest plugin to check import ordering using isort."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python39-pytest-isort-3.1.0-1.3.noarch.rpm"
RPM_HASH = "a80953b363d334ed8bfd042fe38b0535ce3ff6d355ea83dbe30557741906c6d2ec0462d6b2b53f0258af96fd177be6664027e797aa1fb89788a96c41f60b8d57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-isort) python39-pytest-isort python3dist(pytest-isort)"
RDEPENDS:${PN} += "python(abi) python39-isort python39-pytest"

inherit rpm
