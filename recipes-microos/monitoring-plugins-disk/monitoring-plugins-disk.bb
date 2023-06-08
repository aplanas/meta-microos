SUMMARY = "Check disk space"
DESCRIPTION = "This plugin checks the amount of used disk space on a mounted file system and \
generates an alert if free space is less than one of the threshold values."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-disk-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "066432aa97e04444ece1384b975923ac046fba158b9e58b02466e45317646008a8e41e79e19b0baaa11f3219d8ff6508c0994a6c81bcb2f9955c75b186618868"

RPROVIDES:${PN} += "config(monitoring-plugins-disk) monitoring-plugins-disk monitoring-plugins-disk(aarch-64) nagios-plugins-disk"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
