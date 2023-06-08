SUMMARY = "A JupyterLab extension for showing Notebook diffs"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "jupyter-nbdime-jupyterlab-2.2.0-11.1.noarch.rpm"
RPM_HASH = "7532e4ef1dd53c4114d9ef20328a530fd30bbf273feee3642089815a54bd1aac213d0ec2f0bd942d407b38032144f41dfaedae670273bb4c99977bfeb1756998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbdime-jupyterlab"
RDEPENDS:${PN} += "jupyter-jupyterlab python3dist(nbdime)"

inherit rpm
