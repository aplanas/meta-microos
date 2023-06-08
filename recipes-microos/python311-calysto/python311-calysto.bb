SUMMARY = "Libraries and Languages for Jupyter"
DESCRIPTION = "Libraries and Languages for Python and Jupyter. \
 \
This package provides the python interface."
LICENSE = "GPL-3.0-only"

PV = "1.0.6"

RPM_NAME = "python311-calysto-1.0.6-2.13.noarch.rpm"
RPM_HASH = "01f49e5fc47251cb14d985bede4514904bebf21ec8712c32b03493653df19c33ce93025057889a5b33370a3ac1429111d75d99e6bc5fa6b257a2c9ff99b1d395"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(calysto) python311-calysto python311-jupyter_calysto python3dist(calysto)"
RDEPENDS:${PN} += "jupyter-calysto python(abi) python311-CairoSVG python311-ipython python311-ipywidgets python311-metakernel python311-numpy python311-svgwrite"

inherit rpm
