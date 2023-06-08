SUMMARY = "An IPython/Jupyter widget for Vega 3 and Vega-Lite 2"
DESCRIPTION = "IPython/Jupyter notebook module for Vega and Vega-Lite, \
Polestar, and Voyager. Notebooks with embedded visualizations \
can be viewed on github and nbviewer."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "python39-vega-4.0.0-1.1.noarch.rpm"
RPM_HASH = "a0e526a7852dd274029425461b8de763b78b9816680afb7134ad5e475d093e6c6fc0ec3ca7e37df94e697a4b20cfd43a14fa288dbf837013c2855cfc7e0d134a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(vega) python39-jupyter_vega python39-vega python3dist(vega)"
RDEPENDS:${PN} += "python(abi) python39-ipytablewidgets python39-jupyter python39-pandas"

inherit rpm
