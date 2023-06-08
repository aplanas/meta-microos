SUMMARY = "XML Parser Toolkit"
DESCRIPTION = "Expat is an XML parser library written in C. It is a stream-oriented \
parser in which an application registers handlers for things the \
parser might find in the XML document (like start tags)."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "libexpat1-2.5.0-2.3.aarch64.rpm"
RPM_HASH = "1d538353652cd15ee66562a5176e8f624dca93e2456299c4165a23b541e5d040f486a9eabaca701223939aa1d7bb2f56ce55112ddc886d9f43ea94360c659429"

RPROVIDES:${PN} += "libexpat.so.1()(64bit) libexpat1 libexpat1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.36)(64bit)"

inherit rpm
