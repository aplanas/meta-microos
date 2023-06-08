SUMMARY = "Pytest plugin to run pycodestyle"
DESCRIPTION = "pytest plugin to run pycodestyle in python tests"
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python39-pytest-pycodestyle-2.3.1-1.3.noarch.rpm"
RPM_HASH = "3ff625198eb1c2e128f227f65c2501d9ec3123890b6c7fcc2bc4e48bac8ecb43577be0560ef08b5d616b1d8dd4fd35e0a648d2ef88a0ee8e4b9f8475daf55251"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-pycodestyle) python39-pytest-codestyle python39-pytest-pycodestyle python3dist(pytest-pycodestyle)"
RDEPENDS:${PN} += "python(abi) python39-py python39-pycodestyle python39-pytest python39-setuptools"

inherit rpm
