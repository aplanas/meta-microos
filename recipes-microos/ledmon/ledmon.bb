SUMMARY = "Enclosure LED Utilities"
DESCRIPTION = "The ledctl application and ledmon daemon are part of Intel(R) LED \
ControlUtilities. They help to enable LED management for software RAID \
solutions."
LICENSE = "GPL-2.0-only"

PV = "0.96"

RPM_NAME = "ledmon-0.96-3.1.aarch64.rpm"
RPM_HASH = "38c8dc1ca0c2325a3642f2962d36a64cdbf298c3a47390978c8d9c965cb60fd89059c46ec1466e0835890d1f277c17a7c08ae3908fcae2cc31e4de78b5bbd9c8"

RPROVIDES:${PN} += "ledmon ledmon(aarch-64) sgpio:/sbin/ledmon sgpio:/{/usr/bin}/ledctl"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpci.so.3()(64bit) libpci.so.3(LIBPCI_3.0)(64bit) libpci.so.3(LIBPCI_3.1)(64bit) libpci.so.3(LIBPCI_3.5)(64bit) libsgutils2-1.48.so.2()(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) systemd"

inherit rpm
