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

RPM_NAME = "python311-plotly-5.13.1-1.2.noarch.rpm"
RPM_HASH = "99d4270dac2095c68e2f918dc49f5c72cc6ad6eba3b2ba4d0f9058436461457cfe0ae61ec7328cf0729cde08b7fa40cdd0e7fdb73839d4a59f26f2956730b21d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(plotly) python311-plotly python3dist(plotly)"
RDEPENDS:${PN} += "python(abi) python311-tenacity"

inherit rpm
