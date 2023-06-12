SUMMARY = "USB firewall against BadUSB attacks"
DESCRIPTION = "It is a firewall against BadUSB attacks. \
A config file describes in which way devices would be accepted."
LICENSE = "GPL-2.0-only"

PV = "1.0.5"

RPM_NAME = "usbauth-1.0.5-1.2.aarch64.rpm"
RPM_HASH = "c4d86332e501ce73e911b9f564de0ca11230acfefbe0002389a30d5afc4440710754291ccc782fc1f55641882144376db1866c24e1547e4dc28210e796e2b882"

RPROVIDES:${PN} += "config(usbauth) \
usbauth \
usbauth(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libudev.so.1(LIBUDEV_199)(64bit) \
libusbauth-configparser.so.1()(64bit) \
systemd \
udev"

inherit rpm
