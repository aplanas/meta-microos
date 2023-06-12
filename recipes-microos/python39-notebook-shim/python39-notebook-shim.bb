SUMMARY = "A shim layer for notebook traits and config"
DESCRIPTION = "This project provides a way for JupyterLab and other frontends to switch to \
Jupyter Server for their Python Web application backend."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python39-notebook-shim-0.2.3-1.1.noarch.rpm"
RPM_HASH = "202113effb89ebb37075f6111b2530e3cbb2d41354f15d66395b5ff83bbee6f7e6349b6797179b2aa841b492978ba3b3158171a085d2288b322983706d390299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(notebook-shim) \
python39-notebook-shim \
python39-notebook_shim \
python3dist(notebook-shim)"
RDEPENDS:${PN} += "(python39-jupyter_server >= 1.8 with python39-jupyter_server < 3) \
jupyter-notebook-shim \
python(abi)"

inherit rpm
