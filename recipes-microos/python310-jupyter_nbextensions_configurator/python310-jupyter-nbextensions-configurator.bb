SUMMARY = "Configuration interfaces for nbextensions"
DESCRIPTION = "The jupyter_nbextensions_configurator jupyter server extension provides \
graphical user interfaces for configuring which nbextensions are enabled (load \
automatically for every notebook), and display their readme files. \
In addition, for extensions which include an appropriate yaml descriptor file, \
the interface also provides controls to configure the extensions' options. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.6.3"

RPM_NAME = "python310-jupyter_nbextensions_configurator-0.6.3-1.1.noarch.rpm"
RPM_HASH = "643a9a46d528382536257568cf33974491a914116ad201a1fbef75c86fe143db7691d2c2b0c6d453f895ec526c22854a2bcce59c62074f7e7d12fd81da7e5283"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter_nbextensions_configurator python3.10dist(jupyter-nbextensions-configurator) python310-jupyter_nbextensions_configurator python3dist(jupyter-nbextensions-configurator)"
RDEPENDS:${PN} += "jupyter-jupyter_nbextensions_configurator python(abi) python310-PyYAML python310-jupyter_contrib_core python310-jupyter_core python310-notebook python310-tornado python310-traitlets"

inherit rpm
