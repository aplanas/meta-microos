SUMMARY = "Sphinx Extension to enable OGP support"
DESCRIPTION = "Sphinx Extension to enable OGP support"
LICENSE = "MIT"

PV = "0.7.5"

RPM_NAME = "python310-sphinxext-opengraph-0.7.5-1.3.noarch.rpm"
RPM_HASH = "0078ceff7bf83df661340cebe1ba866980615202a7ad550ddaa3f47859b65975cd1c87dece81f71734a942f76a73e82281b804b090c52f012f4ed52e19ccc163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxext-opengraph \
python3.10dist(sphinxext-opengraph) \
python310-sphinxext-opengraph \
python3dist(sphinxext-opengraph)"
RDEPENDS:${PN} += "python(abi) \
python3-Sphinx"

inherit rpm
