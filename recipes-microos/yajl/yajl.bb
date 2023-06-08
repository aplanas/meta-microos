SUMMARY = "Yet Another JSON Library Tools"
DESCRIPTION = "YAJL is a small event-driven (SAX-style) JSON parser written in ANSI C, and a \
small validating JSON generator. \
 \
This package provides a few command-line utilities for processing JSON files."
LICENSE = "ISC"

PV = "2.1.0"

RPM_NAME = "yajl-2.1.0-6.5.aarch64.rpm"
RPM_HASH = "cb386f0b80a630466566b3cdac13872e99986a1d87688d87a4857f3babbd01a6953d81460b3c467aab76d658b944c299ddde88ae4935964e9675dee9b791eae6"

RPROVIDES:${PN} += "yajl yajl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libyajl2"

inherit rpm
