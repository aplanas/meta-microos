SUMMARY = "Development files for the Qt 6 SQL library"
DESCRIPTION = "Development files for the Qt 6 SQL library"
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-sql-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0219bf9c8979efaa0d38f0297da69d8f8e83c99a0e6505ad5de49543f4a05c2c6ad1296788d277934559e5a41d1e0a58f2db54238f7e49e6ec3a68023c5a1b50"

RPROVIDES:${PN} += "cmake(Qt6Sql) pkgconfig(Qt6Sql) qt6-sql-devel qt6-sql-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) libQt6Sql6 pkgconfig(Qt6Core)"

inherit rpm
