SUMMARY = "Hardware health monitoring for Linux"
DESCRIPTION = "This package includes programs that show data from some sensor chips. \
The interface /proc/bus/i2c/ is provided by loading kernel modules. \
Which modules to load can be interactively detected as root by calling \
/usr/sbin/sensors-detect. Warning, before using the sensors the default \
configuration in /etc/sensors.conf has to be checked and changed to fit \
the actual set up of the mainboard and the BIOS used on that specific \
mainboard!"
LICENSE = "GPL-2.0-or-later"

PV = "3.6.0"

RPM_NAME = "sensors-3.6.0-8.7.aarch64.rpm"
RPM_HASH = "9857b0e86a17e52c6b2c1f8114ce3e13c8567091d1dd3e73f63f60c949896d0b8c2a95951c736f905b5eabe0c99e869393ae7a05d8243db348c1f7db559cd3c3"

RPROVIDES:${PN} += "sensors sensors(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libsensors.so.4()(64bit) modutils systemd"

inherit rpm
