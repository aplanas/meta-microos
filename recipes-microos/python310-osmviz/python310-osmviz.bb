SUMMARY = "An OpenStreetMap Visualization Toolkit for Python"
DESCRIPTION = "OSMViz is a small set of Python tools for retrieving and using Mapnik \
tiles from a Slippy Map server (you may know these as OpenStreetMap \
images)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-osmviz-1.1.0-3.7.noarch.rpm"
RPM_HASH = "6ed5ebf51cab3da2455ed7126bfa448bc470c5712d324eca3efa03af62c78b631e82f305a1eb112277f6b1bb0450d739a34e6284e1fdb062bc7523180a3cdea3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-osmviz python3.10dist(osmviz) python310-osmviz python3dist(osmviz)"
RDEPENDS:${PN} += "python(abi) python310-pygame"

inherit rpm
