SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "14.7"

RPM_NAME = "postgresql14-plperl-14.7-2.1.aarch64.rpm"
RPM_HASH = "d9fe072371f3aec416c70e0b8f2bca9158e08cf8cb20dcce7f54382836c23063450784e5dbd28e9310be63c9ed720fd0241458a10b5b785191a7764d0c29a5f6"

RPROVIDES:${PN} += "postgresql-plperl-implementation postgresql14-plperl postgresql14-plperl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libperl.so()(64bit) perl postgresql-plperl-noarch postgresql14-server"

inherit rpm
