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

RPM_NAME = "python311-jupyterlab-3.6.3-1.1.noarch.rpm"
RPM_HASH = "0c719ecc11b47d5a33f56acee693e16cbc8bc01dcd94915c781bf614f31d54098b590b3f564d568bb3db17dab1b29a0ee85b4a5b1ef64227fa4be24ce87f4e4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jupyterlab) python311-jupyter_jupyterlab python311-jupyterlab python3dist(jupyterlab)"
RDEPENDS:${PN} += "(python311-jupyter-server-ydoc >= 0.8 with python311-jupyter-server-ydoc < 0.9) (python311-jupyter-ydoc >= 0.2.3 with python311-jupyter-ydoc < 0.3) (python311-jupyter_server >= 1.16 with python311-jupyter_server < 3) (python311-tomli if python311-base < 3.11) /usr/bin/node jupyter-jupyterlab python(abi) python311-Jinja2 python311-ipython python311-jupyter_core python311-jupyterlab-server python311-nbclassic python311-notebook python311-packaging python311-tornado"

inherit rpm
