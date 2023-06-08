SUMMARY = "Library for Handling OpenType Fonts"
DESCRIPTION = "Library for handling OpenType fonts,especially those needed for CJK and other non-Latin \
languages."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.16"

RPM_NAME = "libotf-0.9.16-1.10.aarch64.rpm"
RPM_HASH = "1f6dfb1fee64b85fe4431d6c421656c88c46c6244dcdc9fec76f55e19d224686805e4f5b3b5808adb0f3239e9453abd6068c752cc6e9f0fe005b1d7f1e120ea7"

RPROVIDES:${PN} += "libotf libotf(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXaw.so.7()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit) libotf.so.1()(64bit)"

inherit rpm
