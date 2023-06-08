SUMMARY = "A Python/ThreeJS bridge utilizing the Jupyter widget infrastructure"
DESCRIPTION = "Interactive 3d graphics for the Jupyter notebook, \
using Three.js from Jupyter interactive widgets. \
 \
This package provides the JupyterLab extension."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "jupyter-threejs-jupyterlab-2.4.0-7.8.noarch.rpm"
RPM_HASH = "2cd7b6585108d9e475c70971540e88cc43b3c2ec31c0e42e6dd14a90e825ead3db2c48d0dd83c03c884dce61112aa9e012a02eb39e1f615510e52d9a4e315ee6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-pythreejs-jupyterlab jupyter-threejs-jupyterlab"
RDEPENDS:${PN} += "jupyter-ipydatawidgets-jupyterlab jupyter-jupyterlab python3-pythreejs"

inherit rpm
