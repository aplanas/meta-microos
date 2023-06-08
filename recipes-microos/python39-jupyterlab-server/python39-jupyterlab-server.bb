SUMMARY = "Server components for JupyterLab and JupyterLab-like applications"
DESCRIPTION = "JupyterLab Server sits between JupyterLab and Jupyter Server, \
and provides a set of REST API handlers and utilities that are \
used by JupyterLab. It is a separate project in order to \
accommodate creating JupyterLab-like applications from a more \
limited scope."
LICENSE = "BSD-3-Clause"

PV = "2.22.1"

RPM_NAME = "python39-jupyterlab-server-2.22.1-1.1.noarch.rpm"
RPM_HASH = "083807a66cc3c7163e9829bd880433fc93a2e6c6a5994763d1b129a34c824b726e6e578ec7702bf19090981e9ad8c7eb0bb92226143b3153cd1b838faf1237d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jupyterlab-server) python39-jupyter-jupyterlab-server python39-jupyter_jupyterlab_launcher python39-jupyter_jupyterlab_server python39-jupyterlab-server python39-jupyterlab_server python3dist(jupyterlab-server)"
RDEPENDS:${PN} += "(python39-jupyter-server >= 1.21 with python39-jupyter-server < 3) python(abi) python39-Babel python39-Jinja2 python39-importlib-metadata python39-json5 python39-jsonschema python39-packaging python39-requests"

inherit rpm
