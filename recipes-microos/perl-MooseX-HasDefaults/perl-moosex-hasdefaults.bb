SUMMARY = "Default 'Is' to 'Ro' or 'Rw' for All Attributes"
DESCRIPTION = "The module MooseX::HasDefaults::RO defaults 'is' to 'ro'. \
 \
The module MooseX::HasDefaults::RW defaults 'is' to 'rw'. \
 \
If you pass a specific value to any 'has''s 'is', that overrides the \
default. If you do not want an accessor, pass 'is => undef'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.03"

RPM_NAME = "perl-MooseX-HasDefaults-0.03-2.19.noarch.rpm"
RPM_HASH = "21f0cfa3d66ee6acb1841748f9e5696f4d61a646e15a190729b8e12cb9ca3bdc82971f4a7a30e2cc3d3791ad2019d617030021d4d5e43e89f358911a0355e088"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::HasDefaults) \
perl(MooseX::HasDefaults::Meta::IsRO) \
perl(MooseX::HasDefaults::Meta::IsRW) \
perl(MooseX::HasDefaults::RO) \
perl(MooseX::HasDefaults::RW) \
perl-MooseX-HasDefaults"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Moose)"

inherit rpm
