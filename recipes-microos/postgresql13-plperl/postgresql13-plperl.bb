SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "13.10"

RPM_NAME = "postgresql13-plperl-13.10-2.1.aarch64.rpm"
RPM_HASH = "2b1d2ec9744230bf4ce40f927e576312f7a9031ce21b93f5c1f0c55ca23034adb167be43cea3b0ef4cab4a3ac07ad2d62200c89772b945e807944931e3e841c4"

RPROVIDES:${PN} += "postgresql-plperl-implementation postgresql13-plperl postgresql13-plperl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libperl.so()(64bit) perl postgresql-plperl-noarch postgresql13-server"

inherit rpm
