SUMMARY = "GNU Data Access (GDA) Library"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-xslt-6_0-6_0_0-6.0.0-6.6.aarch64.rpm"
RPM_HASH = "275a245b083843c0a4ca467ff8899cdbfe30ee99306df359a112dfbc3666194cd66cc13cef2bf1e66a8dae9470046af89fe096ad7a9628e4ab0d03a23643eb46"

RPROVIDES:${PN} += "libgda-xslt-6.0.so.6.0.0()(64bit) libgda-xslt-6_0-6_0_0 libgda-xslt-6_0-6_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgda-6.0.so.6.0.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxslt.so.1()(64bit) libxslt.so.1(LIBXML2_1.0.11)(64bit) libxslt.so.1(LIBXML2_1.0.13)(64bit) libxslt.so.1(LIBXML2_1.0.24)(64bit)"

inherit rpm
