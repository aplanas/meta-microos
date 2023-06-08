SUMMARY = "Pytest plugin for test session metadata"
DESCRIPTION = "Pytest plugin for test session metadata."
LICENSE = "MPL-2.0"

PV = "2.0.4"

RPM_NAME = "python310-pytest-metadata-2.0.4-1.3.noarch.rpm"
RPM_HASH = "8da400f5b87488697e5c7e4316a367470d34ecc5a9c6efafcf0e244eb475406bd5e49f1545afb8f5cba6ca30a9b5d1905bbfa50caa8150842d0484f5f4932eb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-metadata python3.10dist(pytest-metadata) python310-pytest-metadata python3dist(pytest-metadata)"
RDEPENDS:${PN} += "python(abi) python310-pytest"

inherit rpm
