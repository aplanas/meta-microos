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

RPM_NAME = "python39-jupyter_nbextensions_configurator-0.6.1-1.3.noarch.rpm"
RPM_HASH = "bf0e036f92b9c4370a9c7d28d21d70f4c0403cf63b3014ce15d16a5cdf87c75388d53fe6847ee156bdf43f3a91e706ee2eae5694f27ff3606367f7571a7a5ab6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jupyter-nbextensions-configurator) python39-jupyter_nbextensions_configurator python3dist(jupyter-nbextensions-configurator)"
RDEPENDS:${PN} += "jupyter-jupyter_nbextensions_configurator python(abi) python39-PyYAML python39-jupyter_contrib_core python39-jupyter_core python39-notebook python39-tornado python39-traitlets"

inherit rpm
