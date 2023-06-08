SUMMARY = "Utility for configuring 'MD' software RAID devices"
DESCRIPTION = "mdadm is a program that can be used to control Linux md devices."
LICENSE = "GPL-2.0-only"

PV = "4.2"

RPM_NAME = "mdadm-4.2-7.1.aarch64.rpm"
RPM_HASH = "57b5b0bfea4e6eaf9983d7e942bd6cea7b11eea7987a4f3d2ef2b29cd8f91611b18e580301a99390b5be55a99819e392e1303285150f5c907436eff7bf3da6ce"

RPROVIDES:${PN} += "mdadm mdadm(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/mkdir /usr/bin/touch coreutils fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
