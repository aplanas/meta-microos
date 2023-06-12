SUMMARY = "YaST2 - X11 support"
DESCRIPTION = "This package contains the programs and files for YaST2 X11 support."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-x11-4.6.0-1.2.aarch64.rpm"
RPM_HASH = "72114f08abc34f9db32b0551a5323d3f906ea526464d5db9a2eb01bf676f9e94bd775260c539f1e0ac962c9f39122c4da4fd17f021d13124a0db83e12ccd96a7"

RPROVIDES:${PN} += "yast2-x11 \
yast2-x11(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXmu.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
systemd \
yast2-theme"

inherit rpm
