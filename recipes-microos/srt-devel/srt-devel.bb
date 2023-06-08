SUMMARY = "Development files for the Secure Reliable Transport (SRT) library"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications with Secure Reliable Transport \
(SRT) support."
LICENSE = "MPL-2.0"

PV = "1.5.1"

RPM_NAME = "srt-devel-1.5.1-1.4.aarch64.rpm"
RPM_HASH = "4f830aef52111db32d1c398af48403dad5ca6caad83676223086140a4a9d8218d423621195d3fb10c207dd6f5e6334a0acc8a885f37affe9fef21f82bcbf96db"

RPROVIDES:${PN} += "pkgconfig(haisrt) pkgconfig(srt) srt-devel srt-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsrt1_5 pkgconfig(libcrypto) pkgconfig(openssl) srt"

inherit rpm
