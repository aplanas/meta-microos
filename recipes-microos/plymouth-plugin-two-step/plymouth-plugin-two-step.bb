SUMMARY = "Plymouth 'two-step' plugin"
DESCRIPTION = "This package contains the 'two-step' boot splash plugin for \
Plymouth. It features a two phased boot process that starts with \
a progressing animation synced to boot time and finishes with a \
short, fast one-shot animation."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-two-step-22.02.122+94.4bd41a3-5.1.aarch64.rpm"
RPM_HASH = "f56b6e62577932193d09848c7da2215b1140018d35bd48d826d8ab16486f6cb72f9f3e4eacd01e6c863dc8de2505593e6f40342bedba333fcef49dd3f969d1b0"

RPROVIDES:${PN} += "plymouth-plugin-two-step \
plymouth-plugin-two-step(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libply-splash-core.so.5()(64bit) \
libply-splash-core5 \
libply-splash-graphics.so.5()(64bit) \
libply-splash-graphics5 \
libply.so.5()(64bit) \
libply5 \
plymouth-plugin-label"

inherit rpm
