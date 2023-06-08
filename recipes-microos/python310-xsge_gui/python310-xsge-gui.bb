SUMMARY = "xSGE GUI Toolkit"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides a toolkit for adding GUIs to a SGE game \
as well as support for modal dialog boxes."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.1"

RPM_NAME = "python310-xsge_gui-1.2.1-2.7.noarch.rpm"
RPM_HASH = "6ae46f4fc62332a3c726daf2788d4326e70b21d1a3307f3537216c8e81b9eb9dd53022fb93f83acb853cde13feb40eeca285248a5ed61435640c6f2b37fdf5a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xsge_gui python3.10dist(xsge-gui) python310-xsge_gui python3dist(xsge-gui)"
RDEPENDS:${PN} += "python(abi) python310-sge-pygame python310-six"

inherit rpm
