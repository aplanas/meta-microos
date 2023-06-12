SUMMARY = "URLs that refer to things on the CPAN"
DESCRIPTION = "URLs that refer to things on the CPAN"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.008"

RPM_NAME = "perl-URI-cpan-1.008-1.7.noarch.rpm"
RPM_HASH = "bb7bac770b83c8450ffdda1a772d3a8e81c12c75c5aa0754ff97a867ffe399f7285e6ad6a9d6b092eeeebc203cbe39e3cedc2b1dfc8327e1dcda73cf0995e711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(URI::cpan) \
perl(URI::cpan::author) \
perl(URI::cpan::dist) \
perl(URI::cpan::distfile) \
perl(URI::cpan::module) \
perl(URI::cpan::package) \
perl-URI-cpan"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(CPAN::DistnameInfo) \
perl(URI) \
perl(parent)"

inherit rpm
