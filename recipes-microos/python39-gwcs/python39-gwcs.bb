SUMMARY = "Generalized World Coordinate System"
DESCRIPTION = "An Astropy affiliated package providing tools for managing the \
World Coordinate System of astronomical data."
LICENSE = "BSD-3-Clause"

PV = "0.18.3"

RPM_NAME = "python39-gwcs-0.18.3-1.3.noarch.rpm"
RPM_HASH = "faad5ca676ef0b8be2c8bbf413552e95a1e1bb11503d97e458fef175cba6a2a55141eb17de2dab605dcb6b077767543940df3e9bd4e86dd1859dd50ce89e49e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(gwcs) python39-gwcs python3dist(gwcs)"
RDEPENDS:${PN} += "python(abi) python39-asdf python39-asdf-astropy python39-asdf_wcs_schemas python39-astropy python39-numpy python39-scipy"

inherit rpm
