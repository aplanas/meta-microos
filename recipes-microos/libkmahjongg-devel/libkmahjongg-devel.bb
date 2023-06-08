SUMMARY = "Library for Mahjongg tiles: Build Environment"
DESCRIPTION = "This package contains all necessary files and libraries needed to \
develop games that uses Mahjongg tiles."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libkmahjongg-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "63e01875976d830e4d05b9166856e52e246d15d6009845828e464baa9bc371e357d8ec1c374f485fa9895fbc416577b688b4c0fa8aa61b76058ff568d1c3cdc6"

RPROVIDES:${PN} += "cmake(KF5KMahjongglib) libkmahjongg-devel libkmahjongg-devel(aarch-64) libkmahjongg-kf5-devel"
RDEPENDS:${PN} += "libKF5KMahjongglib5"

inherit rpm
