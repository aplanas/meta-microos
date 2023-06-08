SUMMARY = "MMS stream protocol library"
DESCRIPTION = "LibMMS is a common library for parsing mms:// and mmsh:// type network streams. \
These are commonly used to stream Windows Media Video content over the web. \
LibMMS itself is only for receiving MMS stream, it doesn't handle sending at \
all."
LICENSE = "LGPL-2.1+"

PV = "0.6.4"

RPM_NAME = "libmms0-0.6.4-5.26.aarch64.rpm"
RPM_HASH = "61cd420c67e361656d599b361ae991e405e5bbfaa7264f8e8ebf81459a243abe8edc92881390b6f40f76f8dca280bcf3d2474f674db51ad670148e4135e6f07d"

RPROVIDES:${PN} += "libmms.so.0()(64bit) libmms0 libmms0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
