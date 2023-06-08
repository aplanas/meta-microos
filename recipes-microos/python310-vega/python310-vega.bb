SUMMARY = "An IPython/Jupyter widget for Vega 3 and Vega-Lite 2"
DESCRIPTION = "IPython/Jupyter notebook module for Vega and Vega-Lite, \
Polestar, and Voyager. Notebooks with embedded visualizations \
can be viewed on github and nbviewer."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "python310-vega-4.0.0-1.1.noarch.rpm"
RPM_HASH = "178740e7330501d29eeca01e33dfb92f8c59464b9d1389e2d2598429f6974bdd28565d8d32439339674c46006dc1d96a69cfa6d7bc04f4613f2f642d258ba912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-vega python3-jupyter_vega python3-vega python3.10dist(vega) python310-jupyter_vega python310-vega python3dist(vega)"
RDEPENDS:${PN} += "python(abi) python310-ipytablewidgets python310-jupyter python310-pandas"

inherit rpm
