SUMMARY = "Server components for JupyterLab and JupyterLab-like applications"
DESCRIPTION = "JupyterLab Server sits between JupyterLab and Jupyter Server, \
and provides a set of REST API handlers and utilities that are \
used by JupyterLab. It is a separate project in order to \
accommodate creating JupyterLab-like applications from a more \
limited scope."
LICENSE = "BSD-3-Clause"

PV = "2.22.1"

RPM_NAME = "python310-jupyterlab-server-2.22.1-1.1.noarch.rpm"
RPM_HASH = "83d07a753785f9f4727b6ccfa32059dae05e3662e5c97130a9d6158d2d6bc191f9663df3d6da9a4721e9156a9b5c65624979262d90fc07bfcc399d6a4f790765"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-launcher jupyter-jupyterlab-server jupyter-jupyterlab_launcher jupyter-jupyterlab_server python3-jupyter-jupyterlab-server python3-jupyter_jupyterlab_launcher python3-jupyter_jupyterlab_server python3-jupyterlab-server python3-jupyterlab_server python3.10dist(jupyterlab-server) python310-jupyter-jupyterlab-server python310-jupyter_jupyterlab_launcher python310-jupyter_jupyterlab_server python310-jupyterlab-server python310-jupyterlab_server python3dist(jupyterlab-server)"
RDEPENDS:${PN} += "(python310-jupyter-server >= 1.21 with python310-jupyter-server < 3) python(abi) python310-Babel python310-Jinja2 python310-json5 python310-jsonschema python310-packaging python310-requests"

inherit rpm
