SUMMARY = "Development files for the Qt5 SQL library"
DESCRIPTION = "Qt 5 libraries which are used for connection with an SQL server. You \
will need also a plugin package for a supported SQL server."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Sql-devel-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "459e357b20eca563cfec566373ca52db5c13f8abfe38fb5ec749cd84ad8f6337e6bffb09767fa5224c5476f5abc5cf818b9cf0985ade9b06a3605a7817c2f5a3"

RPROVIDES:${PN} += "cmake(Qt5Sql) libQt5Sql-devel libQt5Sql-devel(aarch-64) pkgconfig(Qt5Sql)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Core-devel libQt5Sql5 pkgconfig(Qt5Core)"

inherit rpm
