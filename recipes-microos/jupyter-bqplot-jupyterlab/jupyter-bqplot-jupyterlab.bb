SUMMARY = "Interactive plotting package for Jupyterlab"
DESCRIPTION = "Plotting system for the Jupyter notebook based on the \
interactive Jupyter widgets. \
 \
This package provides the jupyterlab extension."
LICENSE = "Apache-2.0"

PV = "0.5.32"

RPM_NAME = "jupyter-bqplot-jupyterlab-0.5.32-3.30.noarch.rpm"
RPM_HASH = "b34693d8fd903da75135156e6c1b9c4d86a330dc31fa6921bddbf786517e4cb6e3889d3be71b4125bb32d40f3630e96be298788a18da0a53dcf017f02ba3bd8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-bqplot-jupyterlab"
RDEPENDS:${PN} += "jupyter-bqplot-notebook \
jupyter-jupyterlab"

inherit rpm
