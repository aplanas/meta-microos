SUMMARY = "XTRX Low-level API library"
DESCRIPTION = "Low level XTRX hardware abstraction library."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "libxtrxll0-0.0.0+git.20201202-2.6.aarch64.rpm"
RPM_HASH = "ecb7bf9e7d66d3021f7eb872886cbb9505a768550986ccc6dc980b6739b091fdb59d6d90fa5f7d88df4d25bb14c07289c63e702d84347c34fd97363224311cc7"

RPROVIDES:${PN} += "libxtrxll.so.0()(64bit) libxtrxll0 libxtrxll0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libusb3380.so.0()(64bit) xtrx-usb-udev"

inherit rpm
