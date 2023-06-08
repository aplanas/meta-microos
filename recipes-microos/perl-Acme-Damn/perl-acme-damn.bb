SUMMARY = "'Unbless' Perl objects"
DESCRIPTION = "*Acme::Damn* provides a single routine, *damn()*, which takes a blessed \
reference (a Perl object), and _unblesses_ it, to return the original \
reference."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.08"

RPM_NAME = "perl-Acme-Damn-0.08-1.25.aarch64.rpm"
RPM_HASH = "2f7599e1d53358a7b2e7a41bdeae96d41bab084b5f09798c93ba2b245f4eb84a518d96ce4c30cf3e2b17e83718e63f040d3d0ec2cb4be1a8c846a446cd9c25d2"

RPROVIDES:${PN} += "perl(Acme::Damn) perl-Acme-Damn perl-Acme-Damn(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
