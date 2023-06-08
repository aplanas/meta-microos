SUMMARY = "Quake III"
DESCRIPTION = "Quake III first person shooter. This package only includes the binary \
files, you still need the data files from the original Quake III CD or \
the Demo."
LICENSE = "GPL-2.0-or-later"

PV = "1.36+git.20221123"

RPM_NAME = "ioquake3-1.36+git.20221123-1.3.aarch64.rpm"
RPM_HASH = "606ad3c3a9971bd28274ae54f184895bdc1b46b3e107303e9791c78cd004af0be03d15d8ba92165ad4d550df5749cede95b92aff82f7f227011cd89f84947f23"

RPROVIDES:${PN} += "application() application(ioquake3.desktop) ioquake3 ioquake3(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
