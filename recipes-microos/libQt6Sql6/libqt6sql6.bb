SUMMARY = "Qt 6 SQL related library"
DESCRIPTION = "A Qt 6 library which is used for connection with an SQL server. You \
will need also a plugin package for a supported SQL server."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "libQt6Sql6-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "e29b4088a863c0621070c61c3e2d63011591f77b1018a27b7ff0e07e284992aa02a73d38c6eeb43b06b8481c99495ce8c73ddddb68949670bca18c7ecbe6b4e4"

RPROVIDES:${PN} += "libQt6Sql.so.6()(64bit) libQt6Sql.so.6(Qt_6)(64bit) libQt6Sql.so.6(Qt_6.0)(64bit) libQt6Sql.so.6(Qt_6.1)(64bit) libQt6Sql.so.6(Qt_6.2)(64bit) libQt6Sql.so.6(Qt_6.3)(64bit) libQt6Sql.so.6(Qt_6.4)(64bit) libQt6Sql.so.6(Qt_6.5)(64bit) libQt6Sql.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Sql6 libQt6Sql6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Core6 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
