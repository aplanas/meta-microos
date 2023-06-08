SUMMARY = "Bootstrap-based Sphinx theme from the PyData community"
DESCRIPTION = "Bootstrap-based Sphinx theme from the PyData community"
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python39-pydata-sphinx-theme-0.13.1-1.3.noarch.rpm"
RPM_HASH = "5536eaf49dd89463ccd70d8bf614f8698264402b0917871ed5d64027da37d3d8df9ba1a2995d0895e843ff2211a6327dee79b8a9e8d55e3cdc5fd4e41190e90b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pydata-sphinx-theme) python39-pydata-sphinx-theme python3dist(pydata-sphinx-theme)"
RDEPENDS:${PN} += "python(abi) python39-Sphinx python39-beautifulsoup4 python39-docutils python39-sphinx-theme-builder"

inherit rpm
