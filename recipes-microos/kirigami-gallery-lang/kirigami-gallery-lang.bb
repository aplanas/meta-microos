SUMMARY = "Translations for package kirigami-gallery"
DESCRIPTION = "Provides translations for the 'kirigami-gallery' package."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kirigami-gallery-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "30f6d6b87e5aa0d1420004557263c4f639feb5230cc503724f2f255daf6203a396abced4d79613dd02c3608b610ea1cbbbdf6b685f64614c0e60faad57a63e29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kirigami-gallery-lang kirigami-gallery-lang-all locale(kirigami-gallery:ca) locale(kirigami-gallery:ca@valencia) locale(kirigami-gallery:cs) locale(kirigami-gallery:da) locale(kirigami-gallery:de) locale(kirigami-gallery:el) locale(kirigami-gallery:en_GB) locale(kirigami-gallery:es) locale(kirigami-gallery:et) locale(kirigami-gallery:eu) locale(kirigami-gallery:fi) locale(kirigami-gallery:fr) locale(kirigami-gallery:gl) locale(kirigami-gallery:it) locale(kirigami-gallery:ja) locale(kirigami-gallery:ka) locale(kirigami-gallery:ko) locale(kirigami-gallery:lt) locale(kirigami-gallery:nl) locale(kirigami-gallery:nn) locale(kirigami-gallery:pa) locale(kirigami-gallery:pl) locale(kirigami-gallery:pt) locale(kirigami-gallery:pt_BR) locale(kirigami-gallery:ro) locale(kirigami-gallery:ru) locale(kirigami-gallery:sk) locale(kirigami-gallery:sl) locale(kirigami-gallery:sv) locale(kirigami-gallery:tr) locale(kirigami-gallery:uk) locale(kirigami-gallery:zh_CN) locale(kirigami-gallery:zh_TW)"
RDEPENDS:${PN} += "kirigami-gallery"

inherit rpm
