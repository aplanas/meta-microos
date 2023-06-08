SUMMARY = "Systemd tools for coredump management"
DESCRIPTION = "Systemd tools to store and manage coredumps. \
 \
Visit https://systemd.io/COREDUMP for more details."
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "systemd-coredump-253.4-1.2.aarch64.rpm"
RPM_HASH = "9f5cf3d78d4929f0096b4425a34e9153d4fc7c1a8f4fb114f5700f623262850c224381596f6967c4ca7fb226e5157975fe8e35ae3191dc1bff9b7774290b7455"

RPROVIDES:${PN} += "config(systemd-coredump) systemd-coredump systemd-coredump(aarch-64) systemd:/usr/bin/coredumpctl"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) liblz4.so.1()(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libsystemd-shared-253.so()(64bit) libsystemd-shared-253.so(SD_SHARED)(64bit) libzstd.so.1()(64bit) systemd"

inherit rpm
