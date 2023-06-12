SUMMARY = "Development package for LASH"
DESCRIPTION = "This package contains the development files for the LASH system."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "lash-devel-0.5.4-2.11.aarch64.rpm"
RPM_HASH = "b1d17c4d227d5016c5e214a7cf9a9c63c81b88553179b20b7486f4879db32f6007241784ebb53024632b203c8b37b0c4f721f1f5292c51d51e1904078a9247dd"

RPROVIDES:${PN} += "lash-devel \
lash-devel(aarch-64) \
pkgconfig(lash-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
liblash1 \
libuuid-devel \
pkgconfig(alsa) \
pkgconfig(jack) \
readline-devel"

inherit rpm
