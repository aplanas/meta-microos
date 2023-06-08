SUMMARY = "Interactive plotting package for the Jupyter notebook"
DESCRIPTION = "Plotting system for the Jupyter notebook based on the \
interactive Jupyter widgets. \
 \
This package provides the python interface."
LICENSE = "Apache-2.0"

PV = "0.12.31"

RPM_NAME = "python39-bqplot-0.12.31-3.29.noarch.rpm"
RPM_HASH = "34bff1fef67ea74374f93518f2bfe8a13fc546cb542db8e25f9939f1801be1bb3620522d2db1d39131b8e56cc7cde58dd9fb2b4399724142fb3c18c32f753ac5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(bqplot) python39-bqplot python39-jupyter_bqplot python3dist(bqplot)"
RDEPENDS:${PN} += "jupyter-bqplot-notebook python(abi) python39-ipywidgets python39-numpy python39-pandas python39-traitlets python39-traittypes"

inherit rpm
