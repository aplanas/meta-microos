SUMMARY = "Jupyter notebook integration for python311-plotly"
DESCRIPTION = "Use this package to make collaborative, interactive, \
publication-quality graphs from Python on https://plot.ly. \
 \
Plotly is an online collaborative data analysis and graphing tool. The \
Python API allows you to access all of Plotly's functionality from Python. \
Plotly figures are shared, tracked, and edited all online and the data is \
always accessible from the graph. \
 \
This package provides Jupyterlab and Notebook integration and widgets."
LICENSE = "MIT"

PV = "5.13.1"

RPM_NAME = "python311-plotly-jupyter-5.13.1-1.2.noarch.rpm"
RPM_HASH = "1bdae93c2c6cdd23b130a8fa892f15449841559e79cd557e642e45712f01797f546c59c205d8e90bae4caa07013bf67c7dbc7e98363355501a01b568b3b9e19e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-jupyterlab-plotly python311-plotly-jupyter"
RDEPENDS:${PN} += "(python311-jupyterlab >= 3 or python311-notebook >= 5.3) jupyter-plotly python(abi) python311-ipywidgets python311-plotly"

inherit rpm
