SUMMARY = "Jupyter notebook integration for python310-plotly"
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

RPM_NAME = "python310-plotly-jupyter-5.13.1-1.2.noarch.rpm"
RPM_HASH = "11dd33d0cad3a56c9a51011fe3dc635915b2e75c76470172f2df2f3ae20618e1df4bc23030c72b490701340b6d1078efc39da388a65b8bbe837d4e01ee8601c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyterlab-plotly python3-plotly-jupyter python310-jupyterlab-plotly python310-plotly-jupyter"
RDEPENDS:${PN} += "(python310-jupyterlab >= 3 or python310-notebook >= 5.3) jupyter-plotly python(abi) python310-ipywidgets python310-plotly"

inherit rpm
