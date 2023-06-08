SUMMARY = "A lightweight C library for RDF syntax"
DESCRIPTION = "A lightweight C library for RDF syntax which supports reading and writing Turtle and NTriples."
LICENSE = "ISC"

PV = "0.30.16"

RPM_NAME = "libserd-0-0-0.30.16-1.1.aarch64.rpm"
RPM_HASH = "03980cb0a3ce18578b696b7b2ac4ec19d036fffbd871b4b86ac8e1ef7b10eed0b292ac1fdf1212afbe186dceff528cf0810bce9e7701e7941018ab5607d4ebae"

RPROVIDES:${PN} += "libserd-0-0 libserd-0-0(aarch-64) libserd-0.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
