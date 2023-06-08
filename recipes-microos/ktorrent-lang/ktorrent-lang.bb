SUMMARY = "Translations for package ktorrent"
DESCRIPTION = "Provides translations for the 'ktorrent' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "ktorrent-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "d8192f6c9a0cf6304eb48bbc887927f310c1af8fb380ddc57c64d21455bd72f4adb6a73caf43f69bcdac3e6984a6178dcdc6c8b65d2de7dcac6ac0aa785e042d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktorrent-lang ktorrent-lang-all locale(ktorrent:ar) locale(ktorrent:be) locale(ktorrent:bg) locale(ktorrent:bs) locale(ktorrent:ca) locale(ktorrent:ca@valencia) locale(ktorrent:cs) locale(ktorrent:da) locale(ktorrent:de) locale(ktorrent:el) locale(ktorrent:en_GB) locale(ktorrent:eo) locale(ktorrent:es) locale(ktorrent:et) locale(ktorrent:eu) locale(ktorrent:fi) locale(ktorrent:fr) locale(ktorrent:ga) locale(ktorrent:gl) locale(ktorrent:he) locale(ktorrent:hi) locale(ktorrent:hr) locale(ktorrent:hu) locale(ktorrent:ia) locale(ktorrent:is) locale(ktorrent:it) locale(ktorrent:ja) locale(ktorrent:ka) locale(ktorrent:kk) locale(ktorrent:km) locale(ktorrent:ko) locale(ktorrent:lt) locale(ktorrent:lv) locale(ktorrent:mr) locale(ktorrent:ms) locale(ktorrent:nb) locale(ktorrent:nds) locale(ktorrent:nl) locale(ktorrent:nn) locale(ktorrent:oc) locale(ktorrent:pl) locale(ktorrent:pt) locale(ktorrent:pt_BR) locale(ktorrent:ro) locale(ktorrent:ru) locale(ktorrent:si) locale(ktorrent:sk) locale(ktorrent:sl) locale(ktorrent:sq) locale(ktorrent:sr) locale(ktorrent:sr@ijekavian) locale(ktorrent:sr@ijekavianlatin) locale(ktorrent:sr@latin) locale(ktorrent:sv) locale(ktorrent:tr) locale(ktorrent:ug) locale(ktorrent:uk) locale(ktorrent:zh_CN) locale(ktorrent:zh_TW)"
RDEPENDS:${PN} += "ktorrent"

inherit rpm
