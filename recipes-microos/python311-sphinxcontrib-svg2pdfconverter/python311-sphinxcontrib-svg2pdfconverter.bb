SUMMARY = "Sphinx SVG to PDF converter extension"
DESCRIPTION = "Sphinx SVG to PDF converter extension"
LICENSE = "BSD-2-Clause"

PV = "1.2.2"

RPM_NAME = "python311-sphinxcontrib-svg2pdfconverter-1.2.2-1.1.noarch.rpm"
RPM_HASH = "fa85f0e8c9ca32b631e3d4464ce34b057280522dfae900fde6179a45087009ddb5d2a7b729693186621aef146d98e04f0974260743e771485e656d007980857b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-svg2pdfconverter) python311-sphinxcontrib-svg2pdfconverter python3dist(sphinxcontrib-svg2pdfconverter)"
RDEPENDS:${PN} += "python(abi) python311-Sphinx"

inherit rpm
