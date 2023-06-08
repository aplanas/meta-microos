SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.8"

RPM_NAME = "libguile-srfi-srfi-1-v-3-3-1.8.8-23.11.aarch64.rpm"
RPM_HASH = "bb095d05abd5d3c4d6cd4affdab4cd279392bddb214f52bf7a0b8ba2bc73bd4331f4dd565e8d46180dc8f884603009e61947507c3a59045c1e8faa72927d38df"

RPROVIDES:${PN} += "libguile-srfi-srfi-1-v-3-3 libguile-srfi-srfi-1-v-3-3(aarch-64) libguile-srfi-srfi-1-v-3.so.3()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libguile.so.17()(64bit)"

inherit rpm
