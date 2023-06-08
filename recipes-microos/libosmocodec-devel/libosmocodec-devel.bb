SUMMARY = "Development files for the Osmocom GSM codec library"
DESCRIPTION = "The libosmocodec library contains an implementation of multiple \
GSM codecs. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmocodec."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmocodec-devel-1.7.0-2.4.aarch64.rpm"
RPM_HASH = "bd6e827c8d979e074dd16bca91f9754e749e58b0dd1189f6d311c81951871e0a7588c00d35563eb1dae1fa75e7d7b42c2b85e3b37a8f5b593f3f60cc2cbf18b6"

RPROVIDES:${PN} += "libosmocodec-devel libosmocodec-devel(aarch-64) pkgconfig(libosmocodec)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmocodec0 pkgconfig(libosmocore) pkgconfig(talloc)"

inherit rpm
