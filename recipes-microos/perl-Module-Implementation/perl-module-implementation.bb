SUMMARY = "Loads one of several alternate underlying implementations for a module"
DESCRIPTION = "This module abstracts out the process of choosing one of several underlying \
implementations for a module. This can be used to provide XS and pure Perl \
implementations of a module, or it could be used to load an implementation \
for a given OS or any other case of needing to provide multiple \
implementations. \
 \
This module is only useful when you know all the implementations ahead of \
time. If you want to load arbitrary implementations then you probably want \
something like a plugin system, not this module."
LICENSE = "Artistic-2.0"

PV = "0.09"

RPM_NAME = "perl-Module-Implementation-0.09-1.25.noarch.rpm"
RPM_HASH = "bcfee1cdeb6c271734d7557388a7ca0a28b0dc353a0a67f5548aa3fcef2d53882dd11eca12894551fb311dba682eb926a33a8e5ed16f5f660d596bfc8b714b09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Module::Implementation) perl-Module-Implementation"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Module::Runtime) perl(Try::Tiny)"

inherit rpm
