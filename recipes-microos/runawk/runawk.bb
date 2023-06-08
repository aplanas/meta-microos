SUMMARY = "Wrapper for AWK interpreter"
DESCRIPTION = "RunAWK is a small wrapper for AWK interpreter that helps to write \
the standalone programs in AWK. It provides modules for AWK \
similar to PERL's 'use' command and other powerful features. \
Dozens of ready to use modules are also provided."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "runawk-1.6.1-1.18.aarch64.rpm"
RPM_HASH = "bf3c301b72fa16df712cbcb8f4b114f4a7a53472c22721a1c41265c39560e38574aa1aa96f6ff2f852e5742efb4b98cf5c93d0d859f6e5d6ecd3ed3072d9dd76"

RPROVIDES:${PN} += "runawk runawk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
