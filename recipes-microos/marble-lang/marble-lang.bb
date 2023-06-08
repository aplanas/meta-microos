SUMMARY = "Translations for package marble"
DESCRIPTION = "Provides translations for the 'marble' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "marble-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "e430e06d2b17e650bcf29e831fa694aaf041c92d3c5b86d756ca6102c60cee6a9beba3bd425a5f847e0fecfe93ec5aab3c0f9e27ffbe001eba0607d83c38df50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(marble:ar) locale(marble:be) locale(marble:bg) locale(marble:bs) locale(marble:ca) locale(marble:ca@valencia) locale(marble:cs) locale(marble:da) locale(marble:de) locale(marble:el) locale(marble:en) locale(marble:en_GB) locale(marble:eo) locale(marble:es) locale(marble:et) locale(marble:eu) locale(marble:fi) locale(marble:fr) locale(marble:ga) locale(marble:gl) locale(marble:gu) locale(marble:he) locale(marble:hi) locale(marble:hr) locale(marble:hu) locale(marble:id) locale(marble:is) locale(marble:it) locale(marble:ja) locale(marble:ka) locale(marble:kk) locale(marble:km) locale(marble:ko) locale(marble:lt) locale(marble:lv) locale(marble:mai) locale(marble:ml) locale(marble:mr) locale(marble:nb) locale(marble:nds) locale(marble:nl) locale(marble:nn) locale(marble:oc) locale(marble:pa) locale(marble:pl) locale(marble:pt) locale(marble:pt_BR) locale(marble:ro) locale(marble:ru) locale(marble:si) locale(marble:sk) locale(marble:sl) locale(marble:sv) locale(marble:th) locale(marble:tr) locale(marble:ug) locale(marble:uk) locale(marble:wa) locale(marble:zh_CN) locale(marble:zh_TW) marble-lang marble-lang-all"
RDEPENDS:${PN} += "marble"

inherit rpm
