SUMMARY = "Parse a distribution name"
DESCRIPTION = "Parse::Distname is yet another distribution name parser. It works almost \
the same as CPAN::DistnameInfo, but Parse::Distname takes a different \
approach. It tries to extract a version part of a distribution and treat \
the rest as a distribution name, contrary to CPAN::DistnameInfo which tries \
to define a name part and treat the rest as a version. \
 \
Because of this difference, when Parse::Distname parses a weird \
distribution name such as 'AUTHOR/v1.0.tar.gz', it says the name is empty \
and the version is 'v1.0', while CPAN::DistnameInfo says the name is 'v' \
and the version is '1.0'. See test files in this distribution if you need \
more details. As of this writing, Parse::Distname returns a different \
result for about 200+ distributions among about 320000 BackPan \
distributions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.05"

RPM_NAME = "perl-Parse-Distname-0.05-1.2.noarch.rpm"
RPM_HASH = "c37e0927934abfc93d2fef48a24afe7d26546e50064a39d85f092ead009db357eeada010fb039af7cd44ac676024bc2d3948b7e2eddaa17f120133c9daa40f03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Parse::Distname) perl-Parse-Distname"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
