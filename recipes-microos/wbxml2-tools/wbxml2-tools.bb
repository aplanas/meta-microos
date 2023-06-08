SUMMARY = "Tools for libwbxml2"
DESCRIPTION = "wbxml2 is a library that includes a WBXML (Wireless Binary XML) \
parser and a WBXML compiler. Unlike wbxml, it uses expat instead of \
libxml2. WBXML contains a library and its associated tools to parse, \
ecode and handle WBXML documents."
LICENSE = "GPL-2.0-or-later"

PV = "0.11.8"

RPM_NAME = "wbxml2-tools-0.11.8-1.2.aarch64.rpm"
RPM_HASH = "869d25ad44c2a3d6cedb6c5cb49921712572570455b1a5bf192d3afe44d4abab9a60d5e8981961ea1eb634914a343b4639ae54e831a6e2696044bbcf33bcf7e5"

RPROVIDES:${PN} += "wbxml2 wbxml2-tools wbxml2-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libwbxml2-1 libwbxml2.so.1()(64bit)"

inherit rpm
