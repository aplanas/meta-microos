SUMMARY = "Plymouth 'Fade-Throbber' plugin"
DESCRIPTION = "This package contains the 'Fade-In' boot splash plugin for \
Plymouth. It features a centered image that fades in and out \
while other images pulsate around during system boot up."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-fade-throbber-22.02.122+94.4bd41a3-4.1.aarch64.rpm"
RPM_HASH = "802150562171d993e28511e78ca666d51a12cb6665595620d6f9733a10bc21608e53c4e9f7e7091cf147e1e494801065d895b5b8edc1b16de1b4f8328d09c1b8"

RPROVIDES:${PN} += "plymouth-plugin-fade-throbber plymouth-plugin-fade-throbber(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libply-splash-core.so.5()(64bit) libply-splash-core5 libply-splash-graphics.so.5()(64bit) libply-splash-graphics5 libply.so.5()(64bit) libply5"

inherit rpm
