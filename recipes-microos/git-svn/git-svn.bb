SUMMARY = "Git tools for importing Subversion repositories"
DESCRIPTION = "Tools for importing Subversion repositories to the Git version control \
system."
LICENSE = "GPL-2.0-only"

PV = "2.40.1"

RPM_NAME = "git-svn-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "76768472969ab234286f527fb430f6c2f6b71ddf2ff3319501c356951f28e80e7102fe5264bd68720d01dbabc890395229feb3e650c67502c8b106dd37f59b61"

RPROVIDES:${PN} += "git-svn git-svn(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl git-core perl-Git perl-Term-ReadKey subversion subversion-perl"

inherit rpm
