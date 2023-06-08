SUMMARY = "Common directories shared by Jupyter packages"
DESCRIPTION = "This package provides common directories and macros used by many \
packages that depend on jupyter_core. \
 \
It also provides macros for building packages that depend on \
jupyter_core."
LICENSE = "BSD-3-Clause"

PV = "20221227"

RPM_NAME = "jupyter-jupyter_core-filesystem-20221227-11.1.noarch.rpm"
RPM_HASH = "2c28ad00994606a170684efdb87a9d114c4408add62b6aaecb69e8debf3be40b5f20e1ef4c7c1a261e736f5e103680eeda410b63641e833b93ec5a7c39f0fbab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter_core-filesystem jupyter-jupyter_core-macros-devel python310-jupyter_core-filesystem python310-jupyter_core-macros-devel python311-jupyter_core-filesystem python311-jupyter_core-macros-devel python39-jupyter_core-filesystem python39-jupyter_core-macros-devel rpm_macro(_jupyter_confdir) rpm_macro(_jupyter_config) rpm_macro(_jupyter_distconfig) rpm_macro(_jupyter_kernel_dir) rpm_macro(_jupyter_prefix) rpm_macro(jupyter_move_config)"
RDEPENDS:${PN} += ""

inherit rpm
