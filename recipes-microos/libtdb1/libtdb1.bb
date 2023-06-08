SUMMARY = "Samba Trivial Database"
DESCRIPTION = "TDB is a Trivial Database. In concept, it is very much like GDBM, and BSD's DB, \
except that it allows multiple simultaneous writers and uses locking \
internally to keep writers from trampling on each other. \
 \
This package contains the tdb1 library."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.8"

RPM_NAME = "libtdb1-1.4.8-1.1.aarch64.rpm"
RPM_HASH = "0f1b2c5d3afc5368928887d7ec3d1dc02ec854975e65b0415785e8d06bf08d96897913b9cc2a905b14c61dc51cab558c20b8d6a537ae43faa7c0a4dad142f92f"

RPROVIDES:${PN} += "libtdb.so.1()(64bit) libtdb.so.1(TDB_1.2.1)(64bit) libtdb.so.1(TDB_1.2.10)(64bit) libtdb.so.1(TDB_1.2.11)(64bit) libtdb.so.1(TDB_1.2.12)(64bit) libtdb.so.1(TDB_1.2.13)(64bit) libtdb.so.1(TDB_1.2.2)(64bit) libtdb.so.1(TDB_1.2.3)(64bit) libtdb.so.1(TDB_1.2.4)(64bit) libtdb.so.1(TDB_1.2.5)(64bit) libtdb.so.1(TDB_1.2.6)(64bit) libtdb.so.1(TDB_1.2.7)(64bit) libtdb.so.1(TDB_1.2.8)(64bit) libtdb.so.1(TDB_1.2.9)(64bit) libtdb.so.1(TDB_1.3.0)(64bit) libtdb.so.1(TDB_1.3.1)(64bit) libtdb.so.1(TDB_1.3.10)(64bit) libtdb.so.1(TDB_1.3.11)(64bit) libtdb.so.1(TDB_1.3.12)(64bit) libtdb.so.1(TDB_1.3.13)(64bit) libtdb.so.1(TDB_1.3.14)(64bit) libtdb.so.1(TDB_1.3.15)(64bit) libtdb.so.1(TDB_1.3.16)(64bit) libtdb.so.1(TDB_1.3.17)(64bit) libtdb.so.1(TDB_1.3.18)(64bit) libtdb.so.1(TDB_1.3.2)(64bit) libtdb.so.1(TDB_1.3.3)(64bit) libtdb.so.1(TDB_1.3.4)(64bit) libtdb.so.1(TDB_1.3.5)(64bit) libtdb.so.1(TDB_1.3.6)(64bit) libtdb.so.1(TDB_1.3.7)(64bit) libtdb.so.1(TDB_1.3.8)(64bit) libtdb.so.1(TDB_1.3.9)(64bit) libtdb.so.1(TDB_1.4.0)(64bit) libtdb.so.1(TDB_1.4.1)(64bit) libtdb.so.1(TDB_1.4.2)(64bit) libtdb.so.1(TDB_1.4.3)(64bit) libtdb.so.1(TDB_1.4.4)(64bit) libtdb.so.1(TDB_1.4.5)(64bit) libtdb.so.1(TDB_1.4.6)(64bit) libtdb.so.1(TDB_1.4.7)(64bit) libtdb.so.1(TDB_1.4.8)(64bit) libtdb1 libtdb1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
