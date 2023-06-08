SUMMARY = "A client library to multiplex connections from and to iOS devices"
DESCRIPTION = "'usbmuxd' stands for 'USB multiplexing daemon'. This daemon is in charge of \
multiplexing connections over USB to an iPhone or iPod touch. To users, it means \
you can sync your music, contacts, photos, etc. over USB. To developers, it \
means you can connect to any listening localhost socket on the device. usbmuxd \
is not used for tethering data transfer, which uses a dedicated USB interface as \
a virtual network device. \
 \
This package contains the usbmuxd communication interface library 'libusbmuxd'."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "2.0.2"

RPM_NAME = "libusbmuxd-2_0-6-2.0.2-1.9.aarch64.rpm"
RPM_HASH = "78166f109e1ecccb4253e17d9c698a1f2cc93b94b2c006e4f22826909e72e8b4574258b88fe0b3041046a88a879ca5a9009719359614189523e90e5c0c45dff3"

RPROVIDES:${PN} += "libusbmuxd-2.0.so.6()(64bit) libusbmuxd-2_0-6 libusbmuxd-2_0-6(aarch-64) libusbmuxd6"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libplist-2.0.so.3()(64bit)"

inherit rpm
