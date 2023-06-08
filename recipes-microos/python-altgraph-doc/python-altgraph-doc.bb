SUMMARY = "Documentation for python-altgraph"
DESCRIPTION = "Altgraph is a fork of graphlib: a graph (network) package for constructing \
graphs, BFS and DFS traversals, topological sort, shortest paths, etc. with \
graphviz output."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "python-altgraph-doc-0.17.3-1.3.noarch.rpm"
RPM_HASH = "15a8440d3f0d8def06fb197240e0c3a87e6115c69229a1cf1c99def38db991d264b71836fd23f02a9efb3f05ad73cdae8bb2ab61bf1c83d2c58ed4251b6895da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-altgraph-doc python310-altgraph-doc python311-altgraph-doc python39-altgraph-doc"
RDEPENDS:${PN} += ""

inherit rpm
