SUMMARY = "Pytest support for curio"
DESCRIPTION = "Pytest support for curio."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "python310-pytest-curio-1.0.1-1.8.noarch.rpm"
RPM_HASH = "f2da4829af6c41ae3107712d556d2c119b32dec08863ba72f64c8612ea4ca5a6e0eb45097b605db7870462a50a2394f593646e89863001c152b97662b6ce5595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-curio python3.10dist(pytest-curio) python310-pytest-curio python3dist(pytest-curio)"
RDEPENDS:${PN} += "python(abi) python310-curio python310-pytest"

inherit rpm
