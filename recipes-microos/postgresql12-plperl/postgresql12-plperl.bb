SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "12.14"

RPM_NAME = "postgresql12-plperl-12.14-2.1.aarch64.rpm"
RPM_HASH = "6c17f6c581a3d12c8b287f2ed7b9939b6c9be0f1dece023a0bd059994d5efb92f5911a8a1eaf44506f348e4c05d620375ab2727bebc5d6224a7f82314558503f"

RPROVIDES:${PN} += "postgresql-plperl-implementation postgresql12-plperl postgresql12-plperl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libperl.so()(64bit) perl postgresql-plperl-noarch postgresql12-server"

inherit rpm
