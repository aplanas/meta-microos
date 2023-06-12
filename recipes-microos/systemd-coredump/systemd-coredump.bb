SUMMARY = "Systemd tools for coredump management"
DESCRIPTION = "Systemd tools to store and manage coredumps. \
 \
Visit https://systemd.io/COREDUMP for more details."
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "systemd-coredump-253.4-2.1.aarch64.rpm"
RPM_HASH = "e96a073df7be4cd97c8568a201b7e55ea704f514ae0b00c658c00b306ba4be8f9c6664398df5a9926f0e9aa9f0f01b2a9d14fca9e168a9af18a297b66e09b46b"

RPROVIDES:${PN} += "config(systemd-coredump) \
systemd-coredump \
systemd-coredump(aarch-64) \
systemd:/usr/bin/coredumpctl"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liblz4.so.1()(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
libsystemd-shared-253.so()(64bit) \
libsystemd-shared-253.so(SD_SHARED)(64bit) \
libzstd.so.1()(64bit) \
systemd"

inherit rpm
