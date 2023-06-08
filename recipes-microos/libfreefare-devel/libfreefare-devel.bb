SUMMARY = "Development files for the Mifare card manipulation library"
DESCRIPTION = "The libfreefare project aims to provide a convenient API for Mifare \
card manipulations. Supported tags include: Classic 1k/4k, DESFire \
2K/4K/8K, Ultralight/C. Supported features include: Mifare \
Application Directory (MAD) v1-v3. \
 \
This package contains the libfreefare development files."
LICENSE = "LGPL-3.0+"

PV = "0.4.0"

RPM_NAME = "libfreefare-devel-0.4.0-4.31.aarch64.rpm"
RPM_HASH = "717874facd5eb6db934251a920a781e5b85309d07aa25845fbb7c02579fdaadd5f18d3e59f806b79d40f13d29c26fac6b5f19f3c23bf83a8dd4b2130ba6fd6ac"

RPROVIDES:${PN} += "libfreefare-devel libfreefare-devel(aarch-64) pkgconfig(libfreefare)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libfreefare0 pkgconfig(libnfc)"

inherit rpm
