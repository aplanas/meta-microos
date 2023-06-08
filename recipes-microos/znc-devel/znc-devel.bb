SUMMARY = "Development files to build modules for ZNC"
DESCRIPTION = "ZNC is an IRC bouncer with many features like detaching, multiple \
users, per channel playback buffer, SSL, IPv6, transparent DCC bouncing, and \
C++ module support. \
 \
This package contains the development headers for developing modules for ZNC."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "znc-devel-1.8.2-3.6.aarch64.rpm"
RPM_HASH = "223d451ec1250503b5ac762075ce3ba36a4f85a20c6d190507c2a1232d95a9e6d673c1e4e774b41b8cde9594cf20c61db4d8d72f64d40a289139da223d8a6a9b"

RPROVIDES:${PN} += "pkgconfig(znc) znc-devel znc-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config znc"

inherit rpm
