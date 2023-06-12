SUMMARY = "Simple .ini-file format"
DESCRIPTION = "simple .ini-file format"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.029"

RPM_NAME = "perl-Config-INI-0.029-1.1.noarch.rpm"
RPM_HASH = "c92e0a961d3e3d90f5c45652c8d60fab9c3d4f3f9453877966ad59b9f55908d612ff7a919e747e686deb70fdf563d38ba181d5fa72802ce5675963e7942c8429"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Config::INI) \
perl(Config::INI::Reader) \
perl(Config::INI::Writer) \
perl-Config-INI"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Mixin::Linewise::Readers) \
perl(Mixin::Linewise::Writers)"

inherit rpm
