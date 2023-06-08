SUMMARY = "Plymouth 'space-flares' plugin"
DESCRIPTION = "This package contains the 'space-flares' boot splash plugin for \
Plymouth. It features a corner image with animated flares."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-space-flares-22.02.122+94.4bd41a3-4.1.aarch64.rpm"
RPM_HASH = "39a52ac2a1a0f1838729853ae5a728e5972c9ca2943774e678dc458c9740ad0478c8657736bc7183b4112670c98d22bae6070c1928ab2af137cf2f2d47369220"

RPROVIDES:${PN} += "plymouth-plugin-space-flares plymouth-plugin-space-flares(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libply-splash-core.so.5()(64bit) libply-splash-core5 libply-splash-graphics.so.5()(64bit) libply-splash-graphics5 libply.so.5()(64bit) libply5 plymouth-plugin-label"

inherit rpm
