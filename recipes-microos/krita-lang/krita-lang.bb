SUMMARY = "Translations for package krita"
DESCRIPTION = "Provides translations for the 'krita' package."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & LGPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & CC0-1.0 & LGPL-2.0-only"

PV = "5.1.5"

RPM_NAME = "krita-lang-5.1.5-1.6.noarch.rpm"
RPM_HASH = "84207e43634eacf1c218c0a59cee3830a47d58e5107fc802055d4ad00fd164a445513d236de88ced4d2492c64e301b6135dd94361f903b0ef86deeb9da11b7db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "krita-lang krita-lang-all locale(krita:af) locale(krita:ar) locale(krita:ast) locale(krita:be) locale(krita:bg) locale(krita:br) locale(krita:bs) locale(krita:ca) locale(krita:ca@valencia) locale(krita:cs) locale(krita:cy) locale(krita:da) locale(krita:de) locale(krita:el) locale(krita:en_GB) locale(krita:eo) locale(krita:es) locale(krita:et) locale(krita:eu) locale(krita:fa) locale(krita:fi) locale(krita:fr) locale(krita:ga) locale(krita:gl) locale(krita:he) locale(krita:hi) locale(krita:hr) locale(krita:hu) locale(krita:ia) locale(krita:id) locale(krita:is) locale(krita:it) locale(krita:ja) locale(krita:ka) locale(krita:kk) locale(krita:km) locale(krita:ko) locale(krita:lt) locale(krita:lv) locale(krita:mai) locale(krita:mk) locale(krita:mr) locale(krita:ms) locale(krita:nb) locale(krita:nds) locale(krita:ne) locale(krita:nl) locale(krita:nn) locale(krita:oc) locale(krita:pa) locale(krita:pl) locale(krita:pt) locale(krita:pt_BR) locale(krita:ro) locale(krita:ru) locale(krita:sk) locale(krita:sl) locale(krita:sq) locale(krita:sv) locale(krita:ta) locale(krita:th) locale(krita:tr) locale(krita:ug) locale(krita:uk) locale(krita:vi) locale(krita:wa) locale(krita:zh_CN) locale(krita:zh_TW)"
RDEPENDS:${PN} += "krita"

inherit rpm
