SUMMARY = "Sphinx SVG to PDF converter extension"
DESCRIPTION = "Sphinx SVG to PDF converter extension"
LICENSE = "BSD-2-Clause"

PV = "1.2.2"

RPM_NAME = "python310-sphinxcontrib-svg2pdfconverter-1.2.2-1.1.noarch.rpm"
RPM_HASH = "885bbea3a3f146389f020e588366463eabd98b6967e3dd23e3a6e111f4c3991f74c582e9b07cc1b6bf494caf85e330491d28bf0413e1ff0662f2945f2ef3e726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-svg2pdfconverter python3.10dist(sphinxcontrib-svg2pdfconverter) python310-sphinxcontrib-svg2pdfconverter python3dist(sphinxcontrib-svg2pdfconverter)"
RDEPENDS:${PN} += "python(abi) python310-Sphinx"

inherit rpm
