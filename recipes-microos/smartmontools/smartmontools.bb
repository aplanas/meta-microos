SUMMARY = "Monitor for SMART devices"
DESCRIPTION = "SMARTmontools controls and monitors storage devices using the \
Self-Monitoring, Analysis, and Reporting Technology System (S.M.A.R.T.) \
built into ATA, SATA and SCSI Hard Drives. This is used to check the \
hard drive reliability and to predict drive failures. The suite \
contains two utilities. The first, smartctl, is a command line utility \
designed to perform simple S.M.A.R.T. tasks. The second, smartd, is a \
daemon that periodically monitors the smart status and reports errors \
to syslog. The package is compatible with the ATA/ATAPI-3 to -7 \
specification. The package is intended to incorporate as much 'vendor \
specific' and 'reserved' information as possible about disk drives. The \
commands man smartctl and man smartd will provide more information."
LICENSE = "GPL-2.0-or-later"

PV = "7.3"

RPM_NAME = "smartmontools-7.3-3.3.aarch64.rpm"
RPM_HASH = "d4a1e63e192c1bd2a1c7fcc539396775ac9eaeb2c584c7e46cc393e1b8be0e5f9487028389237fca341f24f42944c47f26524ccbc6779437f72659099029fdb9"

RPROVIDES:${PN} += "config(smartmontools) smartmontools smartmontools(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/mkdir /usr/bin/touch coreutils fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap-ng.so.0()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) systemd"

inherit rpm
