SUMMARY = "GNU Data Access (GDA) Library -- Development Files"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data. \
 \
This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-devel-6.0.0-6.7.aarch64.rpm"
RPM_HASH = "2a18c40e09b31c5ae716e3678f9bafc46e46a13ddfc10360972d9f4c440c0139383e3b3d1348e68fbd315ad36d8e53c11498ea7788aa381c77b86578af1cdc62"

RPROVIDES:${PN} += "libgda-6_0-devel libgda-6_0-devel(aarch-64) libgda-devel pkgconfig(libgda-6.0) pkgconfig(libgda-capi-6.0) pkgconfig(libgda-ldap-6.0) pkgconfig(libgda-models-6.0) pkgconfig(libgda-mysql-6.0) pkgconfig(libgda-postgres-6.0) pkgconfig(libgda-report-6.0) pkgconfig(libgda-ui-6.0) pkgconfig(libgda-xslt-6.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgda-6.0.so.6.0.0()(64bit) libgda-6_0-6_0_0 libgda-report-6_0-6_0_0 libgda-ui-6.0.so.6.0.0()(64bit) libgda-ui-6_0-6_0_0 libgda-xslt-6_0-6_0_0 libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) pkgconfig(gobject-2.0) pkgconfig(gthread-2.0) pkgconfig(gtk+-3.0) pkgconfig(libgda-6.0) pkgconfig(libxml-2.0) pkgconfig(libxslt) typelib-1_0-Gda-6_0 typelib-1_0-Gdaui-6_0"

inherit rpm
