SUMMARY = "Spreadsheet widget for the Jupyter notebook - Jupyterfiles"
DESCRIPTION = "A Jupyter widget providing spreadsheets for the Jupyter notebook. \
 \
This package provides the extensions for jupyter notebook and jupyterlab."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "jupyter-ipysheet-0.7.0-1.4.noarch.rpm"
RPM_HASH = "978eac110c4dcfa05c7db3a6d1be2cabf6a6424491c6bb861de802f0c47fd96407c1c2af7cab19e43b82d58d4238b35ca4e02ed9e2fb0a6126efbc4db9a0ca3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipysheet"
RDEPENDS:${PN} += "(jupyter-ipywidgets >= 7.5.0 with jupyter-ipywidgets < 9) (jupyter-jupyterlab or jupyter-notebook) python3-ipysheet"

inherit rpm
