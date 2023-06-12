SUMMARY = "Common directories shared by Jupyter packages"
DESCRIPTION = "This package provides common directories and macros used by many \
packages that depend on jupyter_core. \
 \
It also provides macros for building packages that depend on \
jupyter_core."
LICENSE = "BSD-3-Clause"

PV = "20221227"

RPM_NAME = "jupyter-jupyter_core-filesystem-20221227-12.1.noarch.rpm"
RPM_HASH = "3c947593330800a6872d8458ad77012b6ddfc906c78c0491a75bb1cee87e8c82c397f9a4c15b52c14bc2dcdd5899b9380c9300e3c682a0c970d45318f759c0e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter_core-filesystem jupyter-jupyter_core-macros-devel python310-jupyter_core-filesystem python310-jupyter_core-macros-devel python311-jupyter_core-filesystem python311-jupyter_core-macros-devel python39-jupyter_core-filesystem python39-jupyter_core-macros-devel rpm_macro(_jupyter_confdir) rpm_macro(_jupyter_config) rpm_macro(_jupyter_distconfig) rpm_macro(_jupyter_kernel_dir) rpm_macro(_jupyter_prefix) rpm_macro(jupyter_move_config)"
RDEPENDS:${PN} += ""

inherit rpm
