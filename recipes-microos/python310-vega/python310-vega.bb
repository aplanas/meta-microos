SUMMARY = "An IPython/Jupyter widget for Vega 3 and Vega-Lite 2"
DESCRIPTION = "IPython/Jupyter notebook module for Vega and Vega-Lite, \
Polestar, and Voyager. Notebooks with embedded visualizations \
can be viewed on github and nbviewer."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "python310-vega-4.0.0-2.1.noarch.rpm"
RPM_HASH = "e6d92a5d5fa65e4ec6b7cd776710ed9546e62606010388b798574faa6173d50c3ef9ab2aed89a5a95c02cd1887aa2adbcefb37df90b0478192f8cabc9b58e565"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-vega python3-jupyter_vega python3-vega python3.10dist(vega) python310-jupyter_vega python310-vega python3dist(vega)"
RDEPENDS:${PN} += "python(abi) python310-ipytablewidgets python310-jupyter python310-pandas"

inherit rpm
