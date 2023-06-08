SUMMARY = "Package for physical quantities with units"
DESCRIPTION = "Support for physical quantities with units, based on numpy."
LICENSE = "BSD-3-Clause"

PV = "0.14.0"

RPM_NAME = "python310-quantities-0.14.0-1.5.noarch.rpm"
RPM_HASH = "f60009ee0cb554940d9e6ba2dc94cc38263afcd123c341ad07615783a24c6566bb3ea15a7589038c82c9c4c5beae46e07cee948bb7930a66febeb4a3f202e329"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-quantities python3.10dist(quantities) python310-quantities python3dist(quantities)"
RDEPENDS:${PN} += "python(abi) python310-numpy"

inherit rpm
