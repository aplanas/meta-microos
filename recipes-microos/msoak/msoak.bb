SUMMARY = "A utility to simultaneously subscribe to MQTT servers/topics"
DESCRIPTION = "msoak is a utility to simultaneously subscribe to an arbitrary \
number of topics on any number of MQTT brokers and optionally \
modify or normalize received payloads before printing them out. \
This utility was created for being able to back up to a central \
location messages received by a number of brokers; instead of \
launching (and having to monitor success of) a large number of \
mosquitto_sub(1) programs, msoak took on the job. \
 \
msoak uses asynchronous connects to the MQTT brokers so that it \
can handle situations in which a broker may temporarily be \
unavailable."
LICENSE = "GPL-2.0-or-later"

PV = "0.8"

RPM_NAME = "msoak-0.8-1.12.aarch64.rpm"
RPM_HASH = "7e86bc33a65f513658f5baefd80f02011274ab9d10dc7be334e820a94b6561292cdecafb9250adb189cd973225097bdcd6a1c3def640a614e469387f50966304"

RPROVIDES:${PN} += "msoak \
msoak(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbsd.so.0()(64bit) \
libbsd.so.0(LIBBSD_0.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libconfig.so.11()(64bit) \
liblua5.3.so.5()(64bit) \
libmosquitto.so.1()(64bit)"

inherit rpm
