SUMMARY = "Translations for package yishu"
DESCRIPTION = "Provides translations for the 'yishu' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.5"

RPM_NAME = "yishu-lang-1.2.5-1.16.noarch.rpm"
RPM_HASH = "f14b876a7f37fdb3ff850440e024ce1b401cce2102e64320715645a659f80e30a9956c2683684175cc8adbd1257a8fbf7ba492a68a09b7e2964bbc38244ea0c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yishu:af) locale(yishu:ar) locale(yishu:as) locale(yishu:ast) locale(yishu:az) locale(yishu:be) locale(yishu:bg) locale(yishu:bn) locale(yishu:br) locale(yishu:bs) locale(yishu:ca) locale(yishu:cs) locale(yishu:cy) locale(yishu:da) locale(yishu:de) locale(yishu:dz) locale(yishu:el) locale(yishu:en_AU) locale(yishu:en_CA) locale(yishu:en_GB) locale(yishu:eo) locale(yishu:es) locale(yishu:et) locale(yishu:eu) locale(yishu:fa) locale(yishu:fi) locale(yishu:fr) locale(yishu:fr_CA) locale(yishu:ga) locale(yishu:gd) locale(yishu:gl) locale(yishu:gu) locale(yishu:he) locale(yishu:hi) locale(yishu:hr) locale(yishu:hu) locale(yishu:ia) locale(yishu:id) locale(yishu:is) locale(yishu:it) locale(yishu:ja) locale(yishu:ka) locale(yishu:kk) locale(yishu:km) locale(yishu:kn) locale(yishu:ko) locale(yishu:lt) locale(yishu:lv) locale(yishu:mk) locale(yishu:ml) locale(yishu:mr) locale(yishu:ms) locale(yishu:nb) locale(yishu:ne) locale(yishu:nl) locale(yishu:nn) locale(yishu:oc) locale(yishu:or) locale(yishu:pa) locale(yishu:pl) locale(yishu:pt) locale(yishu:pt_BR) locale(yishu:ro) locale(yishu:ru) locale(yishu:si) locale(yishu:sk) locale(yishu:sl) locale(yishu:sq) locale(yishu:sr) locale(yishu:sv) locale(yishu:ta) locale(yishu:te) locale(yishu:th) locale(yishu:tr) locale(yishu:ug) locale(yishu:uk) locale(yishu:vi) locale(yishu:wa) locale(yishu:zh) locale(yishu:zh_HK) locale(yishu:zh_TW) yishu-lang yishu-lang-all"
RDEPENDS:${PN} += "yishu"

inherit rpm
