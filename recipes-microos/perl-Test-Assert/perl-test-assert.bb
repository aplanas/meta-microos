SUMMARY = "Assertion methods for those who like JUnit."
DESCRIPTION = "This class provides a set of assertion methods useful for writing tests. \
The API is based on JUnit4 and the Test::Unit::Lite manpage and the methods \
die on failure. \
 \
These assertion methods might be not useful for common the Test::Builder \
manpage-based (the Test::Simple manpage, the Test::More manpage, etc.) test \
units. \
 \
The assertion methods can be used in class which is derived from \
'Test::Assert' or used as standard Perl functions after importing them into \
user's namespace. \
 \
'Test::Assert' can also wrap standard the Test::Simple manpage, the \
Test::More manpage or other the Test::Builder manpage-based tests. \
 \
The assertions can be also used for run-time checking."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.0504"

RPM_NAME = "perl-Test-Assert-0.0504-9.24.noarch.rpm"
RPM_HASH = "2d66a1e414290a845826368bea1e2643564979c6c7a46f7e7fe9c7dd75eac4aedbe120cc0816ed92694d4b1ba37056335e955c54ac196fc566c7c75933c6f579"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Exception::Assertion) perl(Test::Assert) perl-Test-Assert"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Exception::Base) perl(Symbol::Util) perl(constant::boolean)"

inherit rpm
