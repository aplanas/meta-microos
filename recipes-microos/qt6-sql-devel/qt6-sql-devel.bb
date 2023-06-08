SUMMARY = "Development files for the Qt 6 SQL library"
DESCRIPTION = "Development files for the Qt 6 SQL library"
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-sql-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "4de893ad4d92c138dd1f5c8184256f943d45d46b2eb7821c537d6ab39e0442892393a126d211de704c50d134aec85c26c9cbc6adccca7f89b1f9bf964222c6dc"

RPROVIDES:${PN} += "cmake(Qt6Sql) pkgconfig(Qt6Sql) qt6-sql-devel qt6-sql-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) libQt6Sql6 pkgconfig(Qt6Core)"

inherit rpm
