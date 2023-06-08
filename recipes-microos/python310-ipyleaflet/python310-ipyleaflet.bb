SUMMARY = "A Jupyter widget for dynamic Leaflet maps"
DESCRIPTION = "A Jupyter / Leaflet bridge enabling interactive maps in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "python310-ipyleaflet-0.17.2-1.4.noarch.rpm"
RPM_HASH = "f7024c16446f7e14d10c1c875c3a8d6e468445fe6f328272f46032df35e9029689b31942e60f14ce8940fece2ba624f25c0118ecee8b36cb08232f77554d463c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyleaflet python3.10dist(ipyleaflet) python310-ipyleaflet python3dist(ipyleaflet)"
RDEPENDS:${PN} += "(python310-ipywidgets >= 7.6.0 with python310-ipywidgets < 9) (python310-traittypes >= 0.2.1 with python310-traittypes < 3) jupyter-ipyleaflet python(abi) python310-branca python310-xyzservices"

inherit rpm
