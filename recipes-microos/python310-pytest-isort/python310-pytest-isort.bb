SUMMARY = "Pytest plugin to check import ordering using isort"
DESCRIPTION = "This is a pytest plugin to check import ordering using isort."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python310-pytest-isort-3.1.0-1.3.noarch.rpm"
RPM_HASH = "5a65592a4ce7e542f2d6716a998dd14d3523775a4795d337200ec3d297a784f786280f9b3c6fa42fa7bf226f2976301b570c6df0aa21275a570f2edb6abb294c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-isort python3.10dist(pytest-isort) python310-pytest-isort python3dist(pytest-isort)"
RDEPENDS:${PN} += "python(abi) python310-isort python310-pytest"

inherit rpm
