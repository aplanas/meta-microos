SUMMARY = "Parse cpanfile"
DESCRIPTION = "Module::CPANfile is a tool to handle cpanfile format to load application \
specific dependencies, not just for CPAN distributions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.1004"

RPM_NAME = "perl-Module-CPANfile-1.1004-1.17.noarch.rpm"
RPM_HASH = "237d2dc1e3eee10d440c1d5786abf2d4a0d0fbf9402abd4ca9e88d62cf0456cafe276dd64ff75ceb5c3d5736dea373d9da4d1fa23884617b74625a5592ae3d78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Module::CPANfile) \
perl(Module::CPANfile::Environment) \
perl(Module::CPANfile::Prereq) \
perl(Module::CPANfile::Prereqs) \
perl(Module::CPANfile::Requirement) \
perl-Module-CPANfile"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(CPAN::Meta) \
perl(CPAN::Meta::Prereqs) \
perl(parent)"

inherit rpm
