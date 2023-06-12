SUMMARY = "Moose type constraints for strings or string-like objects"
DESCRIPTION = "This module provides a more general version of the 'Str' type. If coercions \
are enabled, it will accepts objects that overload stringification and \
coerces them into strings."
LICENSE = "Apache-2.0"

PV = "0.003"

RPM_NAME = "perl-MooseX-Types-Stringlike-0.003-3.25.noarch.rpm"
RPM_HASH = "b4a6d96f99b8428fe4e8d9f94a3f86491f55670c300c8ff1e3d1bb2da8b5502b5937fb6a5f27f2dc3a2970407e1be4c73b5f345fdf85c7a1905e4b0c1b8974cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::Types::Stringlike) \
perl-MooseX-Types-Stringlike"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(MooseX::Types) \
perl(MooseX::Types::Moose)"

inherit rpm
