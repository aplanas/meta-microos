SUMMARY = "A JupyterLab extension for showing Notebook diffs"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "jupyter-nbdime-jupyterlab-2.2.0-12.2.noarch.rpm"
RPM_HASH = "57bf0e42a5d43d26363f90b45df79228a82f1ab89b15836f7a990a236f4b72c34b898d6b7ce5fb72eed96b16074e4355f9d3ae8b69bb6da17c6fd7805ebd2477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbdime-jupyterlab"
RDEPENDS:${PN} += "jupyter-jupyterlab \
python3dist(nbdime)"

inherit rpm
