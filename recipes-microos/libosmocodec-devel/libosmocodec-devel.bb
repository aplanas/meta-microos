SUMMARY = "Development files for the Osmocom GSM codec library"
DESCRIPTION = "The libosmocodec library contains an implementation of multiple \
GSM codecs. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmocodec."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmocodec-devel-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "27bc5a98d25fd24a59d0f6addd3a4f4668f77b2d7cd141379912cbd6bb7f367fe8e77b2457d12d92426320ba7e789dcab66e27840784318bb1f502e0d842cb26"

RPROVIDES:${PN} += "libosmocodec-devel libosmocodec-devel(aarch-64) pkgconfig(libosmocodec)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmocodec0 pkgconfig(libosmocore) pkgconfig(talloc)"

inherit rpm
