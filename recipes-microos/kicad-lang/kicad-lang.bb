SUMMARY = "Translations for package kicad"
DESCRIPTION = "Provides translations for the 'kicad' package."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later"

PV = "7.0.2"

RPM_NAME = "kicad-lang-7.0.2-1.2.noarch.rpm"
RPM_HASH = "b6ce8941c690cd21b20f6c01cecccd356cd8e5d2a45340361daa31f3d2b97185ba28d03a076906bef8f9d88a8d1335716cfb8ae8a074e2c4a299b6f62dff579d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-lang kicad-lang-all locale(kicad:cs) locale(kicad:da) locale(kicad:de) locale(kicad:el) locale(kicad:en) locale(kicad:es) locale(kicad:es_MX) locale(kicad:fi) locale(kicad:fr) locale(kicad:it) locale(kicad:ja) locale(kicad:ko) locale(kicad:lt) locale(kicad:nl) locale(kicad:pl) locale(kicad:pt) locale(kicad:ru) locale(kicad:sv) locale(kicad:th) locale(kicad:uk) locale(kicad:zh_CN) locale(kicad:zh_TW)"
RDEPENDS:${PN} += ""

inherit rpm
