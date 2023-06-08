SUMMARY = "Translations for package kcalc"
DESCRIPTION = "Provides translations for the 'kcalc' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kcalc-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "b5e2e247dcff35d27ec0526bbbc0f3196a164ea5714475c443bc0853259fb4757b4832a19717147aa5fd7add3cec002575a572311d77ae72574678c8b25cbda1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcalc-lang kcalc-lang-all locale(kcalc:af) locale(kcalc:ar) locale(kcalc:az) locale(kcalc:be) locale(kcalc:bg) locale(kcalc:br) locale(kcalc:bs) locale(kcalc:ca) locale(kcalc:ca@valencia) locale(kcalc:cs) locale(kcalc:cy) locale(kcalc:da) locale(kcalc:de) locale(kcalc:el) locale(kcalc:en_GB) locale(kcalc:eo) locale(kcalc:es) locale(kcalc:et) locale(kcalc:eu) locale(kcalc:fa) locale(kcalc:fi) locale(kcalc:fr) locale(kcalc:ga) locale(kcalc:gl) locale(kcalc:he) locale(kcalc:hi) locale(kcalc:hr) locale(kcalc:hu) locale(kcalc:ia) locale(kcalc:id) locale(kcalc:is) locale(kcalc:it) locale(kcalc:ja) locale(kcalc:ka) locale(kcalc:kk) locale(kcalc:km) locale(kcalc:ko) locale(kcalc:lt) locale(kcalc:lv) locale(kcalc:mk) locale(kcalc:mr) locale(kcalc:ms) locale(kcalc:nb) locale(kcalc:nds) locale(kcalc:ne) locale(kcalc:nl) locale(kcalc:nn) locale(kcalc:oc) locale(kcalc:pa) locale(kcalc:pl) locale(kcalc:pt) locale(kcalc:pt_BR) locale(kcalc:ro) locale(kcalc:ru) locale(kcalc:sk) locale(kcalc:sl) locale(kcalc:sq) locale(kcalc:sr) locale(kcalc:sr@ijekavian) locale(kcalc:sr@ijekavianlatin) locale(kcalc:sr@latin) locale(kcalc:sv) locale(kcalc:ta) locale(kcalc:th) locale(kcalc:tr) locale(kcalc:ug) locale(kcalc:uk) locale(kcalc:wa) locale(kcalc:zh_CN) locale(kcalc:zh_TW)"
RDEPENDS:${PN} += "kcalc"

inherit rpm
