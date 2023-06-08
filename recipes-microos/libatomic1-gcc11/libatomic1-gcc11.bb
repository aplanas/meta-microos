SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "11.3.1+git2076"

RPM_NAME = "libatomic1-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "4232daecba601a54001f2afb3d65548ce4f0d8de505b1ae13d4c3f4aed151b88cf9d233b5ed2dafc05d103e62f68a5ae8dc0b465298e9e4af2e75760ade5316d"

RPROVIDES:${PN} += "libatomic.so.1()(64bit) libatomic.so.1(LIBATOMIC_1.0)(64bit) libatomic.so.1(LIBATOMIC_1.1)(64bit) libatomic.so.1(LIBATOMIC_1.2)(64bit) libatomic1 libatomic1-gcc11 libatomic1-gcc11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
