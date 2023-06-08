SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5."
LICENSE = "BSD-3-Clause"

PV = "8.45"

RPM_NAME = "pcre-tools-8.45-2.6.aarch64.rpm"
RPM_HASH = "0df54ef5742e73cbe8bf69ee9bd816173057ee6341e649498cfb7bb22b1d0346e86e404ff0f0b2d2075c2f2b04bce27629648af0a659e4a8f85bf994f06f29d1"

RPROVIDES:${PN} += "pcre-tools pcre-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpcre.so.1()(64bit) libpcre16.so.0()(64bit) libpcreposix.so.0()(64bit)"

inherit rpm
