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

RPM_NAME = "systemd-sysvcompat-253.4-2.1.aarch64.rpm"
RPM_HASH = "7b2f0c7a1cba63cee9c627b8915d538b841fc9612947ea055e25718ea5928325addb0d5c7b4ace117425624a3e6a3edf81df1d68e046d0c08a86c1b7620cc242"

RPROVIDES:${PN} += "systemd-sysvcompat systemd-sysvcompat(aarch-64) systemd-sysvinit:/usr/sbin/runlevel systemd-sysvinit:/usr/sbin/telinit"
RDEPENDS:${PN} += "/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libsystemd-shared-253.so()(64bit) libsystemd-shared-253.so(SD_SHARED)(64bit) systemd"

inherit rpm
