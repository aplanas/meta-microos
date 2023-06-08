SUMMARY = "Quake II - Three Wave Capture The Flag for yamagi-quake2"
DESCRIPTION = "This package provides the Three Wave Capture The Flag game mode \
for yamagi-quake2, an enhanced port of the original Quake II."
LICENSE = "GPL-2.0-or-later"

PV = "1.09"

RPM_NAME = "yamagi-quake2-ctf-1.09-1.3.aarch64.rpm"
RPM_HASH = "2fa16f11cd4a9704b917b20daf8aa100b767c94815e321f0d5888e78ab9d27e19e64b71b8f3659c36dfdee06052ded0e0ff1a687aaf1da5d1b64a319485597d0"

RPROVIDES:${PN} += "application() application(yquake2-ctf.desktop) yamagi-quake2-ctf yamagi-quake2-ctf(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) yamagi-quake2"

inherit rpm
