SUMMARY = "PostgreSQL Provider for GNU Data Access (GDA)"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-postgres-6.0.0-6.6.aarch64.rpm"
RPM_HASH = "e3de568cb86704d3de146f10f6eb00b80f2a661cbcd3518dd1d7b5b764bd728f6c592c817564ed78586843f52892625d1219a71bd85570ac47ea4fde965cb3f4"

RPROVIDES:${PN} += "libgda-6_0-postgres libgda-6_0-postgres(aarch-64) libgda-postgres libgda-postgres-6.0.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgda-6.0.so.6.0.0()(64bit) libgda-6_0-6_0_0 libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libpq.so.5()(64bit)"

inherit rpm
