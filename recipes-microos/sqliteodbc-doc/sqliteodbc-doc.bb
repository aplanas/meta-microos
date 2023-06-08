SUMMARY = "Documentation for sqliteodbc"
DESCRIPTION = "ODBC driver for SQLite interfacing SQLite 3.x using the \
unixODBC or iODBC driver managers. This package contains generated \
documentation."
LICENSE = "BSD-2-Clause"

PV = "0.9998"

RPM_NAME = "sqliteodbc-doc-0.9998-1.15.aarch64.rpm"
RPM_HASH = "ab8c805abb07b10059b32360a65c565ee80147e30abd2c63a5d07b4f297f4c8583f1902492c3c0e54522b7d82e97aab89a429dbfb0f4648e04c77b24b0baec80"

RPROVIDES:${PN} += "sqliteodbc-doc sqliteodbc-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
