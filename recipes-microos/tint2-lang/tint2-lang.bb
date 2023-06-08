SUMMARY = "Translations for package tint2"
DESCRIPTION = "Provides translations for the 'tint2' package."
LICENSE = "GPL-2.0-only"

PV = "17.0.2"

RPM_NAME = "tint2-lang-17.0.2-1.7.noarch.rpm"
RPM_HASH = "af0605b8d49b6f91780aaaaea083262a659732a9ea93704165ef6dd0e4cda67d8a2a14d2e1d97097e56def653beeb150b4dff433fb01f63ea09d966d57c8f5fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(tint2:bs) locale(tint2:es) locale(tint2:fr) locale(tint2:hr) locale(tint2:pl) locale(tint2:ru) locale(tint2:sr) tint2-lang tint2-lang-all"
RDEPENDS:${PN} += "tint2"

inherit rpm
