SUMMARY = "A set of SPI tools for Linux"
DESCRIPTION = "This package contains some simple command line tools to help using Linux \
spidev devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "spi-tools-1.0.2-1.2.aarch64.rpm"
RPM_HASH = "8b33eac1a682d2f6ee84511e4371dee13184e697baaa83dbca2203ceee8e1c11f2ca8f2b41b585768ce39ff0c6fa274ec20cd5d964f27686908dba44077eaa80"

RPROVIDES:${PN} += "spi-tools \
spi-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
udev"

inherit rpm
