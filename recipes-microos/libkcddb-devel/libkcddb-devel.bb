SUMMARY = "Development files for KDE CDDB library"
DESCRIPTION = "This package includes the development headers for libkcddb."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libkcddb-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "8f6b5b2e12a307784af2c87647af68656eef2c5c9e0a5efac1cd5b35ebff2cd67953b6916776e36efc33922413dcf810d63570912cd0249df6f6e985d5fd21b8"

RPROVIDES:${PN} += "cmake(KF5Cddb) libkcddb-devel libkcddb-devel(aarch-64) libkcddb5-devel"
RDEPENDS:${PN} += "libKF5Cddb5 libkcddb"

inherit rpm
