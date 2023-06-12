SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
libpcre16 supports 16-bit and UTF-16 strings."
LICENSE = "BSD-3-Clause"

PV = "8.45"

RPM_NAME = "libpcre16-0-8.45-2.6.aarch64.rpm"
RPM_HASH = "ff0a47d6ab1ee1beb3ad5ab4081a4afd241c1be15b18964678a116e11843ec5f47b4d4aa8b3a27ed001f2e269d9a18321018894b7745669b983e3def55a60a56"

RPROVIDES:${PN} += "libpcre16-0 \
libpcre16-0(aarch-64) \
libpcre16.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
