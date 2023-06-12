SUMMARY = "GNU Data Access (GDA) Library"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-report-6_0-6_0_0-6.0.0-6.7.aarch64.rpm"
RPM_HASH = "9c830b16b4c7b8dd40d7735bbf7c16fedb700606fd39f068c72b9822001037e556a35d7a21100bcb6047a39fc234e05a50d55b1e62ac2388f573ffb05dbbc204"

RPROVIDES:${PN} += "libgda-report-6.0.so.6.0.0()(64bit) \
libgda-report-6_0-6_0_0 \
libgda-report-6_0-6_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgda-6.0.so.6.0.0()(64bit) \
libgda-report \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
