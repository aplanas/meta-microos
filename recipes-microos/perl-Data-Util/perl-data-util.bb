SUMMARY = "Selection of utilities for data and data types"
DESCRIPTION = "This module provides utility functions for data and data types, including \
functions for subroutines and symbol table hashes (stashes). \
 \
This module makes for a pure Perl and XS implementation. \
 \
However, if you want to use the full capacity of it, we recommend you to \
opt for the XS backend. \
 \
There are many benchmarks in the _DIST-DIR/benchmark/_ directory."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.67"

RPM_NAME = "perl-Data-Util-0.67-1.8.aarch64.rpm"
RPM_HASH = "de3a373dd222ff8598a051cde5e62d9da14320883980d9c3df3aba25aedb8f8e1f69c794d1576dfb871639c5a0b26ccb9f8d852cdae4d1efe16fa729e48d4f6d"

RPROVIDES:${PN} += "perl(Data::Util) \
perl(Data::Util::Error) \
perl(Data::Util::PurePerl) \
perl-Data-Util \
perl-Data-Util(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
