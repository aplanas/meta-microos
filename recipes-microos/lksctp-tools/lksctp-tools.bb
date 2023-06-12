SUMMARY = "Utilities for SCTP (Stream Control Transmission Protocol)"
DESCRIPTION = "This package contains the SCTP base runtime library and command line \
tools. \
 \
SCTP (Stream Control Transmission Protocol) is a message-oriented, \
reliable transport protocol with congestion control, support for \
transparent multihoming, and multiple ordered streams of messages."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.19"

RPM_NAME = "lksctp-tools-1.0.19-2.1.aarch64.rpm"
RPM_HASH = "5cb0692fd9d3dc4fd853b3fdabeeda80313f5102e28c8eebf878ba19bcc0b76c049785b0efe973a94d47053c5f254c29314d456d99d774217f2f0e371f501894"

RPROVIDES:${PN} += "libsctp.so.1()(64bit) \
libsctp.so.1(VERS_1)(64bit) \
libsctp.so.1(VERS_2)(64bit) \
libsctp.so.1(VERS_3)(64bit) \
libwithsctp.so.1()(64bit) \
lksctp-tools \
lksctp-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
