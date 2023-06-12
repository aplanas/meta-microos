SUMMARY = "Automatically apply roles at object creation time"
DESCRIPTION = "Was any of the SYNOPSIS unexpected? Basically, this module is the same \
thing as MooseX::Traits and MouseX::Traits, only for Moo. _Quelle \
surprise_, right?"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.005"

RPM_NAME = "perl-MooX-Traits-0.005-1.12.noarch.rpm"
RPM_HASH = "44ef26daf0e9cece49b3b9f1689663ce5171959baf6d5fded2a741d839e3bec4a340aa30d96a8cc02683b6c52c8065f0abc933e8742c1011d218b15e631ccbe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooX::Traits) \
perl(MooX::Traits::Util) \
perl-MooX-Traits"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Exporter::Shiny) \
perl(Module::Runtime) \
perl(Role::Tiny)"

inherit rpm
