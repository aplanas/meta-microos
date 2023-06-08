SUMMARY = "A compact general purpose allocator"
DESCRIPTION = "This is a general purpose allocator. It is a drop-in replacement for \
malloc and can be used in other programs without code changes. \
 \
Performance characteristics in comparison to allocators like tcmalloc 2.7, \
jemalloc 5.2.1 and glibc 2.31 is favorable, with generally 6% or better in \
timing, depending on the particular workload."
LICENSE = "MIT"

PV = "2.0.9"

RPM_NAME = "libmimalloc2-2.0.9-1.3.aarch64.rpm"
RPM_HASH = "791f5b84f66c0ded8cbe597e05c3a34e053660022e2bb5e707d6a58116f6d67deb4462063266ce6e7ad80ace778a3a64802e226c4987f84ede81c08c79b16572"

RPROVIDES:${PN} += "libmimalloc.so.2()(64bit) libmimalloc2 libmimalloc2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
