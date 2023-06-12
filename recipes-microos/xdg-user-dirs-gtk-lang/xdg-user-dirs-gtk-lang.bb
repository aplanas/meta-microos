SUMMARY = "Translations for package xdg-user-dirs-gtk"
DESCRIPTION = "Provides translations for the 'xdg-user-dirs-gtk' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.11"

RPM_NAME = "xdg-user-dirs-gtk-lang-0.11-2.1.noarch.rpm"
RPM_HASH = "7c819898eeb51854ba490c8f0d185a50626b98505be48f266e35defe3c064707df489b02c9bf8ce51eb244b86d9749951e592864c4d9341d6df206690c1ed1e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xdg-user-dirs-gtk:af) \
locale(xdg-user-dirs-gtk:ar) \
locale(xdg-user-dirs-gtk:as) \
locale(xdg-user-dirs-gtk:ast) \
locale(xdg-user-dirs-gtk:be) \
locale(xdg-user-dirs-gtk:be@latin) \
locale(xdg-user-dirs-gtk:bg) \
locale(xdg-user-dirs-gtk:bn_IN) \
locale(xdg-user-dirs-gtk:bs) \
locale(xdg-user-dirs-gtk:ca) \
locale(xdg-user-dirs-gtk:cs) \
locale(xdg-user-dirs-gtk:da) \
locale(xdg-user-dirs-gtk:de) \
locale(xdg-user-dirs-gtk:dz) \
locale(xdg-user-dirs-gtk:el) \
locale(xdg-user-dirs-gtk:en_GB) \
locale(xdg-user-dirs-gtk:eo) \
locale(xdg-user-dirs-gtk:es) \
locale(xdg-user-dirs-gtk:et) \
locale(xdg-user-dirs-gtk:eu) \
locale(xdg-user-dirs-gtk:fa) \
locale(xdg-user-dirs-gtk:fi) \
locale(xdg-user-dirs-gtk:fr) \
locale(xdg-user-dirs-gtk:fur) \
locale(xdg-user-dirs-gtk:gl) \
locale(xdg-user-dirs-gtk:gu) \
locale(xdg-user-dirs-gtk:he) \
locale(xdg-user-dirs-gtk:hi) \
locale(xdg-user-dirs-gtk:hr) \
locale(xdg-user-dirs-gtk:hu) \
locale(xdg-user-dirs-gtk:id) \
locale(xdg-user-dirs-gtk:is) \
locale(xdg-user-dirs-gtk:it) \
locale(xdg-user-dirs-gtk:ja) \
locale(xdg-user-dirs-gtk:ka) \
locale(xdg-user-dirs-gtk:kk) \
locale(xdg-user-dirs-gtk:kn) \
locale(xdg-user-dirs-gtk:ko) \
locale(xdg-user-dirs-gtk:lt) \
locale(xdg-user-dirs-gtk:lv) \
locale(xdg-user-dirs-gtk:ml) \
locale(xdg-user-dirs-gtk:mr) \
locale(xdg-user-dirs-gtk:ms) \
locale(xdg-user-dirs-gtk:nb) \
locale(xdg-user-dirs-gtk:nds) \
locale(xdg-user-dirs-gtk:ne) \
locale(xdg-user-dirs-gtk:nl) \
locale(xdg-user-dirs-gtk:nn) \
locale(xdg-user-dirs-gtk:oc) \
locale(xdg-user-dirs-gtk:or) \
locale(xdg-user-dirs-gtk:pa) \
locale(xdg-user-dirs-gtk:pl) \
locale(xdg-user-dirs-gtk:pt) \
locale(xdg-user-dirs-gtk:pt_BR) \
locale(xdg-user-dirs-gtk:ro) \
locale(xdg-user-dirs-gtk:ru) \
locale(xdg-user-dirs-gtk:si) \
locale(xdg-user-dirs-gtk:sk) \
locale(xdg-user-dirs-gtk:sl) \
locale(xdg-user-dirs-gtk:sq) \
locale(xdg-user-dirs-gtk:sr) \
locale(xdg-user-dirs-gtk:sr@latin) \
locale(xdg-user-dirs-gtk:sv) \
locale(xdg-user-dirs-gtk:ta) \
locale(xdg-user-dirs-gtk:te) \
locale(xdg-user-dirs-gtk:th) \
locale(xdg-user-dirs-gtk:tr) \
locale(xdg-user-dirs-gtk:uk) \
locale(xdg-user-dirs-gtk:vi) \
locale(xdg-user-dirs-gtk:zh_CN) \
locale(xdg-user-dirs-gtk:zh_HK) \
locale(xdg-user-dirs-gtk:zh_TW) \
xdg-user-dirs-gtk-lang \
xdg-user-dirs-gtk-lang-all"
RDEPENDS:${PN} += "xdg-user-dirs-gtk"

inherit rpm
