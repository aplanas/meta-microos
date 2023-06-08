SUMMARY = "Library That Allows Access to Smart Cards (Chipcards)"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.6"

RPM_NAME = "libchipcard6-5.1.6-1.11.aarch64.rpm"
RPM_HASH = "342d0682ab615ed9f9ecf96ba639615b9265999b41bdcc7f660bd164027b33883fe95b398d120740f7042c3962f252b9a66b2a7c847352ac9c03e75290075a0b"

RPROVIDES:${PN} += "libchipcard.so.6()(64bit) libchipcard6 libchipcard6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libchipcard libgwenhywfar.so.79()(64bit) libpcsclite.so.1()(64bit) libz.so.1()(64bit)"

inherit rpm
