SUMMARY = "Argument Type Classification"
DESCRIPTION = "This module provides various type-testing functions. These are intended for \
functions that, unlike most Perl code, care what type of data they are \
operating on. For example, some functions wish to behave differently \
depending on the type of their arguments (like overloaded functions in \
C++). \
 \
There are two flavours of function in this module. Functions of the first \
flavour only provide type classification, to allow code to discriminate \
between argument types. Functions of the second flavour package up the most \
common type of type discrimination: checking that an argument is of an \
expected type. The functions come in matched pairs, of the two flavours, \
and so the type enforcement functions handle only the simplest requirements \
for arguments of the types handled by the classification functions. \
Enforcement of more complex types may, of course, be built using the \
classification functions, or it may be more convenient to use a module \
designed for the more complex job, such as Params::Validate. \
 \
This module is implemented in XS, with a pure Perl backup version for \
systems that can't handle XS."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.015"

RPM_NAME = "perl-Params-Classify-0.015-1.28.aarch64.rpm"
RPM_HASH = "19f7d2b92b7f5d2644e445f2401e82d355c77fd0e508c9135fd96c29f276fd13f040d80702ba4da0596482184c88faa58c67d00c103a67963fe88a4327b19e7d"

RPROVIDES:${PN} += "perl(Params::Classify) perl-Params-Classify perl-Params-Classify(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0) perl(parent)"

inherit rpm
