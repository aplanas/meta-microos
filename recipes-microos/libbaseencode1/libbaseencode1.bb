SUMMARY = "Base32 and base64 encoding library"
DESCRIPTION = "Library written in C for encoding and decoding data using base32 or base64 \
according to RFC-4648"
LICENSE = "Apache-2.0"

PV = "1.0.15"

RPM_NAME = "libbaseencode1-1.0.15-1.2.aarch64.rpm"
RPM_HASH = "485c51ea2e001c6ea8e628a901034783095edd0a3ac11476c547ed361e77618ff947f19b8972a149caf6bb68854355809802ddd2a10731708f9308dea0a70dc1"

RPROVIDES:${PN} += "libbaseencode.so.1()(64bit) libbaseencode1 libbaseencode1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
