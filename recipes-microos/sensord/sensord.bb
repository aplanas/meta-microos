SUMMARY = "Hardware health monitoring daemon"
DESCRIPTION = "sensord is a daemon that can be used to periodically log sensor \
readings from hardware health-monitoring chips to the system logs or a \
round-robin database (RRD) and to alert when a sensor alarm is \
signalled; for example, if a fan fails, a temperature limit is \
exceeded, etc."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.0"

RPM_NAME = "sensord-3.6.0-8.7.aarch64.rpm"
RPM_HASH = "4bd470eaf70dae8a1da4faddb8bb389dc0a7d07055a99e96a54f74e3410f2f25cb8e4543bfa52ed5ef08ba1515fa1d9d785ed398834ec36c1a15ce9b8f2ef115"

RPROVIDES:${PN} += "sensord \
sensord(aarch-64) \
sensors:/usr/sbin/sensord"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
librrd.so.8()(64bit) \
libsensors.so.4()(64bit)"

inherit rpm
