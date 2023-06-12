SUMMARY = "Configuration interfaces for nbextensions"
DESCRIPTION = "The jupyter_nbextensions_configurator jupyter server extension provides \
graphical user interfaces for configuring which nbextensions are enabled (load \
automatically for every notebook), and display their readme files. \
In addition, for extensions which include an appropriate yaml descriptor file, \
the interface also provides controls to configure the extensions' options. \
 \
This package provides the jupyter components."
LICENSE = "BSD-3-Clause"

PV = "0.6.3"

RPM_NAME = "jupyter-jupyter_nbextensions_configurator-0.6.3-1.1.noarch.rpm"
RPM_HASH = "64062752c4bb796fc6ff3955235ebfe2e4f1ccbf030de2af246fabe13b20307f2ff0e32f7777ac258c417845323b15a2cbb9306ad15c9531061cd89f9a5faa49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyter_nbextensions_configurator"
RDEPENDS:${PN} += "(python39-jupyter_nbextensions_configurator = 0.6.3 or python311-jupyter_nbextensions_configurator = 0.6.3 or python310-jupyter_nbextensions_configurator = 0.6.3) /usr/bin/python3.10 jupyter-jupyter_contrib_core jupyter-jupyter_core jupyter-notebook"

inherit rpm
