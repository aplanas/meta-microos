SUMMARY = "SySV and LSB init script support for systemd (deprecated)"
DESCRIPTION = "This package ships the necessary files that enable minimal SysV and LSB init \
scripts support in systemd. It also contains the obsolete SysV init tools \
telinit(8) and runlevel(8). You should consider using systemctl(1) instead. \
 \
Unless you have a 3rd party application installed on your system that still \
relies on such scripts, this package should not be needed at all. \
 \
Please note that the content of this package is considered as deprecated."
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "systemd-sysvcompat-253.4-1.2.aarch64.rpm"
RPM_HASH = "a30b52de7935e35c7707089dc892dfbf1a996b3633ae37ce3a06e6cbe4fb722884c58c4bb9b68db6c377538c5ab89119ee4982034389dea76b4698b656430c7f"

RPROVIDES:${PN} += "systemd-sysvcompat systemd-sysvcompat(aarch-64) systemd-sysvinit:/usr/sbin/runlevel systemd-sysvinit:/usr/sbin/telinit"
RDEPENDS:${PN} += "/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libsystemd-shared-253.so()(64bit) libsystemd-shared-253.so(SD_SHARED)(64bit) systemd"

inherit rpm
