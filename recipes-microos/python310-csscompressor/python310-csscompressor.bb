SUMMARY = "A python port of YUI CSS Compressor"
DESCRIPTION = "Almost exact python port of YUI CSS Compressor."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "python310-csscompressor-0.9.5-2.3.noarch.rpm"
RPM_HASH = "c82de6d3fd4ecfb2e451f1c800ced347f749d648ed94d62623cf88799c3d1d2baecdf5d4befb00b515a5bdc84cf1afdea652e6a812bc313fe664b824633d5891"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-csscompressor python3.10dist(csscompressor) python310-csscompressor python3dist(csscompressor)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
