SUMMARY = "Administration tools for iODBC"
DESCRIPTION = "The iODBC Driver Manager is an implementation of the SAG CLI and \
ODBC compliant driver manager which allows developers to write ODBC \
compliant applications that can connect to various databases using \
appropriate backend drivers. \
 \
This package provides tools for configuring and administering iODBC."
LICENSE = "BSD-3-Clause | LGPL-2.0-only"

PV = "3.52.14"

RPM_NAME = "iodbc-admin-3.52.14-2.6.aarch64.rpm"
RPM_HASH = "5092c9bedadd37c279b56d738c535b00dd43b501b1683d6ef4dc51e6bcc338aed9d591c859d5d1b23f6dd5448bf77e05f798138d1b8a8bd7df057dcf5a5397c2"

RPROVIDES:${PN} += "iodbc-admin iodbc-admin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgtk-x11-2.0.so.0()(64bit) libiodbcinst.so.2()(64bit)"

inherit rpm
