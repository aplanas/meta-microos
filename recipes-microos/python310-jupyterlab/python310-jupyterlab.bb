SUMMARY = "Environment for interactive and reproducible computing"
DESCRIPTION = "An extensible environment for interactive and reproducible computing, \
based on the Jupyter Notebook and Architecture. \
 \
JupyterLab is the next-generation user interface for Project Jupyter \
offering all the familiar building blocks of the classic Jupyter \
Notebook (notebook, terminal, text editor, file browser, rich outputs, \
etc.)."
LICENSE = "BSD-3-Clause"

PV = "3.6.3"

RPM_NAME = "python310-jupyterlab-3.6.3-1.1.noarch.rpm"
RPM_HASH = "6cce3af1ec82177ea836af8f6720b5a53377f9623bad4ed98e6e88fd8cc500dc3019d0b50772513fc9379a9b332f695f87cbcd03fd13c16db3a63284d85b15e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter_jupyterlab python3-jupyterlab python3.10dist(jupyterlab) python310-jupyter_jupyterlab python310-jupyterlab python3dist(jupyterlab)"
RDEPENDS:${PN} += "(python310-jupyter-server-ydoc >= 0.8 with python310-jupyter-server-ydoc < 0.9) (python310-jupyter-ydoc >= 0.2.3 with python310-jupyter-ydoc < 0.3) (python310-jupyter_server >= 1.16 with python310-jupyter_server < 3) (python310-tomli if python310-base < 3.11) /usr/bin/node jupyter-jupyterlab python(abi) python310-Jinja2 python310-ipython python310-jupyter_core python310-jupyterlab-server python310-nbclassic python310-notebook python310-packaging python310-tornado"

inherit rpm
