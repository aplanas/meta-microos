SUMMARY = "Development files to build modules for ZNC"
DESCRIPTION = "ZNC is an IRC bouncer with many features like detaching, multiple \
users, per channel playback buffer, SSL, IPv6, transparent DCC bouncing, and \
C++ module support. \
 \
This package contains the development headers for developing modules for ZNC."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "znc-devel-1.8.2-3.7.aarch64.rpm"
RPM_HASH = "6166de9c1c8250da53396822b254ec06760b7c85dbf80b240045064b1da37d7a61680dfb577316dfa31ceeb077082ad256bd8c6c9806560d3599a497a6675902"

RPROVIDES:${PN} += "pkgconfig(znc) znc-devel znc-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config znc"

inherit rpm
