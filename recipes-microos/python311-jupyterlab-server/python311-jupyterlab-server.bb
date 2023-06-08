SUMMARY = "Server components for JupyterLab and JupyterLab-like applications"
DESCRIPTION = "JupyterLab Server sits between JupyterLab and Jupyter Server, \
and provides a set of REST API handlers and utilities that are \
used by JupyterLab. It is a separate project in order to \
accommodate creating JupyterLab-like applications from a more \
limited scope."
LICENSE = "BSD-3-Clause"

PV = "2.22.1"

RPM_NAME = "python311-jupyterlab-server-2.22.1-1.1.noarch.rpm"
RPM_HASH = "f2e41e202e545eda3b7660564f0e2a0e218cb157717d84298a3e76fdc70eac49b4f698f9561a17e0f2409f03b14e63a94256a85a74ae8179ee9e24c4ff29f1ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jupyterlab-server) python311-jupyter-jupyterlab-server python311-jupyter_jupyterlab_launcher python311-jupyter_jupyterlab_server python311-jupyterlab-server python311-jupyterlab_server python3dist(jupyterlab-server)"
RDEPENDS:${PN} += "(python311-jupyter-server >= 1.21 with python311-jupyter-server < 3) python(abi) python311-Babel python311-Jinja2 python311-json5 python311-jsonschema python311-packaging python311-requests"

inherit rpm
