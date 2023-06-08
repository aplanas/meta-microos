SUMMARY = "Google disk and GOA functionality for GLib"
DESCRIPTION = "This package provides a gvfs backend that supports Google disk \
and GNOME online accounts integration."
LICENSE = "LGPL-2.0-or-later"

PV = "1.50.4"

RPM_NAME = "gvfs-backend-goa-1.50.4-2.1.aarch64.rpm"
RPM_HASH = "8c8996563a724c5a729a0fc79e78269d7b3d835bcf7d6dd555a3e9aea55d7a71e40516d3904361c3acde8043194fc8f6c720634215691861c412a8007a729515"

RPROVIDES:${PN} += "gvfs-backend-goa gvfs-backend-goa(aarch-64)"
RDEPENDS:${PN} += "gvfs ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdata.so.22()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgoa-1.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgvfscommon.so()(64bit) libgvfsdaemon.so()(64bit)"

inherit rpm
