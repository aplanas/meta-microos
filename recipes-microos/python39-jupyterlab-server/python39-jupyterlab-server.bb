SUMMARY = "Server components for JupyterLab and JupyterLab-like applications"
DESCRIPTION = "JupyterLab Server sits between JupyterLab and Jupyter Server, \
and provides a set of REST API handlers and utilities that are \
used by JupyterLab. It is a separate project in order to \
accommodate creating JupyterLab-like applications from a more \
limited scope."
LICENSE = "BSD-3-Clause"

PV = "2.22.1"

RPM_NAME = "python39-jupyterlab-server-2.22.1-1.2.noarch.rpm"
RPM_HASH = "f5fb852111de091d55e500280c0ca5282276543a9b99e39d8c47e854cffa77360eeda9365dba7c1a23be9010c9b1ab3bbcb9d076cf96a8938246c56c2d2f8865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jupyterlab-server) python39-jupyter-jupyterlab-server python39-jupyter_jupyterlab_launcher python39-jupyter_jupyterlab_server python39-jupyterlab-server python39-jupyterlab_server python3dist(jupyterlab-server)"
RDEPENDS:${PN} += "(python39-jupyter-server >= 1.21 with python39-jupyter-server < 3) python(abi) python39-Babel python39-Jinja2 python39-importlib-metadata python39-json5 python39-jsonschema python39-packaging python39-requests"

inherit rpm
