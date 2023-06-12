SUMMARY = "Runtime Module Handling"
DESCRIPTION = "The functions exported by this module deal with runtime handling of Perl \
modules, which are normally handled at compile time. This module avoids \
using any other modules, so that it can be used in low-level \
infrastructure. \
 \
The parts of this module that work with module names apply the same syntax \
that is used for barewords in Perl source. In principle this syntax can \
vary between versions of Perl, and this module applies the syntax of the \
Perl on which it is running. In practice the usable syntax hasn't changed \
yet. There's some intent for Unicode module names to be supported in the \
future, but this hasn't yet amounted to any consistent facility. \
 \
The functions of this module whose purpose is to load modules include \
workarounds for three old Perl core bugs regarding 'require'. These \
workarounds are applied on any Perl version where the bugs exist, except \
for a case where one of the bugs cannot be adequately worked around in pure \
Perl."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.016"

RPM_NAME = "perl-Module-Runtime-0.016-1.19.noarch.rpm"
RPM_HASH = "0b5619c7362709800c82241dea118b0099335501437454e31ade96ad760f2d2a8261c03aa928340f712320c0caebf1ea9aaed1249ba20e86f5b629ae2f6a417c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Module::Runtime) \
perl-Module-Runtime"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
