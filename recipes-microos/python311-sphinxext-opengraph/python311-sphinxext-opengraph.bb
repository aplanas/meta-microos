SUMMARY = "Sphinx Extension to enable OGP support"
DESCRIPTION = "Sphinx Extension to enable OGP support"
LICENSE = "MIT"

PV = "0.7.5"

RPM_NAME = "python311-sphinxext-opengraph-0.7.5-1.3.noarch.rpm"
RPM_HASH = "a482382b42a269d17b28f2b2475db25b0fcb19521ab73c62865436cab617f1d3844c12dd1ec5d2651433d249275abf0dcb0047c7115cd5c21150a08c6dfba61b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxext-opengraph) python311-sphinxext-opengraph python3dist(sphinxext-opengraph)"
RDEPENDS:${PN} += "python(abi) python3-Sphinx"

inherit rpm
