SUMMARY = "Translations for package mailcommon"
DESCRIPTION = "Provides translations for the 'mailcommon' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "mailcommon-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "a597873fb116ae6d81b7a2d7a4e7fbb2c890d10c363575b7192f1bd611a46eedcea976c781e6fbfb63f7d1e95610ce1b0bc618ea386876892c8df2bb8ab59b74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mailcommon:ar) locale(mailcommon:bg) locale(mailcommon:bs) locale(mailcommon:ca) locale(mailcommon:ca@valencia) locale(mailcommon:cs) locale(mailcommon:da) locale(mailcommon:de) locale(mailcommon:el) locale(mailcommon:en_GB) locale(mailcommon:es) locale(mailcommon:et) locale(mailcommon:eu) locale(mailcommon:fi) locale(mailcommon:fr) locale(mailcommon:ga) locale(mailcommon:gl) locale(mailcommon:hr) locale(mailcommon:hu) locale(mailcommon:ia) locale(mailcommon:it) locale(mailcommon:ja) locale(mailcommon:ka) locale(mailcommon:kk) locale(mailcommon:ko) locale(mailcommon:lt) locale(mailcommon:mr) locale(mailcommon:nb) locale(mailcommon:nds) locale(mailcommon:nl) locale(mailcommon:nn) locale(mailcommon:pa) locale(mailcommon:pl) locale(mailcommon:pt) locale(mailcommon:pt_BR) locale(mailcommon:ro) locale(mailcommon:ru) locale(mailcommon:sk) locale(mailcommon:sl) locale(mailcommon:sr) locale(mailcommon:sr@ijekavian) locale(mailcommon:sr@ijekavianlatin) locale(mailcommon:sr@latin) locale(mailcommon:sv) locale(mailcommon:tr) locale(mailcommon:ug) locale(mailcommon:uk) locale(mailcommon:zh_CN) locale(mailcommon:zh_TW) mailcommon-lang mailcommon-lang-all"
RDEPENDS:${PN} += "mailcommon"

inherit rpm
