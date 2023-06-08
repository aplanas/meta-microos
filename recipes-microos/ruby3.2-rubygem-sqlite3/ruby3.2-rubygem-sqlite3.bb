SUMMARY = "This module allows Ruby programs to interface with the SQLite3"
DESCRIPTION = "This module allows Ruby programs to interface with the SQLite3 \
database engine (http://www.sqlite.org).  You must have the \
SQLite engine installed in order to build this module. \
Note that this module is only compatible with SQLite 3.6.16 or newer."
LICENSE = "BSD-3-Clause"

PV = "1.4.4"

RPM_NAME = "ruby3.2-rubygem-sqlite3-1.4.4-1.8.aarch64.rpm"
RPM_HASH = "cd4069e1467106d9b7e69845b213b5a6ae43926b33e6b4299419f97864f26d8ef4e36979c244cc758a2403c071cb9a1966234ea5d59806dde78362ff3f16c140"

RPROVIDES:${PN} += "ruby3.2-rubygem-sqlite3 ruby3.2-rubygem-sqlite3(aarch-64) rubygem(ruby:3.2.0:sqlite3) rubygem(ruby:3.2.0:sqlite3:1) rubygem(ruby:3.2.0:sqlite3:1.4) rubygem(ruby:3.2.0:sqlite3:1.4.4) rubygem(sqlite3)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libruby3.2.so.3.2()(64bit) libsqlite3.so.0()(64bit) ruby(abi)"

inherit rpm
