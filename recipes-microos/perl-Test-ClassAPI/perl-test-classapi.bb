SUMMARY = "Provides basic first-pass API testing for large class trees"
DESCRIPTION = "For many APIs with large numbers of classes, it can be very useful to be \
able to do a quick once-over to make sure that classes, methods, and \
inheritance is correct, before doing more comprehensive testing. This \
module aims to provide such a capability."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.07"

RPM_NAME = "perl-Test-ClassAPI-1.07-1.19.noarch.rpm"
RPM_HASH = "f7e034e8ae4199e694ee97454e9dbe4ea1c65b919467e6e39bb04e67169758dea04e5496f3cf88a8207602f04a9cb034add2c2ba0d0a3d96ec4ab57a355d6f51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::ClassAPI) perl-Test-ClassAPI"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Class::Inspector) perl(Config::Tiny) perl(Params::Util)"

inherit rpm
