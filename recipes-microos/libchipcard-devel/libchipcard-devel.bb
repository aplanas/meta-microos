SUMMARY = "Header files for libchipcard, a library for accessing smartcards"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.6"

RPM_NAME = "libchipcard-devel-5.1.6-1.11.aarch64.rpm"
RPM_HASH = "4ebb0ba74041cb42bf1102a3e7f44d0ad69022809d787a4f7d312aa0cade379c48bd6cd7293ba83c458e23d4ed44cff912cf5273c2cf962ee5ac18197718090e"

RPROVIDES:${PN} += "libchipcard-devel libchipcard-devel(aarch-64) pkgconfig(libchipcard-client) pkgconfig(libchipcard-server)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config gwenhywfar-devel libchipcard libchipcard6 libusb-devel pcsc-lite-devel sysfsutils"

inherit rpm
