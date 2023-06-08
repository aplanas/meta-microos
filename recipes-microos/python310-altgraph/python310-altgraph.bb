SUMMARY = "Python graph (network) package"
DESCRIPTION = "Altgraph is a fork of graphlib: a graph (network) package for constructing \
graphs, BFS and DFS traversals, topological sort, shortest paths, etc. with \
graphviz output."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "python310-altgraph-0.17.3-1.3.noarch.rpm"
RPM_HASH = "f009ec89612e4bf1472b1845e1d20719cd0da4e20fac3b893a6a6058ca15f52682b86f966183211650ee16fba8606f6e1be4fb956cb7d931b3cae55e1f0e675a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-altgraph python3.10dist(altgraph) python310-altgraph python3dist(altgraph)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
