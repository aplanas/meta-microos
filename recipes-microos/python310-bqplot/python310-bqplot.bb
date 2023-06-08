SUMMARY = "Interactive plotting package for the Jupyter notebook"
DESCRIPTION = "Plotting system for the Jupyter notebook based on the \
interactive Jupyter widgets. \
 \
This package provides the python interface."
LICENSE = "Apache-2.0"

PV = "0.12.31"

RPM_NAME = "python310-bqplot-0.12.31-3.29.noarch.rpm"
RPM_HASH = "be6512a1152791732450af21b1c86124a791647fd1b2aaf2754782427ce733a6c7d1f77b73ab4e447dc0202a3374063c9afe704f3c0b3eb13f6c313a6e4880d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bqplot python3-jupyter_bqplot python3.10dist(bqplot) python310-bqplot python310-jupyter_bqplot python3dist(bqplot)"
RDEPENDS:${PN} += "jupyter-bqplot-notebook python(abi) python310-ipywidgets python310-numpy python310-pandas python310-traitlets python310-traittypes"

inherit rpm
