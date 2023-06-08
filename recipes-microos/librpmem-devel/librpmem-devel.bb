SUMMARY = "Development files for the Remote Access to Persistent Memory library"
DESCRIPTION = "The librpmem library provides low-level support for remote access \
to persistent memory utilizing RDMA-capable NICs. It can be used \
to replicate persistent memory regions over RDMA protocol. \
 \
This sub-package contains libraries and header files for developing \
applications that want to specifically make use of librpmem."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "librpmem-devel-1.11.1-1.8.aarch64.rpm"
RPM_HASH = "cd63ffd8b02e029eeb331b628b8b3540bcd34578394d390bcde202221bc9e32247b5afde0a7516a0401506935d9b99ead5fb7a5fb16f2bab130a5c9454aad65c"

RPROVIDES:${PN} += "librpmem-devel librpmem-devel(aarch-64) pkgconfig(librpmem)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfabric.so.1()(64bit) libfabric.so.1(FABRIC_1.0)(64bit) libfabric.so.1(FABRIC_1.1)(64bit) libfabric.so.1(FABRIC_1.3)(64bit) librpmem1"

inherit rpm
