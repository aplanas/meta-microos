SUMMARY = "Configuration interfaces for nbextensions"
DESCRIPTION = "The jupyter_nbextensions_configurator jupyter server extension provides \
graphical user interfaces for configuring which nbextensions are enabled (load \
automatically for every notebook), and display their readme files. \
In addition, for extensions which include an appropriate yaml descriptor file, \
the interface also provides controls to configure the extensions' options. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python311-jupyter_nbextensions_configurator-0.6.1-1.3.noarch.rpm"
RPM_HASH = "b573aa5e0def1ba9de63039c73c00a24e48ab030563b8f38601a118323f17ca1a6f627c781d082ac053755f7981c5e55ebcf7afd2eb2689d7370092424645900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jupyter-nbextensions-configurator) python311-jupyter_nbextensions_configurator python3dist(jupyter-nbextensions-configurator)"
RDEPENDS:${PN} += "jupyter-jupyter_nbextensions_configurator python(abi) python311-PyYAML python311-jupyter_contrib_core python311-jupyter_core python311-notebook python311-tornado python311-traitlets"

inherit rpm
