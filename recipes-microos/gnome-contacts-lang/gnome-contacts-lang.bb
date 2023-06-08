SUMMARY = "Translations for package gnome-contacts"
DESCRIPTION = "Provides translations for the 'gnome-contacts' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-contacts-lang-44.0-1.1.noarch.rpm"
RPM_HASH = "c07d2c2eb3535e060cb1a086f66beb322566041873262f7be3ef81ce40554a9eb4d67cc7b587888355c1d5e6438fde80e318f02ed6bdfb99177dcc5b98f0ea4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-contacts-lang gnome-contacts-lang-all locale(gnome-contacts:af) locale(gnome-contacts:ar) locale(gnome-contacts:as) locale(gnome-contacts:ast) locale(gnome-contacts:be) locale(gnome-contacts:bg) locale(gnome-contacts:bn_IN) locale(gnome-contacts:bs) locale(gnome-contacts:ca) locale(gnome-contacts:ca@valencia) locale(gnome-contacts:cs) locale(gnome-contacts:da) locale(gnome-contacts:de) locale(gnome-contacts:el) locale(gnome-contacts:en_CA) locale(gnome-contacts:en_GB) locale(gnome-contacts:eo) locale(gnome-contacts:es) locale(gnome-contacts:et) locale(gnome-contacts:eu) locale(gnome-contacts:fa) locale(gnome-contacts:fi) locale(gnome-contacts:fr) locale(gnome-contacts:fur) locale(gnome-contacts:ga) locale(gnome-contacts:gd) locale(gnome-contacts:gl) locale(gnome-contacts:gu) locale(gnome-contacts:he) locale(gnome-contacts:hi) locale(gnome-contacts:hr) locale(gnome-contacts:hu) locale(gnome-contacts:id) locale(gnome-contacts:is) locale(gnome-contacts:it) locale(gnome-contacts:ja) locale(gnome-contacts:ka) locale(gnome-contacts:kk) locale(gnome-contacts:kn) locale(gnome-contacts:ko) locale(gnome-contacts:lt) locale(gnome-contacts:lv) locale(gnome-contacts:mk) locale(gnome-contacts:ml) locale(gnome-contacts:mr) locale(gnome-contacts:ms) locale(gnome-contacts:nb) locale(gnome-contacts:ne) locale(gnome-contacts:nl) locale(gnome-contacts:oc) locale(gnome-contacts:or) locale(gnome-contacts:pa) locale(gnome-contacts:pl) locale(gnome-contacts:pt) locale(gnome-contacts:pt_BR) locale(gnome-contacts:ro) locale(gnome-contacts:ru) locale(gnome-contacts:sk) locale(gnome-contacts:sl) locale(gnome-contacts:sr) locale(gnome-contacts:sr@latin) locale(gnome-contacts:sv) locale(gnome-contacts:ta) locale(gnome-contacts:te) locale(gnome-contacts:th) locale(gnome-contacts:tr) locale(gnome-contacts:ug) locale(gnome-contacts:uk) locale(gnome-contacts:vi) locale(gnome-contacts:zh_CN) locale(gnome-contacts:zh_HK) locale(gnome-contacts:zh_TW)"
RDEPENDS:${PN} += "gnome-contacts"

inherit rpm
