SUMMARY = "C runtime for the ANTLR parsing library"
DESCRIPTION = "ANTLR, ANother Tool for Language Recognition, is a language tool that provides a \
framework for constructing recognizers, interpreters, compilers, and translators \
from grammatical descriptions containing actions in a variety of target \
languages. ANTLR provides excellent support for tree construction, tree walking, \
translation, error recovery, and error reporting."
LICENSE = "BSD-3-Clause"

PV = "3.4"

RPM_NAME = "libantlr3c3-3.4-4.25.aarch64.rpm"
RPM_HASH = "8cbd5565502eb87ef0208cde883862f4ff7fa9fa5303d5fdcbec5edfe1e96651cef636417085a4bbf91078fd7e04259e6014b140a9cee5e032adb6a9fe7098ca"

RPROVIDES:${PN} += "libantlr3c.so.3()(64bit) \
libantlr3c3 \
libantlr3c3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
