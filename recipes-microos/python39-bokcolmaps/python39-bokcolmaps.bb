SUMMARY = "Colourmap plots based on the Bokeh visualisation library"
DESCRIPTION = "Colourmap plots based on the Bokeh visualisation library"
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python39-bokcolmaps-2.0.1-2.9.noarch.rpm"
RPM_HASH = "0e0f64cf38de9422073ecbc55bdaf34d3cf4f9abd6e611855c029390231b5f0bddf27abee1257bcd7c57a159f270c9a73ee44a94a8be7ca68031e8791c0a9db8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(bokcolmaps) python39-bokcolmaps python3dist(bokcolmaps)"
RDEPENDS:${PN} += "python(abi) python39-bokeh python39-numpy"

inherit rpm
