SUMMARY = "Testing TCP program"
DESCRIPTION = "Test::TCP is a test utility to test TCP/IP-based server programs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.22"

RPM_NAME = "perl-Test-TCP-2.22-1.15.noarch.rpm"
RPM_HASH = "b0f613b62e1971eaa1e1edaf02dc2aa1b892265c85b7a65ab6a3bbb4c3c5776a25def3fb7af2059848f8146e34451d6c92237de1e05f54507b2a976ad93f0882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::EmptyPort) perl(Test::TCP) perl(Test::TCP::CheckPort) perl-Test-TCP"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(IO::Socket::IP) perl(Test::SharedFork)"

inherit rpm
