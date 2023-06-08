SUMMARY = "Tcl extension for sqlcipher"
DESCRIPTION = "SQLCipher is an SQLite extension that provides transparent 256-bit AES \
encryption of database files. Pages are encrypted before being written to \
disk and are decrypted when read back. Due to the small footprint and great \
performance it’s ideal for protecting embedded application databases and is \
well suited for mobile development/ \
 \
This package provides tcl extension for SQLCipher."
LICENSE = "BSD-3-Clause"

PV = "4.5.3"

RPM_NAME = "tcl-sqlcipher-4.5.3-2.3.aarch64.rpm"
RPM_HASH = "d9b8304f73824a666a3fad6cfac97c6fdb3f311302245eec5b531e12acabf92bf84946e7268e298b312fcb63a563106404472684120ddf10de4c4d5014e5f41e"

RPROVIDES:${PN} += "libtclsqlite3.so()(64bit) sqlcipher-tcl tcl-sqlcipher tcl-sqlcipher(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsqlcipher-3.39.4.so.0()(64bit) tcl"

inherit rpm
