SUMMARY = "Python interface for Berkeley DB"
DESCRIPTION = "This module provides a nearly complete wrapping of the Oracle/Sleepycat C API \
for the Database Environment, Database, Cursor, Log Cursor, Sequence and \
Transaction objects, and each of these is exposed as a Python type in the \
bsddb3.db module."
LICENSE = "BSD-3-Clause"

PV = "6.2.9"

RPM_NAME = "python311-bsddb3-6.2.9-1.13.aarch64.rpm"
RPM_HASH = "1353da057c6e2910c2c029cda2e5e3ef09be814a9fb683c04693c1e921a29ae28ced6b615ebae39487696d84aeb371e540f185b3074350902c4936d37919960f"

RPROVIDES:${PN} += "python3.11dist(bsddb3) \
python311-bsddb3 \
python311-bsddb3(aarch-64) \
python3dist(bsddb3)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdb-4.8.so()(64bit) \
python(abi)"

inherit rpm
