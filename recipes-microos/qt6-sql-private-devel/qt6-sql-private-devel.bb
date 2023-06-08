SUMMARY = "Non-ABI stable API for the Qt 6 SQL library"
DESCRIPTION = "This package provides private headers of libQt6Sql that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-sql-private-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "6288bd7e185f3989952edbe216a7952b1079b04aa43f5e05e1654a3b6680d16e2dcbd2c59ec678fa4fbc4e0cad190d3d0183b2d0b6ae22c886a9e29afb9eaf6d"

RPROVIDES:${PN} += "qt6-sql-private-devel qt6-sql-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Sql) qt6-core-private-devel"

inherit rpm
