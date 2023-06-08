SUMMARY = "Plymouth graphics libraries"
DESCRIPTION = "This package contains the libply-splash-graphics library \
used by graphical Plymouth splashes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply-splash-graphics5-22.02.122+94.4bd41a3-4.1.aarch64.rpm"
RPM_HASH = "68623d072dc5f2620dec1a3d73c305d58707be93e923883b91f13ade87f8cb8fb5c8c773757caa38e0deedc073be88c25b3ecffd1797e0eb789842bef3f15f6d"

RPROVIDES:${PN} += "libply-splash-graphics.so.5()(64bit) libply-splash-graphics5 libply-splash-graphics5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libply-splash-core.so.5()(64bit) libply.so.5()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
