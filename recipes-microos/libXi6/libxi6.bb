SUMMARY = "X Input Extension library"
DESCRIPTION = "libXi is the client-side library for the X Input Extension."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "libXi6-1.8.1-1.1.aarch64.rpm"
RPM_HASH = "4bbef500e5b773049ce8733bfe5c16f26aa5ed1965e7ddaa73c63a9e42ee03d9de6db5b0bda8d0c13ec7cb00769886a0ebcab8059a51ded0979a0ac47ebd7804"

RPROVIDES:${PN} += "libXi.so.6()(64bit) libXi6 libXi6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
