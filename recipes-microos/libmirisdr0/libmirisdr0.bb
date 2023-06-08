SUMMARY = "SDR driver for MRi2500"
DESCRIPTION = "Library to run Mirics MRi2500 based DVB dongle as a SDR receiver."
LICENSE = "GPL-2.0"

PV = "0.0.0+git.20130608"

RPM_NAME = "libmirisdr0-0.0.0+git.20130608-1.24.aarch64.rpm"
RPM_HASH = "474ffc5416a19d36302b9282be29422f30488768be994cf0f9a3ff6720c25318e17373b51698839abeb3b551060d6a5fb0e1431be56451d5bd533a8d5d570c63"

RPROVIDES:${PN} += "libmirisdr libmirisdr.so.0()(64bit) libmirisdr0 libmirisdr0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libusb-1.0.so.0()(64bit) mirisdr-udev"

inherit rpm
