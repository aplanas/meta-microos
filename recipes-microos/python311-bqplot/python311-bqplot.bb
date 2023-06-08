SUMMARY = "Interactive plotting package for the Jupyter notebook"
DESCRIPTION = "Plotting system for the Jupyter notebook based on the \
interactive Jupyter widgets. \
 \
This package provides the python interface."
LICENSE = "Apache-2.0"

PV = "0.12.31"

RPM_NAME = "python311-bqplot-0.12.31-3.29.noarch.rpm"
RPM_HASH = "242fc7da8a55b750c9688a3f493041c5add54e64564b83d9eb1c236efa802978a5c31474e0c30252c784ebbbabc110c4b1a729fb9ffe67211209e1fa4f5624e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(bqplot) python311-bqplot python311-jupyter_bqplot python3dist(bqplot)"
RDEPENDS:${PN} += "jupyter-bqplot-notebook python(abi) python311-ipywidgets python311-numpy python311-pandas python311-traitlets python311-traittypes"

inherit rpm
