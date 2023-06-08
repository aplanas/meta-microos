SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE2 library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
PCRE2 is a re-working of the original PCRE library to provide an entirely new \
API. \
 \
This PCRE2 library variant supports 8-bit and UTF-8 strings. \
(See also libpcre2-16 and libpcre2-32)"
LICENSE = "BSD-3-Clause"

PV = "10.42"

RPM_NAME = "libpcre2-8-0-10.42-3.3.aarch64.rpm"
RPM_HASH = "80abeb30b583647e4a641d57dd8bd382b3632e4142fa7352c7d062869bb104ca7f93c70fe14994391cd7f029390e25ee8f54520885921eb76e6765f90de9a887"

RPROVIDES:${PN} += "libpcre2-8-0 libpcre2-8-0(aarch-64) libpcre2-8.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
