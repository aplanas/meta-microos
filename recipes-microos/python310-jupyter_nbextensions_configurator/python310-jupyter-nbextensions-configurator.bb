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

RPM_NAME = "python310-jupyter_nbextensions_configurator-0.6.1-1.3.noarch.rpm"
RPM_HASH = "2075f3cf95b27df6487790ab81831359db5374fddc4eff25b9ea7417d996054b78bd4cb37dda6fe381f4e5c6a92205d82dfffcdd2684c881217d9eefaab4aaf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter_nbextensions_configurator python3.10dist(jupyter-nbextensions-configurator) python310-jupyter_nbextensions_configurator python3dist(jupyter-nbextensions-configurator)"
RDEPENDS:${PN} += "jupyter-jupyter_nbextensions_configurator python(abi) python310-PyYAML python310-jupyter_contrib_core python310-jupyter_core python310-notebook python310-tornado python310-traitlets"

inherit rpm
