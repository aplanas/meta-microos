SUMMARY = "MySQL Provider for GNU Data Access (GDA)"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-mysql-6.0.0-6.6.aarch64.rpm"
RPM_HASH = "313b49a908a8e191f0523c1dad93fe6dbc5c6305b1d2ae8969545e1d49066c7415075dd455bb5576f217e793377af8c32a24cff3780fd3d4eaab373590e76d4f"

RPROVIDES:${PN} += "libgda-6_0-mysql libgda-6_0-mysql(aarch-64) libgda-mysql libgda-mysql-6.0.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgda-6.0.so.6.0.0()(64bit) libgda-6_0-6_0_0 libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libmariadb.so.3()(64bit) libmariadb.so.3(libmysqlclient_18)(64bit)"

inherit rpm
