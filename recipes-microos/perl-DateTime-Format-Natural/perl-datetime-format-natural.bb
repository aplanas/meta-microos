SUMMARY = "Parse informal natural language date/time strings"
DESCRIPTION = "'DateTime::Format::Natural' parses informal natural language date/time \
strings. In addition, parsable date/time substrings may be extracted from \
ordinary strings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.16"

RPM_NAME = "perl-DateTime-Format-Natural-1.16-1.1.noarch.rpm"
RPM_HASH = "7083b11a227450619b3dffaaccddee76f79534904277f47026a5261b358cfe331de7444f990a56cbe2e1b8ed6a297c25a8760907667ba109f5a850d9f2ea241e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DateTime::Format::Natural) \
perl(DateTime::Format::Natural::Calc) \
perl(DateTime::Format::Natural::Compat) \
perl(DateTime::Format::Natural::Duration) \
perl(DateTime::Format::Natural::Duration::Checks) \
perl(DateTime::Format::Natural::Expand) \
perl(DateTime::Format::Natural::Extract) \
perl(DateTime::Format::Natural::Formatted) \
perl(DateTime::Format::Natural::Helpers) \
perl(DateTime::Format::Natural::Lang::Base) \
perl(DateTime::Format::Natural::Lang::EN) \
perl(DateTime::Format::Natural::Rewrite) \
perl(DateTime::Format::Natural::Test) \
perl(DateTime::Format::Natural::Utils) \
perl(DateTime::Format::Natural::Wrappers) \
perl-DateTime-Format-Natural"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(Clone) \
perl(DateTime) \
perl(DateTime::HiRes) \
perl(DateTime::TimeZone) \
perl(List::MoreUtils) \
perl(Params::Validate) \
perl(boolean)"

inherit rpm
