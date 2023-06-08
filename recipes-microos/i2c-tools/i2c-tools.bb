SUMMARY = "A heterogeneous set of I2C tools for Linux"
DESCRIPTION = "This package contains a heterogeneous set of I2C tools for Linux: a bus \
probing tool, a chip dumper, register-level access helpers, EEPROM \
decoding scripts, and more."
LICENSE = "GPL-2.0-or-later"

PV = "4.3"

RPM_NAME = "i2c-tools-4.3-1.7.aarch64.rpm"
RPM_HASH = "978df760f1f0cccc2c6066b62106a74e7da4d1b94d486673908c648753482b0434cb601f50159438b7f75a4d9f70f4516c767a526dcd1befb37ee21e36ddc0f8"

RPROVIDES:${PN} += "i2c-tools i2c-tools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libi2c.so.0()(64bit) udev"

inherit rpm
