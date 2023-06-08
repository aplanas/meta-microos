SUMMARY = "A Jupyter widget for dynamic Leaflet maps"
DESCRIPTION = "A Jupyter / Leaflet bridge enabling interactive maps in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "python39-ipyleaflet-0.17.2-1.4.noarch.rpm"
RPM_HASH = "28eb18d6faa425a2a6f937cea3894d14f5b3fd957c5d86bb0825db3e7da1ff728765114aa0684fdc7815302567add359a2e56c9df77c13143ca6899590f80ec2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ipyleaflet) python39-ipyleaflet python3dist(ipyleaflet)"
RDEPENDS:${PN} += "(python39-ipywidgets >= 7.6.0 with python39-ipywidgets < 9) (python39-traittypes >= 0.2.1 with python39-traittypes < 3) jupyter-ipyleaflet python(abi) python39-branca python39-xyzservices"

inherit rpm
