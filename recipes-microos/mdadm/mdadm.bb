SUMMARY = "Utility for configuring 'MD' software RAID devices"
DESCRIPTION = "mdadm is a program that can be used to control Linux md devices."
LICENSE = "GPL-2.0-only"

PV = "4.2"

RPM_NAME = "mdadm-4.2-8.1.aarch64.rpm"
RPM_HASH = "ce4869df4da07eabe5db1feddf6d617cdaf6f7fee8833359ba0f2565d28b085fdf5d058249072dee8d9ee5a53771359e922378ec343b94bfdcac18e3d66a03d1"

RPROVIDES:${PN} += "mdadm mdadm(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/mkdir /usr/bin/touch coreutils fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
