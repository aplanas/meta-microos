SUMMARY = "Perl extension to access the unix process table"
DESCRIPTION = "Perl interface to the unix process table."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & GPL-2.0-only"

PV = "0.635"

RPM_NAME = "perl-Proc-ProcessTable-0.635-1.1.aarch64.rpm"
RPM_HASH = "be144f06c8d6220c3cde3c558075ac5343cf34e4e87cd3eb356226cd7e9a24e5370db7fac144e8ab9a0a2fae00436f539c6c55d3d5532153a6725de9cfc6fb4a"

RPROVIDES:${PN} += "perl(Proc::Killall) perl(Proc::Killfam) perl(Proc::ProcessTable) perl(Proc::ProcessTable::Process) perl-Proc-ProcessTable perl-Proc-ProcessTable(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
