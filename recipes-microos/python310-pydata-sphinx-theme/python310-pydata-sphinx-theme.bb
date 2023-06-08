SUMMARY = "Bootstrap-based Sphinx theme from the PyData community"
DESCRIPTION = "Bootstrap-based Sphinx theme from the PyData community"
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python310-pydata-sphinx-theme-0.13.1-1.3.noarch.rpm"
RPM_HASH = "12fbd9b4705a39fe022661d16f05f5781f3304d9d6dc1d577b2cd7831ac9ecab2a9473c2c522e99dda4cb08eafe487c2c9ef358b14110838c6f1b37970f89665"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydata-sphinx-theme python3.10dist(pydata-sphinx-theme) python310-pydata-sphinx-theme python3dist(pydata-sphinx-theme)"
RDEPENDS:${PN} += "python(abi) python310-Sphinx python310-beautifulsoup4 python310-docutils python310-sphinx-theme-builder"

inherit rpm
