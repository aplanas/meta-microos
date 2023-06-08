SUMMARY = "Looking up module information / loading at runtime"
DESCRIPTION = "Module::Load::Conditional provides simple ways to query and possibly load \
any of the modules you have installed on your system during runtime. \
 \
It is able to load multiple modules at once or none at all if one of them \
was not able to load. It also takes care of any error checking and so \
forth."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.74"

RPM_NAME = "perl-Module-Load-Conditional-0.74-1.12.noarch.rpm"
RPM_HASH = "d7361f37b0b9fd32bddb0994e174e89fec27b4de3385de6b76c6b1f147ebdf52b137400f5feeadde5fb0f262ff7770a0340b497bae2ab1cb1168677691adedb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Module::Load::Conditional) perl-Module-Load-Conditional"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Locale::Maketext::Simple) perl(Module::CoreList) perl(Module::Load) perl(Module::Metadata) perl(Params::Check) perl(version)"

inherit rpm
