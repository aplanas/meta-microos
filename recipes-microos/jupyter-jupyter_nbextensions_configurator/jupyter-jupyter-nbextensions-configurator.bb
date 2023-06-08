SUMMARY = "Configuration interfaces for nbextensions"
DESCRIPTION = "The jupyter_nbextensions_configurator jupyter server extension provides \
graphical user interfaces for configuring which nbextensions are enabled (load \
automatically for every notebook), and display their readme files. \
In addition, for extensions which include an appropriate yaml descriptor file, \
the interface also provides controls to configure the extensions' options. \
 \
This package provides the jupyter components."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "jupyter-jupyter_nbextensions_configurator-0.6.1-1.3.noarch.rpm"
RPM_HASH = "a045f40480a9003dd72965e908b5a902ff3f914aa97588ad56ed321413e029a43980395c1d9a0fbe5e79a6f398f062450ea1a9fedd7a68f3bdcf560232969a5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter_nbextensions_configurator"
RDEPENDS:${PN} += "(python39-jupyter_nbextensions_configurator = 0.6.1 or python311-jupyter_nbextensions_configurator = 0.6.1 or python310-jupyter_nbextensions_configurator = 0.6.1) /usr/bin/python3.10 jupyter-jupyter_contrib_core jupyter-jupyter_core jupyter-notebook"

inherit rpm
