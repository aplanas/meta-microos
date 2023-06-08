SUMMARY = "Realtime Policy and Watchdog Daemon"
DESCRIPTION = "RealtimeKit is a D-Bus system service that changes the scheduling policy of \
user processes/threads to SCHED_RR (i.e. realtime scheduling mode) on \
request. It is intended to be used as a secure mechanism to allow real-time \
scheduling to be used by normal user processes."
LICENSE = "BSD-3-Clause & GPL-3.0-or-later"

PV = "0.13"

RPM_NAME = "rtkit-0.13-4.7.aarch64.rpm"
RPM_HASH = "0031c45f95616467bde4e5a05a4870d8c3bd7a35908dfb16a1488bee0a75d5b55fd2ab182d982fa489363cf103560e08aa91d59048cd588082a7792d386a2793"

RPROVIDES:${PN} += "group(rtkit) rtkit rtkit(aarch-64) user(rtkit)"
RDEPENDS:${PN} += "/bin/sh dbus-1 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap.so.2()(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) polkit sysuser-shadow"

inherit rpm
