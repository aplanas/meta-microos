SUMMARY = "Text::German Perl module"
DESCRIPTION = "Text::German Perl module"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.06"

RPM_NAME = "perl-Text-German-0.06-1.27.noarch.rpm"
RPM_HASH = "000a7c13b47733f032b0e2894cf73c16315b995145c1e3e77c77084bda8bd3a099410c2107b7b65a36cc25870dfbe9f132896afaa0d593a595b2c3935fa3e840"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Text::German) perl(Text::German::Adjektiv) perl(Text::German::Ausnahme) perl(Text::German::Cache) perl(Text::German::Endung) perl(Text::German::Regel) perl(Text::German::Util) perl(Text::German::Verb) perl(Text::German::Vorsilbe) perl-Text-German"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
