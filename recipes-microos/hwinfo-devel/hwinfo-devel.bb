SUMMARY = "Headers for the Hardware Detection Library"
DESCRIPTION = "This library collects information about the hardware installed on a \
system."
LICENSE = "GPL-2.0-or-later"

PV = "22.2"

RPM_NAME = "hwinfo-devel-22.2-1.3.aarch64.rpm"
RPM_HASH = "1ef60d134ed44352c8c3fb91e3a304d060b29c85874b732cd761fe619560e733d10309721742492c9cd67f35e4e5e052e47231827ff58ac65fd2f6d490adfd4b"

RPROVIDES:${PN} += "hwinfo-devel hwinfo-devel(aarch-64) libhddev pkgconfig(hwinfo)"
RDEPENDS:${PN} += "/usr/bin/perl /usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libexpat-devel libhd22 perl-XML-Parser perl-XML-Writer udev wireless-tools"

inherit rpm
