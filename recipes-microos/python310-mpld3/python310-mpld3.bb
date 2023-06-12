SUMMARY = "D3 Viewer for Matplotlib"
DESCRIPTION = "This is an interactive D3js-based viewer which brings matplotlib graphics to the browser. \
Please visit http://mpld3.github.io for documentation and examples. \
 \
mpld3 provides a custom stand-alone javascript library built on D3, which \
parses JSON representations of plots.  The mpld3 python module provides a \
set of routines which parses matplotlib plots (using the mplexporter \
framework) and outputs the JSON description readable by mpld3.js."
LICENSE = "BSD-3-Clause"

PV = "0.5.9"

RPM_NAME = "python310-mpld3-0.5.9-1.3.noarch.rpm"
RPM_HASH = "8c59be6b8cafff57e344c75e2c71b9e537f462e75127496d674af9ec45b4eaa065e7e5d5bbff51387b22350af7b9f2807dc3d03bdccf8d268d7ba46084ea14a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mpld3 \
python3.10dist(mpld3) \
python310-mpld3 \
python3dist(mpld3)"
RDEPENDS:${PN} += "python(abi) \
python310-Jinja2 \
python310-matplotlib"

inherit rpm
