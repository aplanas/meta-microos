SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE2 library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
PCRE2 is a re-working of the original PCRE library to provide an entirely new \
API. \
 \
libpcre2-16 supports 16-bit and UTF-16 strings."
LICENSE = "BSD-3-Clause"

PV = "10.42"

RPM_NAME = "libpcre2-16-0-10.42-3.3.aarch64.rpm"
RPM_HASH = "7ff80ad570211fa8136b5f149273555218b5cd1386b3d0d2997617af90e0665dc06d325c451cadd87c693269a5bd9122f8fbb755980febf874363bd2dbc8781b"

RPROVIDES:${PN} += "libpcre2-16-0 libpcre2-16-0(aarch-64) libpcre2-16.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
