SUMMARY = "Python interface for Graphviz"
DESCRIPTION = "This package facilitates the creation and rendering of graph descriptions in \
the DOT language of the Graphviz graph drawing software from Python. \
 \
It supports creating a graph object, assembling the graph by adding nodes and \
edges, and retrieving its DOT source code string, saving the source code to a \
file and rendering it with the Graphviz installation. \
 \
Using the view option/method, the resulting (PDF, PNG, SVG, etc.) file can be \
inspected with its default application. Graphs can also be rendered and \
displayed within IPython notebooks."
LICENSE = "MIT"

PV = "0.20.1"

RPM_NAME = "python39-graphviz-0.20.1-2.1.noarch.rpm"
RPM_HASH = "54e6cb304670a53d3dd9c6121cb5fa2e856b04b41a3151c223045c0df4abb90ea8aec29709bc118f314e5c863ee05f4cebeb10bdb3e471f2398ce9da9ca3e41e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(graphviz) python39-graphviz python3dist(graphviz)"
RDEPENDS:${PN} += "graphviz python(abi)"

inherit rpm
