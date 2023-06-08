SUMMARY = "GNU Data Access (GDA) Library - UI Widgets"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-ui-6_0-6_0_0-6.0.0-6.6.aarch64.rpm"
RPM_HASH = "183e9006b3c2fca4b9d00943a67683d727a150c849dda8ede25f8b5e7268d1b84b51be09ceed1ee73b194dbc78b856ed5718011101f9e7997f898d7c3123a5f4"

RPROVIDES:${PN} += "libgda-ui-6.0.so.6.0.0()(64bit) libgda-ui-6_0-6_0_0 libgda-ui-6_0-6_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgda-6.0.so.6.0.0()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
