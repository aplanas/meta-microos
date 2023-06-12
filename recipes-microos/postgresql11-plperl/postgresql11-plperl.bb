SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "11.20"

RPM_NAME = "postgresql11-plperl-11.20-1.2.aarch64.rpm"
RPM_HASH = "1473d5f6da2ea7c202eaa4ec7397e1c905f0c0e74daee4718a2bef0489d188356968fd7c9a3228423e39419afdc27c274c5e3c06031057b4d54f14e9b108c2a7"

RPROVIDES:${PN} += "postgresql-plperl-implementation postgresql11-plperl postgresql11-plperl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libperl.so()(64bit) perl postgresql-plperl-noarch postgresql11-server"

inherit rpm
