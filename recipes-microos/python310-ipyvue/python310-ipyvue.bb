SUMMARY = "Jupyter widgets base for Vue libraries"
DESCRIPTION = "Jupyter widgets base for Vue libraries"
LICENSE = "MIT"

PV = "1.9.1"

RPM_NAME = "python310-ipyvue-1.9.1-1.1.noarch.rpm"
RPM_HASH = "7aee4af3f9b6c629f3e1d917262c3a55a08575550a13328b85f6a433205e2ed641b1d6fb7dae0fae36ea107234b83bc18a0ae50987dc770920ef9eefbb538b42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyvue python3.10dist(ipyvue) python310-ipyvue python3dist(ipyvue)"
RDEPENDS:${PN} += "python(abi) python310-ipywidgets"

inherit rpm
