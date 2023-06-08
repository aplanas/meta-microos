SUMMARY = "Interactive plotting package for Jupyter Notebooke"
DESCRIPTION = "Plotting system for the Jupyter notebook based on the \
interactive Jupyter widgets. \
 \
This package provides the jupyter notebook extension."
LICENSE = "Apache-2.0"

PV = "0.5.32"

RPM_NAME = "jupyter-bqplot-notebook-0.5.32-3.29.noarch.rpm"
RPM_HASH = "415cd2065af5f76f95d9069d352bfbcafc6ccf14f28374b11688c30e761b741371d15bd9749ea620d76853e2bae80ba9d5909e3f81738d3784faa25a6ca4678a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-bqplot jupyter-bqplot-notebook"
RDEPENDS:${PN} += "jupyter-notebook python3-bqplot"

inherit rpm
