SUMMARY = "Translations for package kpackage"
DESCRIPTION = "Provides translations for the 'kpackage' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "kpackage-lang-5.105.0-1.1.noarch.rpm"
RPM_HASH = "bb39722a9089c61cb1218a6f6c77442b8cb2e7420bd3be7b2ce2d0d339048b84e81e0a3a9265f7d489ec3f6d5759ca0846070377ebd052bba0554059a0f8e3d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kpackage-lang kpackage-lang-all locale(kpackage:ar) locale(kpackage:az) locale(kpackage:bs) locale(kpackage:ca) locale(kpackage:ca@valencia) locale(kpackage:cs) locale(kpackage:da) locale(kpackage:de) locale(kpackage:el) locale(kpackage:en_GB) locale(kpackage:es) locale(kpackage:et) locale(kpackage:eu) locale(kpackage:fi) locale(kpackage:fr) locale(kpackage:gd) locale(kpackage:gl) locale(kpackage:he) locale(kpackage:hu) locale(kpackage:ia) locale(kpackage:id) locale(kpackage:it) locale(kpackage:ja) locale(kpackage:ka) locale(kpackage:ko) locale(kpackage:lt) locale(kpackage:ml) locale(kpackage:mr) locale(kpackage:nb) locale(kpackage:nds) locale(kpackage:nl) locale(kpackage:nn) locale(kpackage:pa) locale(kpackage:pl) locale(kpackage:pt) locale(kpackage:pt_BR) locale(kpackage:ro) locale(kpackage:ru) locale(kpackage:sk) locale(kpackage:sl) locale(kpackage:sr) locale(kpackage:sr@ijekavian) locale(kpackage:sr@ijekavianlatin) locale(kpackage:sr@latin) locale(kpackage:sv) locale(kpackage:tr) locale(kpackage:ug) locale(kpackage:uk) locale(kpackage:zh_CN) locale(kpackage:zh_TW)"
RDEPENDS:${PN} += "kpackage"

inherit rpm
