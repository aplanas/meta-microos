SUMMARY = "The omalloc memory allocator library"
DESCRIPTION = "(Upstream has not provided any description.)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libomalloc-4_3_1-4.3.1.p3-1.3.aarch64.rpm"
RPM_HASH = "4e14911aef317642e2b50a36abe7ed671d932d1a731e1965d68e7672acb94eea6ac4e8238054ca89a65bd51efc128e6f5e988b38519bbe85d4339473ca4d6a49"

RPROVIDES:${PN} += "libomalloc-4.3.1.p3.so()(64bit) libomalloc-4_3_1 libomalloc-4_3_1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
