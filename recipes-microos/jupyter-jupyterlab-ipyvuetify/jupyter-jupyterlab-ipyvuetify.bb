SUMMARY = "Jupyter widgets based on vuetify UI components - labextension"
DESCRIPTION = "Jupyter widgets based on vuetify UI components \
 \
This package provides the jupyterlab extension."
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "jupyter-jupyterlab-ipyvuetify-1.8.10-2.1.noarch.rpm"
RPM_HASH = "12c6c588fc5e12e5c96426cadc20737c26658261dc5d39adedb29ccca7b6bef1fd862b30eaa9f7b3e66f6f8a94e6a8b1c2097a5dc648f76261fcefcd79b62fb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-ipyvuetify"
RDEPENDS:${PN} += "jupyter-jupyterlab python3dist(ipyvuetify)"

inherit rpm
