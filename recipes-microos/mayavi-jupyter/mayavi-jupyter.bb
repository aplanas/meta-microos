SUMMARY = "Jupyter notebook backend for mayavi"
DESCRIPTION = "Interface to allow plotting with mayavi in Jupyter \
notebooks. \
 \
This package pulls in the dependencies needed to \
run mayavi in a Jupyter notebook."
LICENSE = "BSD-3-Clause & EPL-1.0 & LGPL-2.0-or-later & LGPL-3.0-or-later"

PV = "4.7.4"

RPM_NAME = "mayavi-jupyter-4.7.4-1.7.aarch64.rpm"
RPM_HASH = "034fd36b4012bda68d016a830a87f7680a505a0cc8bcbc5cb781e862c211668f63e64175ba465df33c3a0334a2e55145b1be22deade8539ea81af22812384da3"

RPROVIDES:${PN} += "mayavi-jupyter mayavi-jupyter(aarch-64)"
RDEPENDS:${PN} += "jupyter-ipyevents jupyter-ipywidgets jupyter-notebook mayavi"

inherit rpm
