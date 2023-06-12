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

RPM_NAME = "python311-plotly-5.13.1-1.3.noarch.rpm"
RPM_HASH = "3e81e15bade9119d35ce5b87a124f0e41aca11b44bd91132ca94eff615e4c3a5f5fe4a9a24c2caf51af9179678d250956617a0eabda1c58ab1c18df379619838"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(plotly) python311-plotly python3dist(plotly)"
RDEPENDS:${PN} += "python(abi) python311-tenacity"

inherit rpm
