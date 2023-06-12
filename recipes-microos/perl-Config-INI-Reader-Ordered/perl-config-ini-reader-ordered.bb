SUMMARY = ".ini-file parser that returns sections in order"
DESCRIPTION = "Config::INI::Reader::Ordered is a subclass of Config::INI::Reader which \
preserves section order. See Config::INI::Reader for all documentation; the \
only difference is as presented in the SYNOPSIS."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.022"

RPM_NAME = "perl-Config-INI-Reader-Ordered-0.022-1.2.noarch.rpm"
RPM_HASH = "6cad86a518e1a523519ad845c22424de39900559f9d380f16662b22ec01dd805cd3a3dac5ee56d33eb7aee4fda127c6cb915a216f788a7d76d7f53dd6cff457e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Config::INI::Reader::Ordered) \
perl-Config-INI-Reader-Ordered"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Config::INI::Reader)"

inherit rpm
