SUMMARY = "Visitor style traversal of Perl data structures"
DESCRIPTION = "This module is a simple visitor implementation for Perl values. \
 \
It has a main dispatcher method, 'visit', which takes a single perl value \
and then calls the methods appropriate for that value. \
 \
It can recursively map (cloning as necessary) or just traverse most \
structures, with support for per object behavior, circular structures, \
visiting tied structures, and all ref types (hashes, arrays, scalars, code, \
globs). \
 \
Data::Visitor is meant to be subclassed, but also ships with a callback \
driven subclass, Data::Visitor::Callback."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.32"

RPM_NAME = "perl-Data-Visitor-0.32-1.1.noarch.rpm"
RPM_HASH = "39d61c0ab7aecdd2471e393e99b15b1f4d59c57157e7e9000177add4b786dc695ff6c136a7e3593814604f22c0f201bfb1d6df8c474a9bc67af735cd7527af3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Data::Visitor) \
perl(Data::Visitor::Callback) \
perl-Data-Visitor"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Moose) \
perl(Tie::ToObject) \
perl(namespace::clean)"

inherit rpm
