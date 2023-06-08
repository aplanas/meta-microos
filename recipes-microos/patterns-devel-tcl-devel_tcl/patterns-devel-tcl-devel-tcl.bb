SUMMARY = "Tcl/Tk Development"
DESCRIPTION = "Tools and libraries for development using Tcl and Tk."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-tcl-devel_tcl-20170319-2.11.aarch64.rpm"
RPM_HASH = "6e25ecd66e73ded8c5e7df99ae9fba622837d4ab72f445155d121f83436391e81a11133ddec2017ce6698300f8cad6faf9c0b9e375ff8c49fc4b9b3bfabcea52"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-devel-tcl-devel_tcl patterns-devel-tcl-devel_tcl(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
