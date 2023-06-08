SUMMARY = "Bootstrap-based Sphinx theme from the PyData community"
DESCRIPTION = "Bootstrap-based Sphinx theme from the PyData community"
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python311-pydata-sphinx-theme-0.13.1-1.3.noarch.rpm"
RPM_HASH = "54e324e3afb52edcaa821b63cd271c4592110096615841131ec48b53ffa5e7c4217ae6ce03c1a8e93cfa00ab6a8368a3b434fc420c80973eb0143a5f99cd2a0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pydata-sphinx-theme) python311-pydata-sphinx-theme python3dist(pydata-sphinx-theme)"
RDEPENDS:${PN} += "python(abi) python311-Sphinx python311-beautifulsoup4 python311-docutils python311-sphinx-theme-builder"

inherit rpm
