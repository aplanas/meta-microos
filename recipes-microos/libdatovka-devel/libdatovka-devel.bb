SUMMARY = "Development files for libdatovka"
DESCRIPTION = "The libdatovka-devel package contains libraries and header files for \
developing applications that use libdatovka."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "libdatovka-devel-0.3.0-1.3.aarch64.rpm"
RPM_HASH = "d0d70218134ad499ee5941cacd79bfd02644f1c37f1f34575469379af4623fae24a96a74d5ea81223d89fce67b0db75430390e946916626de970bfa1663791ec"

RPROVIDES:${PN} += "libdatovka-devel \
libdatovka-devel(aarch-64) \
pkgconfig(libdatovka)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdatovka4 \
pkgconfig(libcurl) \
pkgconfig(libxml-2.0)"

inherit rpm
