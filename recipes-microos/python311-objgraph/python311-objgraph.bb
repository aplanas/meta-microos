SUMMARY = "Python module to draw object reference graphs with graphviz"
DESCRIPTION = "objgraph is a module for visual exploration of Python object graphs. \
 \
graphviz is needed if pretty graphs are desired. \
xdot can be used for interactive use."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "python311-objgraph-3.5.0-2.1.noarch.rpm"
RPM_HASH = "e36f4222632278372bb0df3cf9e04c36eaa2a4f6af0f7de58f2e29b3edbfe1086991ae93aaa4ecd5fec0a01fd941746338759e2c29051cd567d273e8b1a6ceb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(objgraph) \
python311-objgraph \
python3dist(objgraph)"
RDEPENDS:${PN} += "graphviz-gd \
graphviz-gnome \
python(abi) \
python311-graphviz"

inherit rpm
