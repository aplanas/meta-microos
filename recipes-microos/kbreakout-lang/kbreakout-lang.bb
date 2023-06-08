SUMMARY = "Translations for package kbreakout"
DESCRIPTION = "Provides translations for the 'kbreakout' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kbreakout-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "cc597eb1cf1c16f8ce392f2e4b63d8d5a5e76485948ef76dfdbbfc693b7683829e94b48d0f04a5e17d5aa40893ef914136960e196870032770c6c42a05d717a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbreakout-lang kbreakout-lang-all locale(kbreakout:ar) locale(kbreakout:bg) locale(kbreakout:bs) locale(kbreakout:ca) locale(kbreakout:ca@valencia) locale(kbreakout:cs) locale(kbreakout:da) locale(kbreakout:de) locale(kbreakout:el) locale(kbreakout:en_GB) locale(kbreakout:eo) locale(kbreakout:es) locale(kbreakout:et) locale(kbreakout:eu) locale(kbreakout:fi) locale(kbreakout:fr) locale(kbreakout:ga) locale(kbreakout:gl) locale(kbreakout:gu) locale(kbreakout:hr) locale(kbreakout:hu) locale(kbreakout:id) locale(kbreakout:is) locale(kbreakout:it) locale(kbreakout:ja) locale(kbreakout:ka) locale(kbreakout:kk) locale(kbreakout:km) locale(kbreakout:ko) locale(kbreakout:lt) locale(kbreakout:lv) locale(kbreakout:mai) locale(kbreakout:ml) locale(kbreakout:mr) locale(kbreakout:nb) locale(kbreakout:nds) locale(kbreakout:nl) locale(kbreakout:nn) locale(kbreakout:pl) locale(kbreakout:pt) locale(kbreakout:pt_BR) locale(kbreakout:ro) locale(kbreakout:ru) locale(kbreakout:sk) locale(kbreakout:sl) locale(kbreakout:sq) locale(kbreakout:sr) locale(kbreakout:sr@ijekavian) locale(kbreakout:sr@ijekavianlatin) locale(kbreakout:sr@latin) locale(kbreakout:sv) locale(kbreakout:th) locale(kbreakout:tr) locale(kbreakout:ug) locale(kbreakout:uk) locale(kbreakout:wa) locale(kbreakout:zh_CN) locale(kbreakout:zh_TW)"
RDEPENDS:${PN} += "kbreakout"

inherit rpm
