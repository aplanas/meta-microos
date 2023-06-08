SUMMARY = "GlusterFS's core library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "libglusterfs0-11.0-1.3.aarch64.rpm"
RPM_HASH = "6d0e1b926192a76b9f489b16208bfa62ce292820960c8c1de2e2697150295671cbf31dd7c8ff951a2fa9572f2d9f36a29c1666694a06d3e689b8e723873a2be4"

RPROVIDES:${PN} += "libglusterfs.so.0()(64bit) libglusterfs0 libglusterfs0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) libz.so.1()(64bit)"

inherit rpm
