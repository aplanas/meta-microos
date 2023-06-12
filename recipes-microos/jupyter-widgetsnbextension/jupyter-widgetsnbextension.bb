SUMMARY = "Jupyter interactive widgets for Jupyter Notebook - Jupyter Files"
DESCRIPTION = "This package makes Jupyter widgets available in the classic Jupyter Notebook. \
It provides the Jupyter configuration files."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.0.7"

RPM_NAME = "jupyter-widgetsnbextension-4.0.7-1.1.noarch.rpm"
RPM_HASH = "ec2c01a5f754b473e4edbdae3423da2677585d60fa45e587e2366687046d7fe50f575307b2a12c89a3328a42575b101e529c71fd53d9bb8373167eea39c42366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter-js-widgets \
jupyter-jupyter-jupyter-widgets-notebook-manager \
jupyter-widgetsnbextension"
RDEPENDS:${PN} += "python3-widgetsnbextension"

inherit rpm
