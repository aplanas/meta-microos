SUMMARY = "Development files for the Qt5 SQL library"
DESCRIPTION = "Qt 5 libraries which are used for connection with an SQL server. You \
will need also a plugin package for a supported SQL server."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5Sql-devel-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "701746ddd2bf3dfa138e0d12b329feb3d1bb72314bfa5ae17db15034087052975a72ce7d1b6044001985463f82094a86c70a28cfa3aeb3c3e85bdd639c50a299"

RPROVIDES:${PN} += "cmake(Qt5Sql) libQt5Sql-devel libQt5Sql-devel(aarch-64) pkgconfig(Qt5Sql)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Core-devel libQt5Sql5 pkgconfig(Qt5Core)"

inherit rpm
