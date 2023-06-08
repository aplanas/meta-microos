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

RPM_NAME = "python39-plotly-5.13.1-1.2.noarch.rpm"
RPM_HASH = "1f00f25113b882688d7aafb739e8ae44e4f0d6c2f6833239611712da08f2ae703f347edf1925d81c2e8c310f32ead3d3e6eeec3beb99dc475a8da30d90227c2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(plotly) python39-plotly python3dist(plotly)"
RDEPENDS:${PN} += "python(abi) python39-tenacity"

inherit rpm
