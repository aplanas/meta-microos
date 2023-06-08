SUMMARY = "Jupyter notebook integration for python39-plotly"
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

RPM_NAME = "python39-plotly-jupyter-5.13.1-1.2.noarch.rpm"
RPM_HASH = "339a640de2c861aea4cbab7b42ff1183ea667d9b413135a08d428ddf384b575ebbfbb86c38daa4c305c076e9a6697162e9e62aada34335b662a59d2cefeb6715"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-jupyterlab-plotly python39-plotly-jupyter"
RDEPENDS:${PN} += "(python39-jupyterlab >= 3 or python39-notebook >= 5.3) jupyter-plotly python(abi) python39-ipywidgets python39-plotly"

inherit rpm
