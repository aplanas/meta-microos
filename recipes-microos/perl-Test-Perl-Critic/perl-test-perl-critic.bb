SUMMARY = "Use Perl::Critic in test programs"
DESCRIPTION = "Test::Perl::Critic wraps the Perl::Critic engine in a convenient subroutine \
suitable for test programs written using the Test::More framework. This \
makes it easy to integrate coding-standards enforcement into the build \
process. For ultimate convenience (at the expense of some flexibility), see \
the criticism pragma. \
 \
If you have an large existing code base, you might prefer to use \
Test::Perl::Critic::Progressive, which allows you to clean your code \
incrementally instead of all at once.. \
 \
If you'd like to try Perl::Critic without installing anything, there is a \
web-service available at http://perlcritic.com. The web-service does not \
support all the configuration features that are available in the native \
Perl::Critic API, but it should give you a good idea of what Perl::Critic \
can do."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.04"

RPM_NAME = "perl-Test-Perl-Critic-1.04-1.15.noarch.rpm"
RPM_HASH = "f37f784256735c893e1a380cba3df2cbd36411905b29ca57f0c4a257495b8b521c1846e6caf647005c1521398696a5304f25b62cd229e7e4c75d305ace801783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Perl::Critic) perl-Test-Perl-Critic"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(MCE) perl(Perl::Critic) perl(Perl::Critic::Utils) perl(Perl::Critic::Violation) perl(Test::Builder)"

inherit rpm
