SUMMARY = "(Re)name a sub"
DESCRIPTION = "This module has only one function, which is also exported by default:"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.27"

RPM_NAME = "perl-Sub-Name-0.27-1.1.aarch64.rpm"
RPM_HASH = "d9d9084b92fd0b3a14cc57d8328c6921cdb1631a929e298c59fefca6ed35d1de3883bed11e18f4d18041bac734c1f0b4882e862268132ac69f59ab3357028a96"

RPROVIDES:${PN} += "perl(Sub::Name) perl-Sub-Name perl-Sub-Name(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
