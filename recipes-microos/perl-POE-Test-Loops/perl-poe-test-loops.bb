SUMMARY = "Reusable tests for POE::Loop authors"
DESCRIPTION = "POE::Test::Loops contains one function, generate(), which will generate all \
the loop tests for one or more POE::Loop subclasses. \
 \
The the /SYNOPSIS manpage example is a version of the poe-gen-tests \
manpage, which is a stand-alone utility to generate the actual tests. the \
poe-gen-tests manpage also documents the POE::Test::Loops system in more \
detail."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.360"

RPM_NAME = "perl-POE-Test-Loops-1.360-1.26.noarch.rpm"
RPM_HASH = "5a5368889a3d3e112716b063346c25985bc31d97fb806cf5088561ab2f4d19b76a9517c5d8972acb1b0157854905cb38cc81a6d1e2e9b702e4159dc17af7c343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(POE::Test::DondeEstan) \
perl(POE::Test::Loops) \
perl-POE-Test-Loops"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(Test::More)"

inherit rpm
