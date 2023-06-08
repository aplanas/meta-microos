SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "11.19"

RPM_NAME = "postgresql11-plperl-11.19-2.1.aarch64.rpm"
RPM_HASH = "e63ad2bd64004368478621619ddec5916c50d94077bb3be2138f495df80268278e600effbea6383dc6fe174bad86621214ae65423035ce84aae4871ccd715699"

RPROVIDES:${PN} += "postgresql-plperl-implementation postgresql11-plperl postgresql11-plperl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libperl.so()(64bit) perl postgresql-plperl-noarch postgresql11-server"

inherit rpm
