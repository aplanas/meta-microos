SUMMARY = "Development files for libunibreak"
DESCRIPTION = "The libunibreak-devel package contains libraries and header files for \
developing applications that use libunibreak."
LICENSE = "Zlib"

PV = "5.0"

RPM_NAME = "libunibreak-devel-5.0-1.6.aarch64.rpm"
RPM_HASH = "7a60dbb94507500c25408af0baa128d6751bb4cc91954609dd8dd40652642798d814dd5d6dc63d4804dc092daf14aa49e420a1a0909378674ab6a15629cf10ad"

RPROVIDES:${PN} += "liblinebreak-devel libunibreak-devel libunibreak-devel(aarch-64) pkgconfig(libunibreak)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libunibreak5 pkgconfig"

inherit rpm
