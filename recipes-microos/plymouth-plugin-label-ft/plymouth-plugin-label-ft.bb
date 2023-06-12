SUMMARY = "Plymouth FreeType label plugin"
DESCRIPTION = "This package contains the label control plugin for \
Plymouth. It provides the ability to render text on \
graphical boot splashes using FreeType"
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-label-ft-22.02.122+94.4bd41a3-5.1.aarch64.rpm"
RPM_HASH = "e259b66ba5926ec763d3a3678b130ad908872f2bc6341adf45eb4e8c68a657e29157a6810c2aa424f87ce2a4b57919a75bd31e769dd4a72f39bbadc817b370ad"

RPROVIDES:${PN} += "plymouth-plugin-label-ft plymouth-plugin-label-ft(aarch-64)"
RDEPENDS:${PN} += "fontconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libfreetype.so.6()(64bit) libply-splash-core.so.5()(64bit) libply-splash-graphics5"

inherit rpm
