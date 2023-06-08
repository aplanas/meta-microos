SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "15.2"

RPM_NAME = "postgresql15-plperl-15.2-3.1.aarch64.rpm"
RPM_HASH = "7290102497257d8d12d4de45c02f28b3e11ffda4ba2534e3fa914b845e43f5e5d2504b937839521dab078868b02282ae1680e633e48a140960834837f5031364"

RPROVIDES:${PN} += "postgresql-plperl-implementation postgresql15-plperl postgresql15-plperl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libperl.so()(64bit) perl postgresql-plperl-noarch postgresql15-server"

inherit rpm
