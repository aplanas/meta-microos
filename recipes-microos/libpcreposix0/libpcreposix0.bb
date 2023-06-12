SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
pcreposix provides a POSIX-compatible API to the PCRE engine."
LICENSE = "BSD-3-Clause"

PV = "8.45"

RPM_NAME = "libpcreposix0-8.45-2.6.aarch64.rpm"
RPM_HASH = "8176f65088fa7282bc7e9d62bad33dcf78568e4a6ed4b9f429818a67daa93a48b8f3836d837de5ab5ac57b477f9cc47d3746554bc5686b9270610e10e91a2713"

RPROVIDES:${PN} += "libpcreposix.so.0()(64bit) \
libpcreposix0 \
libpcreposix0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpcre.so.1()(64bit)"

inherit rpm
