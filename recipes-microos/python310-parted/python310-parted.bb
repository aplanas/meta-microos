SUMMARY = "Python module for GNU parted"
DESCRIPTION = "Python module for the parted library.  It is used for manipulating \
partition tables."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.0"

RPM_NAME = "python310-parted-3.12.0-3.1.aarch64.rpm"
RPM_HASH = "b1199d6f88f912f6a0cb6f3235929c159291444978769afc27abb451fbe18db686567b39943b9473084336bbd315a9f581e36da24332ba3244ecbc2ff12427c0"

RPROVIDES:${PN} += "python3-parted python3.10dist(pyparted) python310-parted python310-parted(aarch-64) python3dist(pyparted)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libparted.so.2()(64bit) parted python(abi)"

inherit rpm
