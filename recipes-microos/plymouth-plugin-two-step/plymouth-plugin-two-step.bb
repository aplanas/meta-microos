SUMMARY = "Plymouth 'two-step' plugin"
DESCRIPTION = "This package contains the 'two-step' boot splash plugin for \
Plymouth. It features a two phased boot process that starts with \
a progressing animation synced to boot time and finishes with a \
short, fast one-shot animation."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-two-step-22.02.122+94.4bd41a3-4.1.aarch64.rpm"
RPM_HASH = "67e31e5c83f8857d0e6d117b513832b2b89937402beaf028dca4af8cb0fccb0697884e4d90171b86c45209d4863ad07b4def45939b6a156d154bfde37c3b715c"

RPROVIDES:${PN} += "plymouth-plugin-two-step plymouth-plugin-two-step(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libply-splash-core.so.5()(64bit) libply-splash-core5 libply-splash-graphics.so.5()(64bit) libply-splash-graphics5 libply.so.5()(64bit) libply5 plymouth-plugin-label"

inherit rpm
