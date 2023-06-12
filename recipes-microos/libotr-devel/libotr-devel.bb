SUMMARY = "Include files and development libraries"
DESCRIPTION = "Headers and development libraries for libotr"
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "4.1.1"

RPM_NAME = "libotr-devel-4.1.1-4.2.aarch64.rpm"
RPM_HASH = "fb1aba15580cb403d822bf487aac8461a80f3d3d5083c08eddac197e2e9fa104b494671a8ffc377ecb2974741b84f28e986ba931360d6944a201e2970b9ba2da"

RPROVIDES:${PN} += "libotr-devel \
libotr-devel(aarch-64) \
pkgconfig(libotr)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgcrypt-devel \
libotr5"

inherit rpm
