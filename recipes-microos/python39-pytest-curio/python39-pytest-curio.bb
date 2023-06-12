SUMMARY = "Pytest support for curio"
DESCRIPTION = "Pytest support for curio."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "python39-pytest-curio-1.0.1-1.8.noarch.rpm"
RPM_HASH = "5f9906b2adf795ac83d06cc06dc5d1059fa65ec7ad8843c95cd59b835f62d0e3b4b0ce2f489e71d88339ca9c84141ab3a33519d57ff9aaece889083718ff7a65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-curio) \
python39-pytest-curio \
python3dist(pytest-curio)"
RDEPENDS:${PN} += "python(abi) \
python39-curio \
python39-pytest"

inherit rpm
