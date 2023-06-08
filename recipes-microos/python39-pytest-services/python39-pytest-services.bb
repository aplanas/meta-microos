SUMMARY = "Services plugin for pytest testing framework"
DESCRIPTION = "The plugin provides a set of fixtures and utility functions to start service \
processes for your tests with pytest."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python39-pytest-services-2.2.1-2.6.noarch.rpm"
RPM_HASH = "8fcad02ab7bdcb77d9b8fe96dbf5e74d2399748cf172d414ced43f4ffd031bf34028aed161c8aec4df9b36400389a7e45063da8ea1ea4e4689acf66b7679dfd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-services) python39-pytest-services python3dist(pytest-services)"
RDEPENDS:${PN} += "python(abi) python39-psutil python39-pytest python39-requests python39-setuptools python39-zc.lockfile"

inherit rpm
