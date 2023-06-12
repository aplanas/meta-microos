SUMMARY = "A JupyterLab extension for Jupyter/IPython widgets - Jupyter JS files"
DESCRIPTION = "A JupyterLab 3.0 extension for Jupyter/IPython widgets - Jupyterlab-manager JS files"
LICENSE = "BSD-3-Clause"

PV = "3.0.7"

RPM_NAME = "jupyter-jupyterlab-widgets-3.0.7-1.1.noarch.rpm"
RPM_HASH = "0878b7cfe18910ae6718262106b9c415339b9f536a6c3b348d0ed440717b2dea9dba1def76e11bebcd18438887e5f61f8ed5157403751d203ce7ef9233472cbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-widgets-jupyterlab-manager \
jupyter-jupyterlab-widgets \
jupyter-jupyterlab_widgets"
RDEPENDS:${PN} += "jupyter-jupyterlab-filesystem"

inherit rpm
