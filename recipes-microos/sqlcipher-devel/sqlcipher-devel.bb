SUMMARY = "Development files for SQLCipher"
DESCRIPTION = "SQLCipher is an SQLite extension that provides transparent 256-bit AES \
encryption of database files. Pages are encrypted before being written to \
disk and are decrypted when read back. Due to the small footprint and great \
performance it’s ideal for protecting embedded application databases and is \
well suited for mobile development. \
 \
This package contains development files for SQLCipher."
LICENSE = "BSD-3-Clause"

PV = "4.5.3"

RPM_NAME = "sqlcipher-devel-4.5.3-2.3.aarch64.rpm"
RPM_HASH = "ca07cc9f75c1c5bf5ab93a88f61152c81312724f02d6030b50cb1df7de474d9d17cdf56a234e680f4c6df8d71e3e0d8f09604d565d52c9668bb440160f36b6d2"

RPROVIDES:${PN} += "pkgconfig(sqlcipher) sqlcipher-devel sqlcipher-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsqlcipher-3_39_4-0 sqlcipher tcl-sqlcipher"

inherit rpm
