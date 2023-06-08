SUMMARY = "Stylesheet Generator for PyQt{4-5}/PySide{1-2}"
DESCRIPTION = "A python package designed to help with the construction of PyQt/PySide stylesheets."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python310-qstylizer-0.2.2-1.3.noarch.rpm"
RPM_HASH = "24d1a8441a80e577446db563cb23cd25e2b81ad394cc0a0833b0b07718190057cd9ed8024e02534233f3411b56602dd3d0ca5cf4c29b98259cc65ebfe7118d89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qstylizer python3.10dist(qstylizer) python310-qstylizer python3dist(qstylizer)"
RDEPENDS:${PN} += "python(abi) python310-inflection python310-tinycss2"

inherit rpm
