SUMMARY = "A JupyterLab extension for showing Notebook diffs"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the tools and jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "6.2.0"

RPM_NAME = "jupyter-nbdime-6.2.0-11.1.noarch.rpm"
RPM_HASH = "81e2d8e5e74da2582f2d1f89b289f214d429af36dc9e4e75ae3f50f18d4e3859bca4701df31f0b2d9aa119ecdcd85d9c366918e112634b3daa8cc1ad3a61408b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbdime"
RDEPENDS:${PN} += "python3dist(nbdime)"

inherit rpm
