SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "libguilereadline-v-17-17-1.8.8-23.11.aarch64.rpm"
RPM_HASH = "2ce307b585b6c0a3656b14b2a4b8e7d82aa31d5224ffd16b76f314abf1c52ab2693f8e119a03b2b489d4ac06ba871d60cf99fd76bb1df0417c3e29e97a754230"

RPROVIDES:${PN} += "libguilereadline-v-17-17 libguilereadline-v-17-17(aarch-64) libguilereadline-v-17.so.17()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libguile.so.17()(64bit) libreadline.so.8()(64bit)"

inherit rpm
