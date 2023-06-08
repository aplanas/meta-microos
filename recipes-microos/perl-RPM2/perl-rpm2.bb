SUMMARY = "Perl bindings for the RPM Package Manager API"
DESCRIPTION = "The RPM2 module provides an object-oriented interface to querying both the \
installed RPM database as well as files on the filesystem."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.4"

RPM_NAME = "perl-RPM2-1.4-1.28.aarch64.rpm"
RPM_HASH = "3c433ca950ee8d6318aca5f47beb5f38d091a71d899c709e74ce9dc44047b27efead88ac0ad4852bd6d56663975a00cdff68969497af371e2735ac4b70ca5aa1"

RPROVIDES:${PN} += "perl(RPM2) perl(RPM2::DB) perl(RPM2::Header) perl(RPM2::PackageIterator) perl(RPM2::Transaction) perl-RPM2 perl-RPM2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) librpm.so.9()(64bit) librpmio.so.9()(64bit) perl(:MODULE_COMPAT_5.36.0) perl(File::Basename) perl(File::Spec)"

inherit rpm
