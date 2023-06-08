SUMMARY = "Translations for package remmina"
DESCRIPTION = "Provides translations for the 'remmina' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.30"

RPM_NAME = "remmina-lang-1.4.30-1.1.noarch.rpm"
RPM_HASH = "06cadfeeca07bc7429fbcd5520a078e2d91bf67b73303382d2a270dbbdad8861bcf694a951c764bb3661b8f6094971bef67e1c0c214f612b6cb6a645abe55ac8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(remmina:ar) locale(remmina:ast) locale(remmina:bg) locale(remmina:bn) locale(remmina:br) locale(remmina:bs) locale(remmina:ca) locale(remmina:ca@valencia) locale(remmina:cs) locale(remmina:da) locale(remmina:de) locale(remmina:el) locale(remmina:en_AU) locale(remmina:en_GB) locale(remmina:en_US) locale(remmina:eo) locale(remmina:es) locale(remmina:es_VE) locale(remmina:et) locale(remmina:eu) locale(remmina:fa) locale(remmina:fi) locale(remmina:fr) locale(remmina:gl) locale(remmina:he) locale(remmina:hi) locale(remmina:hr) locale(remmina:hu) locale(remmina:id) locale(remmina:it) locale(remmina:ja) locale(remmina:ka) locale(remmina:kk) locale(remmina:km) locale(remmina:kn) locale(remmina:ko) locale(remmina:lt) locale(remmina:lv) locale(remmina:mk) locale(remmina:mr) locale(remmina:ms) locale(remmina:nb) locale(remmina:nl) locale(remmina:oc) locale(remmina:pl) locale(remmina:pt) locale(remmina:pt_BR) locale(remmina:pt_PT) locale(remmina:ro) locale(remmina:ru) locale(remmina:si) locale(remmina:sk) locale(remmina:sl) locale(remmina:sq) locale(remmina:sr) locale(remmina:sv) locale(remmina:te) locale(remmina:th) locale(remmina:tr) locale(remmina:ug) locale(remmina:uk) locale(remmina:vi) locale(remmina:zh_CN) locale(remmina:zh_TW) remmina-lang remmina-lang-all"
RDEPENDS:${PN} += "remmina"

inherit rpm
