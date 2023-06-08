SUMMARY = "Test::Deep plugin for validating type constraints"
DESCRIPTION = "This is a Test::Deep plugin that provides the sub 'is_type' to indicate \
that the data being tested must validate against the passed type. This is \
an actual type _object_, not a string name -- for example something \
provided via MooseX::Types, or a plain old coderef that returns a bool \
(such as what might be used in a Moo type constraint)."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.008"

RPM_NAME = "perl-Test-Deep-Type-0.008-1.22.noarch.rpm"
RPM_HASH = "b93617f05816b70901368d146a1dca044f526fb8370f581d928ac66ba57ec1913b2c82233597f892e0545676f34a718563fbb55bb23c200c0064bbadb48e6c63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Deep::Type) perl-Test-Deep-Type"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Test::Deep::Cmp) perl(Try::Tiny) perl(parent)"

inherit rpm
