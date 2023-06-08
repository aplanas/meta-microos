SUMMARY = "Translations for package starfighter"
DESCRIPTION = "Provides translations for the 'starfighter' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.4"

RPM_NAME = "starfighter-lang-2.4-1.13.noarch.rpm"
RPM_HASH = "fe455da4122cfb63b20f0d07b14e2b9455e4d309fded1f8aea6c32ed749993eb382469649349b82e9a4f962534352591234ac313c97d9b3713e4de6f5ce2a01b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(starfighter:en) locale(starfighter:ja) locale(starfighter:nl) starfighter-lang starfighter-lang-all"
RDEPENDS:${PN} += "starfighter"

inherit rpm
