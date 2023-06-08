SUMMARY = "A Jupyter widget for dynamic Leaflet maps"
DESCRIPTION = "A Jupyter / Leaflet bridge enabling interactive maps in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "python311-ipyleaflet-0.17.2-1.4.noarch.rpm"
RPM_HASH = "63b3cca73e96ab0b96dc78aa90f1717a27056ef6b4ee007db25c53d18b959c146462a5cf3e7a89604135b319a3a4063907b19e712efc5cef298ee9a4168503f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ipyleaflet) python311-ipyleaflet python3dist(ipyleaflet)"
RDEPENDS:${PN} += "(python311-ipywidgets >= 7.6.0 with python311-ipywidgets < 9) (python311-traittypes >= 0.2.1 with python311-traittypes < 3) jupyter-ipyleaflet python(abi) python311-branca python311-xyzservices"

inherit rpm
