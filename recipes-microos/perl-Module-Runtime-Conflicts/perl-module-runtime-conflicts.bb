SUMMARY = "Provide information on conflicts for Module::Runtime"
DESCRIPTION = "This module provides conflicts checking for Module::Runtime, which had a \
recent release that broke some versions of Moose. It is called from \
Moose::Conflicts and 'moose-outdated'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.003"

RPM_NAME = "perl-Module-Runtime-Conflicts-0.003-1.22.noarch.rpm"
RPM_HASH = "cc18c50fc2a73065cc9f98757d1bfb8b2c1d25a1abcc8cca03fa887a8470cc1c433351fcda7f51aca8c440f531f2dd27dff880fc34a698f18d106b244d39e285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Module::Runtime::Conflicts) \
perl-Module-Runtime-Conflicts"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Dist::CheckConflicts) \
perl(Module::Runtime)"

inherit rpm
