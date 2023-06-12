SUMMARY = "Jupyter widgets base for Vue libraries - nbextension"
DESCRIPTION = "Jupyter widgets base for Vue libraries \
 \
This package provides the jupyter notebook extension."
LICENSE = "MIT"

PV = "1.9.1"

RPM_NAME = "jupyter-ipyvue-nbextension-1.9.1-1.1.noarch.rpm"
RPM_HASH = "d9a147253f0cf2874327b507d6a5565519020dc33ec10705fe3094f5bd5604b4dca5ee80a123132ab470874028826012305ee1173af617ca7a4e736992e263b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyvue-nbextension"
RDEPENDS:${PN} += "jupyter-notebook python3dist(ipyvue)"

inherit rpm
