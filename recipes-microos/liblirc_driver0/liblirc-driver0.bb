SUMMARY = "LIRC driver library"
DESCRIPTION = "The LIRC driver library. To actually use the lirc plugins."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "liblirc_driver0-0.10.1-9.3.aarch64.rpm"
RPM_HASH = "beff6f8fba9fe52c313c1030c57d493559f698ae11959e4efb1cb7cc85612f62d192acc1ae628090efa7be45a8c93ebb0f4d2c1ff16f2a99f001dbaf2380a3b3"

RPROVIDES:${PN} += "liblirc_driver.so.0()(64bit) liblirc_driver0 liblirc_driver0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) liblirc.so.0()(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libudev.so.1(LIBUDEV_189)(64bit)"

inherit rpm
