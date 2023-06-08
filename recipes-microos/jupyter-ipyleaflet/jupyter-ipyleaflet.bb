SUMMARY = "A Jupyter widget for dynamic Leaflet maps - Jupyter files"
DESCRIPTION = "A Jupyter / Leaflet bridge enabling interactive maps in the Jupyter notebook. \
 \
This package provides the extensions for jupyter notebook and jupyterlab."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "jupyter-ipyleaflet-0.17.2-1.4.noarch.rpm"
RPM_HASH = "d54a69d874b829dc371020dc326b9038862ef1e447cabb0aa4933366005e202c1dfe3362e97ee746c4b7c690e1f7ba8e4266be6823e7a98d1d223491b18e8625"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyleaflet jupyter-leaflet"
RDEPENDS:${PN} += "(jupyter-ipywidgets >= 7.6.0 with jupyter-ipywidgets < 9) (jupyter-jupyterlab or jupyter-notebook) python3-ipyleaflet"

inherit rpm
