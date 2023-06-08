SUMMARY = "Variable ties made easier: much, much, much easier.."
DESCRIPTION = "This module adds the ability to quickly create new types of tie objects \
without creating a complete class. It does so in such a way as to try and \
make the programmers life easier when it comes to single-use ties that I \
find myself wanting to use from time-to-time. \
 \
The 'Tie::Simple' package is actually a front-end to other classes which \
really do all the work once tied, but this package does the dwimming to \
automatically figure out what you're trying to do. \
 \
I've tried to make this as intuitive as possible and dependent on other \
bits of Perl where I can to minimize the need for documentation and to make \
this extra, extra spiffy."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.04"

RPM_NAME = "perl-Tie-Simple-1.04-1.25.noarch.rpm"
RPM_HASH = "69584c823ce96066f33aa116a63d2f09c52bc34274a16843e5e8ea92cfa4e168e2139cdc34d4510fdcd25dfc23f7b1f04919a984a2130642972a6d2f8cc37d83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Tie::Simple) perl(Tie::Simple::Array) perl(Tie::Simple::Handle) perl(Tie::Simple::Hash) perl(Tie::Simple::Scalar) perl(Tie::Simple::Util) perl-Tie-Simple"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
