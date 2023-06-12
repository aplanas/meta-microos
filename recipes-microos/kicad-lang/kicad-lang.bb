SUMMARY = "Translations for package kicad"
DESCRIPTION = "Provides translations for the 'kicad' package."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later"

PV = "7.0.5"

RPM_NAME = "kicad-lang-7.0.5-1.1.noarch.rpm"
RPM_HASH = "3f9a6daefb535c2b246a2bbb15fd04e3eb9f828fc2314f7427fd3d6dd87510fc8373d59a7b48d40c2f4ea69760ada0f0fe38b1712e8bc63026c3b61c7a54ef21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-lang kicad-lang-all locale(kicad:cs) locale(kicad:da) locale(kicad:de) locale(kicad:el) locale(kicad:en) locale(kicad:es) locale(kicad:es_MX) locale(kicad:fi) locale(kicad:fr) locale(kicad:it) locale(kicad:ja) locale(kicad:ko) locale(kicad:lt) locale(kicad:nl) locale(kicad:pl) locale(kicad:pt) locale(kicad:ru) locale(kicad:sv) locale(kicad:th) locale(kicad:uk) locale(kicad:zh_CN) locale(kicad:zh_TW)"
RDEPENDS:${PN} += ""

inherit rpm
