SUMMARY = "Parameterized testing"
DESCRIPTION = "Parameterized testing with any Python test framework."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "python310-parameterized-0.8.1-4.1.noarch.rpm"
RPM_HASH = "2c22638287d6b1cff71b908d10313a3dbc95b6924b5b51ffc42599868d18c9f4eecdadd0d3d90e54905b73894c8fce53c57a3a691c78f01673c77ddb56d9d9aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parameterized python3.10dist(parameterized) python310-parameterized python3dist(parameterized)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
