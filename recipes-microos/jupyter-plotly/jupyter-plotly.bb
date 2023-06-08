SUMMARY = "Jupyter notebook integration for python-plotly"
DESCRIPTION = "Use this package to make collaborative, interactive, \
publication-quality graphs from Python on https://plot.ly. \
 \
Plotly is an online collaborative data analysis and graphing tool. The \
Python API allows you to access all of Plotly's functionality from Python. \
Plotly figures are shared, tracked, and edited all online and the data is \
always accessible from the graph. \
 \
This package provides the flavorless configuration for the \
Jupyterlab and Notebook integration and widgets."
LICENSE = "MIT"

PV = "5.13.1"

RPM_NAME = "jupyter-plotly-5.13.1-1.2.noarch.rpm"
RPM_HASH = "76fc54fc7d6a5d081a35a3138291eac3d10b16fef79df677916b1c2ac71f7495639581d17a17368b26632bcb2defa60561172b2b1791e6c79c019794c65df1c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-plotly jupyterlab-plotly"
RDEPENDS:${PN} += "python3-plotly-jupyter"

inherit rpm
