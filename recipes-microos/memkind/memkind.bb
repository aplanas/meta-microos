SUMMARY = "User Extensible Heap Manager"
DESCRIPTION = "The memkind library is an user extensible heap manager built on top \
of jemalloc which enables control of memory characteristics and a \
partitioning of the heap between kinds of memory."
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "memkind-1.14.0-1.2.aarch64.rpm"
RPM_HASH = "841596c1d10662b5af81f941433da3cf6842b5b1730ec91c4c4f82797d95612d46a7741bbe54c36cf903dbe291c3e4b2b6a6f58308f1350e744317f68bea3238"

RPROVIDES:${PN} += "memkind \
memkind(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libmemkind.so.0()(64bit) \
libnuma.so.1()(64bit) \
libnuma.so.1(libnuma_1.1)(64bit) \
libnuma.so.1(libnuma_1.2)(64bit)"

inherit rpm
