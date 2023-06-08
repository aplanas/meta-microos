SUMMARY = "A JupyterLab extension for Jupyter/IPython widgets"
DESCRIPTION = "A JupyterLab 3.0 extension for Jupyter/IPython widgets"
LICENSE = "BSD-3-Clause"

PV = "3.0.7"

RPM_NAME = "python310-jupyterlab-widgets-3.0.7-1.1.noarch.rpm"
RPM_HASH = "92ee506e3ef73167f659d3c6e4daf0a775b9d7ce2738799c549beafd5b97fb7266d47808cd259875f04774d9a3574f32bedd171bd31d58ef5f506a1f11be1b0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyterlab-widgets python3-jupyterlab_widgets python3.10dist(jupyterlab-widgets) python310-jupyterlab-widgets python310-jupyterlab_widgets python3dist(jupyterlab-widgets)"
RDEPENDS:${PN} += "jupyter-jupyterlab-widgets python(abi)"

inherit rpm
