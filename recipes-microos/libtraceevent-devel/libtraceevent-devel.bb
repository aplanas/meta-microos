SUMMARY = "Header files for libtraceevent"
DESCRIPTION = "The package provides header and other needed development files for the library libtraceevent"
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.7.2"

RPM_NAME = "libtraceevent-devel-1.7.2-1.1.aarch64.rpm"
RPM_HASH = "802ea9ab245e75d01cbf2f58283c40222b4022538bbc9a9f4bc3db1e2a2afbc3b04efd95ff86e67094b8f433e9f642e3b36462a31914ecd9ca242a01b9acb580"

RPROVIDES:${PN} += "libtraceevent-devel libtraceevent-devel(aarch-64) pkgconfig(libtraceevent)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libtraceevent1"

inherit rpm
