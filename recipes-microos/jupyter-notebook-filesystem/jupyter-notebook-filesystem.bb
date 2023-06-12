SUMMARY = "Common directories shared by Jupyter notebook packages"
DESCRIPTION = "This package provides common directories and macros used by many \
packages that depend on the Jupyter notebook. \
 \
It also provides macros for building packages that depend on \
the Jupyter notebook."
LICENSE = "BSD-3-Clause"

PV = "20221227"

RPM_NAME = "jupyter-notebook-filesystem-20221227-12.1.noarch.rpm"
RPM_HASH = "eb79a364f7c1422695215cf40c2352612538e1081f7c5bfff7b4a72cb7c2cdd50756d805d36f862e093c35b782f69c5c78a0369e3befadcc8e95f7c5648d62f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-notebook-filesystem \
jupyter-notebook-macros-devel \
python310-notebook-filesystem \
python310-notebook-macros-devel \
python311-notebook-filesystem \
python311-notebook-macros-devel \
python39-notebook-filesystem \
python39-notebook-macros-devel \
rpm_macro(_jupyter_nb_auth_confdir) \
rpm_macro(_jupyter_nb_base_confdir) \
rpm_macro(_jupyter_nb_bidi_confdir) \
rpm_macro(_jupyter_nb_confdir) \
rpm_macro(_jupyter_nb_custom_confdir) \
rpm_macro(_jupyter_nb_edit_confdir) \
rpm_macro(_jupyter_nb_notebook_confdir) \
rpm_macro(_jupyter_nb_services_confdir) \
rpm_macro(_jupyter_nb_style_confdir) \
rpm_macro(_jupyter_nb_terminal_confdir) \
rpm_macro(_jupyter_nb_tree_confdir) \
rpm_macro(_jupyter_nbextension_confdir) \
rpm_macro(_jupyter_nbextension_dir) \
rpm_macro(_jupyter_server_confdir) \
rpm_macro(_jupyter_servextension_confdir) \
rpm_macro(jupyter_nbextension_disable) \
rpm_macro(jupyter_nbextension_enable) \
rpm_macro(jupyter_nbextension_install) \
rpm_macro(jupyter_serverextension_disable) \
rpm_macro(jupyter_serverextension_enable)"
RDEPENDS:${PN} += "jupyter-jupyter_core-filesystem \
python-rpm-macros"

inherit rpm
