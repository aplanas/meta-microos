SUMMARY = "A library for font loading and glyph rasterization using FreeType/pixman"
DESCRIPTION = "fcft is a font loading and glyph rasterization library built on-top \
of FontConfig, FreeType2 and pixman."
LICENSE = "MIT"

PV = "3.1.5"

RPM_NAME = "libfcft4-3.1.5-1.3.aarch64.rpm"
RPM_HASH = "1745d57ceb65d93b105c1f855d7952740596853756d8f69b23d8ed7e3374fbec7c0d1d2671a18f68b75d85155a66d6cecaa0d6d9318f926c7041f1ca43329431"

RPROVIDES:${PN} += "libfcft.so.4()(64bit) libfcft4 libfcft4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfontconfig.so.1()(64bit) libfreetype.so.6()(64bit) libharfbuzz.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpixman-1.so.0()(64bit) libutf8proc.so.2()(64bit)"

inherit rpm
