SUMMARY = "Common directories shared by JupyterLab packages"
DESCRIPTION = "This package provides common directories and macros used by many \
packages that depend on JupyterLab. \
 \
It also provides macros for building packages that depend on \
JupyterLab."
LICENSE = "BSD-3-Clause"

PV = "20221227"

RPM_NAME = "jupyter-jupyterlab-filesystem-20221227-11.1.noarch.rpm"
RPM_HASH = "4a7112dd6c5e755f9079bd8c007e34871ea3e378d20bf492bea4d743a37aeb6fe2a9fd014e6eb19023f0971f70163b89b705abff2bd32720f3c25fbdf9b77b07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-filesystem jupyter-jupyterlab-macros-devel python310-jupyterlab-filesystem python310-jupyterlab-macros-devel python311-jupyterlab-filesystem python311-jupyterlab-macros-devel python39-jupyterlab-filesystem python39-jupyterlab-macros-devel rpm_macro(_jupyter_lab_dir) rpm_macro(_jupyter_labextensions_dir) rpm_macro(_jupyter_labextensions_dir3)"
RDEPENDS:${PN} += "jupyter-jupyter_core-filesystem"

inherit rpm
