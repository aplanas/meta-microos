SUMMARY = "Development files for the libfixbuf library"
DESCRIPTION = "libfixbuf aims to be a compliant implementation of the IPFIX Protocol \
and message format, from which IPFIX Collecting Processes and \
IPFIX Exporting Processes may be built. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfixbuf."
LICENSE = "LGPL-3.0-only"

PV = "2.4.2"

RPM_NAME = "libfixbuf-devel-2.4.2-1.1.aarch64.rpm"
RPM_HASH = "7a1aaa14f1c42dbcc31248f099cf75f229cb8955cb3531135717f9f4f72e40e4a59ddf77266cd18c05b22c5948cfa7fc0a56b10acccc9057b2f927aae878715c"

RPROVIDES:${PN} += "libfixbuf-devel libfixbuf-devel(aarch-64) pkgconfig(libfixbuf)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libfixbuf9 pkgconfig(glib-2.0)"

inherit rpm
