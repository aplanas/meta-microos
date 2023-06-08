SUMMARY = "Translations for package kile"
DESCRIPTION = "Provides translations for the 'kile' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.93"

RPM_NAME = "kile-lang-2.9.93-2.21.noarch.rpm"
RPM_HASH = "f802afa3d96686228013315ef722ed0bd6bbd786407aa16663b41da25faab06091659ea65256e31997bc4f442e47346878f877a8278b2cf22e49e6feb2f9bf11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kile-lang kile-lang-all locale(kile:ar) locale(kile:bg) locale(kile:bs) locale(kile:ca) locale(kile:ca@valencia) locale(kile:cs) locale(kile:da) locale(kile:de) locale(kile:el) locale(kile:en_GB) locale(kile:eo) locale(kile:es) locale(kile:et) locale(kile:fi) locale(kile:fr) locale(kile:ga) locale(kile:gl) locale(kile:hi) locale(kile:hu) locale(kile:ia) locale(kile:it) locale(kile:ja) locale(kile:kk) locale(kile:ko) locale(kile:lt) locale(kile:mai) locale(kile:mr) locale(kile:ms) locale(kile:nb) locale(kile:nds) locale(kile:nl) locale(kile:nn) locale(kile:pl) locale(kile:pt) locale(kile:pt_BR) locale(kile:ro) locale(kile:ru) locale(kile:sk) locale(kile:sl) locale(kile:sv) locale(kile:tr) locale(kile:ug) locale(kile:uk) locale(kile:zh_CN) locale(kile:zh_TW)"
RDEPENDS:${PN} += "kile"

inherit rpm
