SUMMARY = "Translations for package kcron"
DESCRIPTION = "Provides translations for the 'kcron' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kcron-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "ef519fb1bb16a634ecca802f6ce9c906673f234233fff58d99278ac68fb20f829415b3bf7fdb0b50417258a7465b00ff62e3e09f4ab2c854cb543e9ee5ec3830"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcron-lang kcron-lang-all locale(kcron:af) locale(kcron:ar) locale(kcron:be) locale(kcron:bg) locale(kcron:br) locale(kcron:bs) locale(kcron:ca) locale(kcron:ca@valencia) locale(kcron:cs) locale(kcron:cy) locale(kcron:da) locale(kcron:de) locale(kcron:el) locale(kcron:en_GB) locale(kcron:eo) locale(kcron:es) locale(kcron:et) locale(kcron:eu) locale(kcron:fa) locale(kcron:fi) locale(kcron:fr) locale(kcron:ga) locale(kcron:gl) locale(kcron:he) locale(kcron:hi) locale(kcron:hr) locale(kcron:hu) locale(kcron:ia) locale(kcron:is) locale(kcron:it) locale(kcron:ja) locale(kcron:ka) locale(kcron:kk) locale(kcron:km) locale(kcron:ko) locale(kcron:lt) locale(kcron:lv) locale(kcron:mk) locale(kcron:mr) locale(kcron:ms) locale(kcron:nb) locale(kcron:nds) locale(kcron:ne) locale(kcron:nl) locale(kcron:nn) locale(kcron:oc) locale(kcron:pa) locale(kcron:pl) locale(kcron:pt) locale(kcron:pt_BR) locale(kcron:ro) locale(kcron:ru) locale(kcron:sk) locale(kcron:sl) locale(kcron:sq) locale(kcron:sr) locale(kcron:sr@ijekavian) locale(kcron:sr@ijekavianlatin) locale(kcron:sr@latin) locale(kcron:sv) locale(kcron:ta) locale(kcron:th) locale(kcron:tr) locale(kcron:ug) locale(kcron:uk) locale(kcron:vi) locale(kcron:wa) locale(kcron:zh_CN) locale(kcron:zh_HK) locale(kcron:zh_TW)"
RDEPENDS:${PN} += "kcron"

inherit rpm
