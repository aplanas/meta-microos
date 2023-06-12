SUMMARY = "Xprint printer utility client library"
DESCRIPTION = "libXprintUtil provides utility Xpu APIs allowing client applications \
to access and manipulate information about printer capabilities from \
an Xprint server."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "libXprintUtil1-1.0.1-13.1.aarch64.rpm"
RPM_HASH = "1cd4f9cfb9acec76cecdf8665fd903263de3b6a598c65b8761b1bd6d97deb92eae4f9e01fb5e38a717f77f2c910b9f3785c0162ce7288695f975e13418c306cf"

RPROVIDES:${PN} += "libXprintUtil.so.1()(64bit) \
libXprintUtil1 \
libXprintUtil1(aarch-64) \
xorg-x11-libXprintUtil"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXp.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
