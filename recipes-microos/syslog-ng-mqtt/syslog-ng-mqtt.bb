SUMMARY = "MQTT support for syslog-ng"
DESCRIPTION = "This package provides MQTT support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.0.1"

RPM_NAME = "syslog-ng-mqtt-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "2da556243ab6f2e261ce19bcdbd1f58119d076f45d00433efe16a2009f1ef6dfd9b8ce6ad0b9c6d43e856362d7af20adceb6ee30a08948ba0b744b1e79b01301"

RPROVIDES:${PN} += "libmqtt.so()(64bit) syslog-ng-mqtt syslog-ng-mqtt(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libevtlog-4.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libpaho-mqtt3cs.so.1()(64bit) libsyslog-ng-4.0.so.0()(64bit) syslog-ng"

inherit rpm
