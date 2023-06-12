SUMMARY = "Translations for package plasma5-bigscreen"
DESCRIPTION = "Provides translations for the 'plasma5-bigscreen' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "plasma5-bigscreen-lang-5.27.5-1.1.noarch.rpm"
RPM_HASH = "494d0ef975cc5fb619de544afd13d8dddacc8c9365db917ad8c666bd57a5b79a662390eedd5ecb8d664ecc60a61f66849ba8d1306472da7c24696fcf7421f02f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(plasma5-bigscreen:ar) locale(plasma5-bigscreen:az) locale(plasma5-bigscreen:bg) locale(plasma5-bigscreen:ca) locale(plasma5-bigscreen:ca@valencia) locale(plasma5-bigscreen:cs) locale(plasma5-bigscreen:da) locale(plasma5-bigscreen:de) locale(plasma5-bigscreen:el) locale(plasma5-bigscreen:en_GB) locale(plasma5-bigscreen:es) locale(plasma5-bigscreen:et) locale(plasma5-bigscreen:eu) locale(plasma5-bigscreen:fi) locale(plasma5-bigscreen:fr) locale(plasma5-bigscreen:gl) locale(plasma5-bigscreen:hu) locale(plasma5-bigscreen:ia) locale(plasma5-bigscreen:id) locale(plasma5-bigscreen:it) locale(plasma5-bigscreen:ja) locale(plasma5-bigscreen:ka) locale(plasma5-bigscreen:ko) locale(plasma5-bigscreen:lt) locale(plasma5-bigscreen:nl) locale(plasma5-bigscreen:nn) locale(plasma5-bigscreen:pa) locale(plasma5-bigscreen:pl) locale(plasma5-bigscreen:pt) locale(plasma5-bigscreen:pt_BR) locale(plasma5-bigscreen:ro) locale(plasma5-bigscreen:ru) locale(plasma5-bigscreen:sk) locale(plasma5-bigscreen:sl) locale(plasma5-bigscreen:sv) locale(plasma5-bigscreen:tr) locale(plasma5-bigscreen:uk) locale(plasma5-bigscreen:zh_CN) locale(plasma5-bigscreen:zh_TW) plasma5-bigscreen-lang plasma5-bigscreen-lang-all"
RDEPENDS:${PN} += "plasma5-bigscreen"

inherit rpm
