SUMMARY = "Translations for package vido"
DESCRIPTION = "Provides translations for the 'vido' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.0"

RPM_NAME = "vido-lang-2.3.0-1.12.noarch.rpm"
RPM_HASH = "935fc58b751c680c70341b609153a9a639785310c10323cfcd2f7e40dc050419aa0759208de364c2246bf658044fbedf78a4935c14230715bf2616669cd1b2bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(vido:es) locale(vido:fr) locale(vido:id) locale(vido:it) locale(vido:ja) locale(vido:lt) locale(vido:nl) locale(vido:ru) vido-lang vido-lang-all"
RDEPENDS:${PN} += "vido"

inherit rpm
