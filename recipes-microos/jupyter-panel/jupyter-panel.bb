SUMMARY = "Jupyter notebook and server cofiguration for python-panel"
DESCRIPTION = "Panel is a Python library that lets you create custom interactive web apps and \
dashboards by connecting user-defined widgets to plots, images, tables, or \
text. \
 \
This package contains the notebook and server extension configuration common \
to all Python flavors."
LICENSE = "BSD-3-Clause"

PV = "0.14.4"

RPM_NAME = "jupyter-panel-0.14.4-1.1.noarch.rpm"
RPM_HASH = "006dc9a73c4eb5f6c366984d707206cc42e2dd80038d4b52547cdcc6ee4ea08e7fc34aec8e166cb145f8ec4db92e2b137dce1970f29239de95eec2c1160f199c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-panel"
RDEPENDS:${PN} += ""

inherit rpm
