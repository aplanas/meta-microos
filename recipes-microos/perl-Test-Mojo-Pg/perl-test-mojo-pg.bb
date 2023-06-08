SUMMARY = "Helper for Dealing with Pg During Tests"
DESCRIPTION = "Test::Mojo::Pg makes the creation and removal of a transitory database \
during testing when using Mojo::Pg. This is useful when every test should \
work from a 'clean' database."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.33"

RPM_NAME = "perl-Test-Mojo-Pg-0.33-1.21.noarch.rpm"
RPM_HASH = "376ae59f4fea8f750809d4f30973a835677543e49a339480fde1c084b0233a5e28130ef07960b7bd0a6444dd7fb258ed53c77691a615d7b9f4019713c56c2b37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Mojo::Pg) perl-Test-Mojo-Pg"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Mojo::Base) perl(Mojo::Pg)"

inherit rpm
