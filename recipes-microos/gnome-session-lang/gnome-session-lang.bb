SUMMARY = "Translations for package gnome-session"
DESCRIPTION = "Provides translations for the 'gnome-session' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-session-lang-44.0-1.1.noarch.rpm"
RPM_HASH = "9ccc7f73339b080c24459b9071708db0f0d6e5973ccee21d78f0f068c7151b25a6a725b2c938e1ac276aa0aa30d0616ae368d4e2e093c7afde11c0878a633996"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-session-lang gnome-session-lang-all locale(gnome-session:af) locale(gnome-session:ar) locale(gnome-session:as) locale(gnome-session:ast) locale(gnome-session:az) locale(gnome-session:be) locale(gnome-session:be@latin) locale(gnome-session:bg) locale(gnome-session:bn) locale(gnome-session:bn_IN) locale(gnome-session:br) locale(gnome-session:bs) locale(gnome-session:ca) locale(gnome-session:ca@valencia) locale(gnome-session:cs) locale(gnome-session:cy) locale(gnome-session:da) locale(gnome-session:de) locale(gnome-session:dz) locale(gnome-session:el) locale(gnome-session:en@shaw) locale(gnome-session:en_CA) locale(gnome-session:en_GB) locale(gnome-session:eo) locale(gnome-session:es) locale(gnome-session:et) locale(gnome-session:eu) locale(gnome-session:fa) locale(gnome-session:fi) locale(gnome-session:fr) locale(gnome-session:fur) locale(gnome-session:ga) locale(gnome-session:gd) locale(gnome-session:gl) locale(gnome-session:gu) locale(gnome-session:he) locale(gnome-session:hi) locale(gnome-session:hr) locale(gnome-session:hu) locale(gnome-session:id) locale(gnome-session:is) locale(gnome-session:it) locale(gnome-session:ja) locale(gnome-session:ka) locale(gnome-session:kk) locale(gnome-session:km) locale(gnome-session:kn) locale(gnome-session:ko) locale(gnome-session:lt) locale(gnome-session:lv) locale(gnome-session:mai) locale(gnome-session:mk) locale(gnome-session:ml) locale(gnome-session:mr) locale(gnome-session:ms) locale(gnome-session:nb) locale(gnome-session:nds) locale(gnome-session:ne) locale(gnome-session:nl) locale(gnome-session:nn) locale(gnome-session:oc) locale(gnome-session:or) locale(gnome-session:pa) locale(gnome-session:pl) locale(gnome-session:pt) locale(gnome-session:pt_BR) locale(gnome-session:ro) locale(gnome-session:ru) locale(gnome-session:si) locale(gnome-session:sk) locale(gnome-session:sl) locale(gnome-session:sq) locale(gnome-session:sr) locale(gnome-session:sr@latin) locale(gnome-session:sv) locale(gnome-session:ta) locale(gnome-session:te) locale(gnome-session:th) locale(gnome-session:tr) locale(gnome-session:ug) locale(gnome-session:uk) locale(gnome-session:vi) locale(gnome-session:wa) locale(gnome-session:zh_CN) locale(gnome-session:zh_HK) locale(gnome-session:zh_TW)"
RDEPENDS:${PN} += "gnome-session"

inherit rpm
