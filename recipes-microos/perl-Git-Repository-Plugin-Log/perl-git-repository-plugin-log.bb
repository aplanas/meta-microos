SUMMARY = "Add a log() method to Git::Repository"
DESCRIPTION = "This module adds a new method to Git::Repository."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.314"

RPM_NAME = "perl-Git-Repository-Plugin-Log-1.314-1.13.noarch.rpm"
RPM_HASH = "2855861392135e5a5ab3aebd08ff9890231e4726ab1a50ca670738822eaeec3e7ec28fa638375b217c749f243f3099b80c357660db1a7208f929ee9356e72aaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Git::Repository::Log) perl(Git::Repository::Log::Iterator) perl(Git::Repository::Plugin::Log) perl-Git-Repository-Plugin-Log"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Git::Repository) perl(Git::Repository::Command) perl(Git::Repository::Plugin)"

inherit rpm
