SUMMARY = "Documentation for mayavi"
DESCRIPTION = "Documentation files for the mayavi package."
LICENSE = "BSD-3-Clause & EPL-1.0 & LGPL-2.0-or-later & LGPL-3.0-or-later"

PV = "4.7.4"

RPM_NAME = "mayavi-doc-4.7.4-1.7.aarch64.rpm"
RPM_HASH = "ae3e4908f7deab9b1ec891caf1a1f2b773867ee7aa1a28a6ebae2098fe4d1d2ac3640fe3b325f1528af937a0656293442d3efff9a485c29223a0e3f11ed14a8d"

RPROVIDES:${PN} += "mayavi-doc mayavi-doc(aarch-64)"
RDEPENDS:${PN} += "mayavi"

inherit rpm
