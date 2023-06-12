SUMMARY = "Headers for iODBC"
DESCRIPTION = "This package contains headers for the iODBC Driver Manager."
LICENSE = "BSD-3-Clause | LGPL-2.0-only"

PV = "3.52.14"

RPM_NAME = "libiodbc-devel-3.52.14-2.6.aarch64.rpm"
RPM_HASH = "5d0dd0e51c196520407e1e2d551fec8b7c2510f716a275fb5bf8e771ccf3771ea9412c2344078fd041714120cd425911e89e3686b100a37450584d6c05ae7abd"

RPROVIDES:${PN} += "libiodbc-devel \
libiodbc-devel(aarch-64) \
pkgconfig(libiodbc)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
iodbc \
libdrvproxy2 \
libiodbc2 \
libiodbcadm2 \
pkgconfig(gtk+-2.0)"

inherit rpm
