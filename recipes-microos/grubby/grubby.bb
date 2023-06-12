SUMMARY = "Command line tool for updating bootloader configs"
DESCRIPTION = "grubby is a command line tool for updating and displaying information about \
the configuration files for the grub, lilo, elilo (ia64), yaboot (powerpc) \
and zipl (s390) boot loaders. It is primarily designed to be used from scripts \
which install new kernels and need to find information about the current boot \
environment."
LICENSE = "GPL-2.0-or-later"

PV = "20200210.99d10a3"

RPM_NAME = "grubby-20200210.99d10a3-2.8.aarch64.rpm"
RPM_HASH = "440abb91651e35d3f88e92c16f4b4c1aec5f2499b269ede20a2f33561fc5a5042b2f5e863e83ff0ca89814529f8bd17dac55e1909afdfdbc8470c39b87abb0af"

RPROVIDES:${PN} += "grubby \
grubby(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblkid.so.1()(64bit) \
libblkid.so.1(BLKID_1.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit)"

inherit rpm
