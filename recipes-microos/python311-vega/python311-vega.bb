SUMMARY = "An IPython/Jupyter widget for Vega 3 and Vega-Lite 2"
DESCRIPTION = "IPython/Jupyter notebook module for Vega and Vega-Lite, \
Polestar, and Voyager. Notebooks with embedded visualizations \
can be viewed on github and nbviewer."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "python311-vega-4.0.0-2.1.noarch.rpm"
RPM_HASH = "6b18ae55d0c85f1477a718bbb6978ea7ed694979b5563209364c460f5beab18e9473a5d0eb52495bf7ea210d36112555a429c1e60c14779954185ee2c375786f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(vega) \
python311-jupyter_vega \
python311-vega \
python3dist(vega)"
RDEPENDS:${PN} += "python(abi) \
python311-ipytablewidgets \
python311-jupyter \
python311-pandas"

inherit rpm
