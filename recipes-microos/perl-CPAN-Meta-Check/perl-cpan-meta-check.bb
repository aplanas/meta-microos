SUMMARY = "Verify requirements in a CPAN::Meta object"
DESCRIPTION = "This module verifies if requirements described in a CPAN::Meta object are \
present."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.017"

RPM_NAME = "perl-CPAN-Meta-Check-0.017-1.1.noarch.rpm"
RPM_HASH = "8416ce3d88dc88346bcec185fa3232acf725287859309d35a8ed1cd3a38669e9923e39734fe29bf78ba020d93a3943b40d84abf255b3990b5418cfc2a9308504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(CPAN::Meta::Check) \
perl-CPAN-Meta-Check"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(CPAN::Meta::Prereqs) \
perl(CPAN::Meta::Requirements) \
perl(Module::Metadata)"

inherit rpm
