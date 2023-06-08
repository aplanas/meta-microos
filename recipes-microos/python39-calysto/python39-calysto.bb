SUMMARY = "Libraries and Languages for Jupyter"
DESCRIPTION = "Libraries and Languages for Python and Jupyter. \
 \
This package provides the python interface."
LICENSE = "GPL-3.0-only"

PV = "1.0.6"

RPM_NAME = "python39-calysto-1.0.6-2.13.noarch.rpm"
RPM_HASH = "8a1ccf5b8418f357b27079f45dbbafa77eeb969512c8d019aa0f40e024efecba6d4dbf92dcb5f0eec11f0ef1dc006fc16c52b8b2daf92c5e2aa696c0ff2c8d87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(calysto) python39-calysto python39-jupyter_calysto python3dist(calysto)"
RDEPENDS:${PN} += "jupyter-calysto python(abi) python39-CairoSVG python39-ipython python39-ipywidgets python39-metakernel python39-numpy python39-svgwrite"

inherit rpm
