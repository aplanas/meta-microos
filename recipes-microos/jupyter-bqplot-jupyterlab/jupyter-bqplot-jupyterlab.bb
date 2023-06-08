SUMMARY = "Interactive plotting package for Jupyterlab"
DESCRIPTION = "Plotting system for the Jupyter notebook based on the \
interactive Jupyter widgets. \
 \
This package provides the jupyterlab extension."
LICENSE = "Apache-2.0"

PV = "0.5.32"

RPM_NAME = "jupyter-bqplot-jupyterlab-0.5.32-3.29.noarch.rpm"
RPM_HASH = "b111f9de828c6b5e287585b01e8d625700f44a30c44ae352c65186319308d41305263812c9e624a5d886d2ba55f94745dd1f5aebb32dd38387d69aae9af8dbb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-bqplot-jupyterlab"
RDEPENDS:${PN} += "jupyter-bqplot-notebook jupyter-jupyterlab"

inherit rpm
