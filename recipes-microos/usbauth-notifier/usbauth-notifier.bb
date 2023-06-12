SUMMARY = "Notifier for USB Firewall to use with desktop environments"
DESCRIPTION = "A notifier for the usbauth firewall against BadUSB attacks. The user could manually allow or deny USB devices."
LICENSE = "GPL-2.0-only"

PV = "1.0.4"

RPM_NAME = "usbauth-notifier-1.0.4-1.6.aarch64.rpm"
RPM_HASH = "7e189ad66dcc294451497dd65673babe549b3468692c0c045aa592442371374a802832a3dbe6bdc6341fc7f4b10b1ecb8594f2cfc537eeb514a23f59c5c38c36"

RPROVIDES:${PN} += "usbauth-notifier \
usbauth-notifier(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libnotify.so.4()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libusbauth-configparser.so.1()(64bit) \
permissions \
usbauth"

inherit rpm
