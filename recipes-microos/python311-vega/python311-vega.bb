SUMMARY = "An IPython/Jupyter widget for Vega 3 and Vega-Lite 2"
DESCRIPTION = "IPython/Jupyter notebook module for Vega and Vega-Lite, \
Polestar, and Voyager. Notebooks with embedded visualizations \
can be viewed on github and nbviewer."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "python311-vega-4.0.0-1.1.noarch.rpm"
RPM_HASH = "e0129682b88eb163c498b955ccacf47150dea368ae0cc67a0b94bef7ce4b9c7c4a0c2174d7250e31213c4dc308a8c06b1e2b70aefcfa7a008f2340e6a8d66ecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(vega) python311-jupyter_vega python311-vega python3dist(vega)"
RDEPENDS:${PN} += "python(abi) python311-ipytablewidgets python311-jupyter python311-pandas"

inherit rpm
