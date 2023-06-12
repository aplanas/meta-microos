SUMMARY = "An implementation of the Unicode BiDi algorithm"
DESCRIPTION = "This library implements the algorithm as described in 'Unicode \
Standard Annex #9, the Bidirectional Algorithm, \
http://www.unicode.org/unicode/reports/tr9/'. FriBidi is \
tested against the Bidi Reference Code and, to the best of the \
developers' knowledge, does not contain any conformance bugs. \
 \
The API was inspired by the document 'Bi-Di languages support - BiDi \
API proposal' by Franck Portaneri, which he wrote as a proposal for \
adding BiDi support to Mozilla."
LICENSE = "LGPL-2.1-only"

PV = "1.0.12"

RPM_NAME = "libfribidi0-1.0.12-1.6.aarch64.rpm"
RPM_HASH = "3dbbdef618022c3900ec82f47752504ff4b330b69d001c42c6645e81d44a695e07b5601b1f975bf956bdf6bd5a3e91a28aa43f56cfab3b19f45b90273bc54e9e"

RPROVIDES:${PN} += "libfribidi.so.0()(64bit) \
libfribidi0 \
libfribidi0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
