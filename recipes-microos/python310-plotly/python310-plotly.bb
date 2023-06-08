SUMMARY = "Library for collaborative, interactive, publication-quality graphs"
DESCRIPTION = "Use this package to make collaborative, interactive, \
publication-quality graphs from Python on https://plot.ly. \
 \
Plotly is an online collaborative data analysis and graphing tool. The \
Python API allows you to access all of Plotly's functionality from Python. \
Plotly figures are shared, tracked, and edited all online and the data is \
always accessible from the graph."
LICENSE = "MIT"

PV = "5.13.1"

RPM_NAME = "python310-plotly-5.13.1-1.2.noarch.rpm"
RPM_HASH = "83e2a5cd48febf8130da4a814d0d35c36c997e1074a9c3f781ec11f5e83826f39eb667c8f7ca7163b204a5140636397a6b2c75f1de09b8ad323d17947ed46791"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-plotly python3.10dist(plotly) python310-plotly python3dist(plotly)"
RDEPENDS:${PN} += "python(abi) python310-tenacity"

inherit rpm
