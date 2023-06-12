SUMMARY = "MQTT support for syslog-ng"
DESCRIPTION = "This package provides MQTT support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-mqtt-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "70c471a0be91e008c7514e5d899b7944c0f6a8ccbbd8686ca5df449f9aa623b90aefd39200d8047330baa25e75b8a8187bd7056aba796ec60349d47b63fce285"

RPROVIDES:${PN} += "syslog-ng-mqtt \
syslog-ng-mqtt(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libevtlog-4.2.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libpaho-mqtt3cs.so.1()(64bit) \
libsyslog-ng-4.2.so.0()(64bit) \
syslog-ng"

inherit rpm
