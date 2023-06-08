SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE2 library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
PCRE2 is a re-working of the original PCRE library to provide an entirely new \
API. \
 \
This package contains static versions of the PCRE2 libraries."
LICENSE = "BSD-3-Clause"

PV = "10.42"

RPM_NAME = "pcre2-devel-static-10.42-3.3.aarch64.rpm"
RPM_HASH = "d0988fe8c1d5f8a9d53652ecbf687233588e77afd74bbe4e133437166d24d88f400ca9112e1827ae7c179364e703c93b2305cedba3b56b436952af5821950c3b"

RPROVIDES:${PN} += "pcre2-devel-static pcre2-devel-static(aarch-64)"
RDEPENDS:${PN} += "pcre2-devel"

inherit rpm
