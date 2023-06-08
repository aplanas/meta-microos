SUMMARY = "DBD driver for SQLite 3"
DESCRIPTION = "DBD driver for SQLite 3 database."
LICENSE = "Apache-2.0"

PV = "1.6.3"

RPM_NAME = "libapr-util1-0-dbd-sqlite3-1.6.3-1.2.aarch64.rpm"
RPM_HASH = "50f7883ec4c6746f8b4d400375e3dde69bfefd4e4d9830bb1ae51474b3919642fd8eecde1556360d96234192dd00e9f78e4a2bf85e78945ac9b8007e570e63a2"

RPROVIDES:${PN} += "libapr-util1-0-dbd-sqlite3 libapr-util1-0-dbd-sqlite3(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libapr-util1-0 libc.so.6(GLIBC_2.17)(64bit) libsqlite3.so.0()(64bit)"

inherit rpm
