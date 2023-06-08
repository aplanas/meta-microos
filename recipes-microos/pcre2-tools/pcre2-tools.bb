SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE2 library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
PCRE2 is a re-working of the original PCRE library to provide an entirely new \
API."
LICENSE = "BSD-3-Clause"

PV = "10.42"

RPM_NAME = "pcre2-tools-10.42-3.3.aarch64.rpm"
RPM_HASH = "bc113502b9eff93ac7793d93af8c2383836d2ab1a63f7f3ca612018f28404c8895554b9385490c6c6856ffe2020b0ed17a601f7ce422403b966b027573b1dfcd"

RPROVIDES:${PN} += "pcre2-tools pcre2-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libedit.so.0()(64bit) libpcre2-16.so.0()(64bit) libpcre2-32.so.0()(64bit) libpcre2-8.so.0()(64bit) libpcre2-posix.so.3()(64bit) libz.so.1()(64bit)"

inherit rpm
