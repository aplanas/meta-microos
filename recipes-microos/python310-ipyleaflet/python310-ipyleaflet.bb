SUMMARY = "A Jupyter widget for dynamic Leaflet maps"
DESCRIPTION = "A Jupyter / Leaflet bridge enabling interactive maps in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "python310-ipyleaflet-0.17.2-1.5.noarch.rpm"
RPM_HASH = "212685abd30c5a34269c3edc525bc5d6065e2553db14c6c26b4d3c775c307091130781035892122ac8348c58d04a8cab332430990c5fd1ae1c395c04d425f3a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyleaflet \
python3.10dist(ipyleaflet) \
python310-ipyleaflet \
python3dist(ipyleaflet)"
RDEPENDS:${PN} += "(python310-ipywidgets >= 7.6.0 with python310-ipywidgets < 9) \
(python310-traittypes >= 0.2.1 with python310-traittypes < 3) \
jupyter-ipyleaflet \
python(abi) \
python310-branca \
python310-xyzservices"

inherit rpm
