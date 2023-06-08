SUMMARY = "CmmonMark parsing and rendering library"
DESCRIPTION = "It provides a shared library (`libcmark`) with functions for parsing \
CommonMark documents to an abstract syntax tree (AST), manipulating \
the AST, and rendering the document to HTML, groff man, LaTeX, \
CommonMark, or an XML representation of the AST.  It also provides a \
command-line program (`cmark`) for parsing and rendering CommonMark \
documents."
LICENSE = "BSD-2-Clause & MIT & CC-BY-SA-4.0"

PV = "0.30.3"

RPM_NAME = "libcmark0_30_3-0.30.3-1.2.aarch64.rpm"
RPM_HASH = "380499ec1a84be9e5bbf6681495b94222f59f36dac887e62913d4cf07f83f87a42f113d44e84c731fd0b4f690d1966d7fbb59479e68bfe384001498fa36422f9"

RPROVIDES:${PN} += "libcmark.so.0.30.3()(64bit) libcmark0_30_3 libcmark0_30_3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
