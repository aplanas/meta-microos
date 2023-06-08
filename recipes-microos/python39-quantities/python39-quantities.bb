SUMMARY = "Package for physical quantities with units"
DESCRIPTION = "Support for physical quantities with units, based on numpy."
LICENSE = "BSD-3-Clause"

PV = "0.14.0"

RPM_NAME = "python39-quantities-0.14.0-1.5.noarch.rpm"
RPM_HASH = "972009944d19c03810a5a3cd67d2b41439c905248c12cc8a3112568e246b809a91aa3fb7ba2dc0ec439a99a9967c5526b4549d2598bbead7501b77a3fe77a775"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(quantities) python39-quantities python3dist(quantities)"
RDEPENDS:${PN} += "python(abi) python39-numpy"

inherit rpm
