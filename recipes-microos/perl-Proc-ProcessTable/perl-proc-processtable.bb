SUMMARY = "Perl extension to access the unix process table"
DESCRIPTION = "Perl interface to the unix process table."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & GPL-2.0-only"

PV = "0.634"

RPM_NAME = "perl-Proc-ProcessTable-0.634-1.9.aarch64.rpm"
RPM_HASH = "2f02e974360a9fe3a88a882e95e92afcb593dc3cf6f8b08bd35dba0c09d9dd5f862e3f259b23280f5c038d9a0582d9d6ccf67dbd9146dd18c7842c129504aa2b"

RPROVIDES:${PN} += "perl(Proc::Killall) perl(Proc::Killfam) perl(Proc::ProcessTable) perl(Proc::ProcessTable::Process) perl-Proc-ProcessTable perl-Proc-ProcessTable(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
