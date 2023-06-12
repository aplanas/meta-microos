SUMMARY = "Preparation of Internationalized Strings (S<RFC 3454>)"
DESCRIPTION = "This module implements the _stringprep_ framework for preparing Unicode \
text strings in order to increase the likelihood that string input and \
string comparison work in ways that make sense for typical users throughout \
the world. The _stringprep_ protocol is useful for protocol identifier \
values, company and personal names, internationalized domain names, and \
other text strings. \
 \
The _stringprep_ framework does not specify how protocols should prepare \
text strings. Protocols must create profiles of stringprep in order to \
fully specify the processing options."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.105"

RPM_NAME = "perl-Unicode-Stringprep-1.105-1.25.noarch.rpm"
RPM_HASH = "92a437d53a834b959d4d3193c78dc97c759ae01ecf4b20e06c65170da86ec5b2153420c67e0d2f74ce9e3068d57171740e2c279318ae3934e35e6c02682af0be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Unicode::Stringprep) \
perl(Unicode::Stringprep::BiDi) \
perl(Unicode::Stringprep::Mapping) \
perl(Unicode::Stringprep::Prohibited) \
perl(Unicode::Stringprep::Unassigned) \
perl(Unicode::Stringprep::_Common) \
perl-Unicode-Stringprep"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Unicode::Normalize)"

inherit rpm
