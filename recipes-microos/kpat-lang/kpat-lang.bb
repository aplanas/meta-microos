SUMMARY = "Translations for package kpat"
DESCRIPTION = "Provides translations for the 'kpat' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kpat-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "cbeee32bb7b7a09123d0f279ac30e218b5bbc9f99befd3a28422d2a2cd3c329663cf1fdcaa470dd02832cd7d562745e7e502195dd0f079bc2bbb19577d518d76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kpat-lang kpat-lang-all locale(kpat:af) locale(kpat:ar) locale(kpat:be) locale(kpat:bg) locale(kpat:br) locale(kpat:bs) locale(kpat:ca) locale(kpat:ca@valencia) locale(kpat:cs) locale(kpat:cy) locale(kpat:da) locale(kpat:de) locale(kpat:el) locale(kpat:en_GB) locale(kpat:eo) locale(kpat:es) locale(kpat:et) locale(kpat:eu) locale(kpat:fa) locale(kpat:fi) locale(kpat:fr) locale(kpat:ga) locale(kpat:gl) locale(kpat:he) locale(kpat:hi) locale(kpat:hr) locale(kpat:hu) locale(kpat:id) locale(kpat:is) locale(kpat:it) locale(kpat:ja) locale(kpat:ka) locale(kpat:kk) locale(kpat:km) locale(kpat:ko) locale(kpat:lt) locale(kpat:lv) locale(kpat:mai) locale(kpat:mk) locale(kpat:ml) locale(kpat:mr) locale(kpat:ms) locale(kpat:nb) locale(kpat:nds) locale(kpat:ne) locale(kpat:nl) locale(kpat:nn) locale(kpat:oc) locale(kpat:pa) locale(kpat:pl) locale(kpat:pt) locale(kpat:pt_BR) locale(kpat:ro) locale(kpat:ru) locale(kpat:sk) locale(kpat:sl) locale(kpat:sq) locale(kpat:sr) locale(kpat:sr@ijekavian) locale(kpat:sr@ijekavianlatin) locale(kpat:sr@latin) locale(kpat:sv) locale(kpat:ta) locale(kpat:th) locale(kpat:tr) locale(kpat:ug) locale(kpat:uk) locale(kpat:wa) locale(kpat:zh_CN) locale(kpat:zh_TW)"
RDEPENDS:${PN} += "kpat"

inherit rpm
