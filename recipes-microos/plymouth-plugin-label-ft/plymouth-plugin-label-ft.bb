SUMMARY = "Plymouth FreeType label plugin"
DESCRIPTION = "This package contains the label control plugin for \
Plymouth. It provides the ability to render text on \
graphical boot splashes using FreeType"
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-label-ft-22.02.122+94.4bd41a3-4.1.aarch64.rpm"
RPM_HASH = "ead9784c1e32e1b51aa9903b70194ba5df5ece62bcb032df28571c61b29498aaee163cb446ca7655b2faa306562c0aa8b8c10e57cd5c79cf8f45ce76b4e26795"

RPROVIDES:${PN} += "plymouth-plugin-label-ft plymouth-plugin-label-ft(aarch-64)"
RDEPENDS:${PN} += "fontconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libfreetype.so.6()(64bit) libply-splash-core.so.5()(64bit) libply-splash-graphics5"

inherit rpm
