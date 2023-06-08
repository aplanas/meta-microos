SUMMARY = "Collection of Modules Removed From Module-Build"
DESCRIPTION = "This module contains a number of module that have been removed from \
Module-Build: \
 \
* * Module::Build::ModuleInfo \
 \
This has been superceded by Module::Metadata \
 \
* * Module::Build::Version \
 \
This has been replaced by version \
 \
* * Module::Build::YAML \
 \
This has been replaced by CPAN::Meta::YAML"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.4210"

RPM_NAME = "perl-Module-Build-Deprecated-0.4210-1.23.noarch.rpm"
RPM_HASH = "c2d3f90136d0418b7c75bb6852722ddc2be78bdfbb74419dc8d6c89e4e7485c62357749237562d017014f0f5b190f34a55c83090f77d19396eee922eecdaeaab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Module::Build::Deprecated) perl(Module::Build::ModuleInfo) perl(Module::Build::Version) perl(Module::Build::YAML) perl-Module-Build-Deprecated"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(CPAN::Meta::YAML) perl(Module::Metadata) perl(parent) perl(version)"

inherit rpm
