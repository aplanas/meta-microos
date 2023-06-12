SUMMARY = "Common rules for searching for Perl things"
DESCRIPTION = "I write a lot of things that muck with Perl files. And it always annoyed me \
that finding 'perl files' requires a moderately complex File::Find::Rule \
pattern. \
 \
*File::Find::Rule::Perl* provides methods for finding various types \
Perl-related files, or replicating search queries run on a distribution in \
various parts of the CPAN ecosystem."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.16"

RPM_NAME = "perl-File-Find-Rule-Perl-1.16-1.6.noarch.rpm"
RPM_HASH = "cc0a0418d3fe6bd75f27c4569b45051588224ca60d6ee09acb7efe4fb10ca2b8564020c45befbefeb4189519d663199de175b6cb4ee2af315e48aaace9322ed9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::Find::Rule::Perl) \
perl-File-Find-Rule-Perl"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(File::Find::Rule) \
perl(Params::Util) \
perl(Parse::CPAN::Meta)"

inherit rpm
