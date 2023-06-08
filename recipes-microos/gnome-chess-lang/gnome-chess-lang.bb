SUMMARY = "Translations for package gnome-chess"
DESCRIPTION = "Provides translations for the 'gnome-chess' package."
LICENSE = "GPL-3.0-or-later"

PV = "43.2"

RPM_NAME = "gnome-chess-lang-43.2-1.1.noarch.rpm"
RPM_HASH = "bba79fc84b9762932d527e82f86ada1e95d186ec8e5d11d9d49c50a05c9a0331474d1591e36e984c0e675b6cfe4dd78615321680022d438fb364e10f63ea6c4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-chess-lang gnome-chess-lang-all locale(gnome-chess:af) locale(gnome-chess:ar) locale(gnome-chess:as) locale(gnome-chess:ast) locale(gnome-chess:az) locale(gnome-chess:be) locale(gnome-chess:bg) locale(gnome-chess:bn) locale(gnome-chess:bn_IN) locale(gnome-chess:br) locale(gnome-chess:bs) locale(gnome-chess:ca) locale(gnome-chess:ca@valencia) locale(gnome-chess:cs) locale(gnome-chess:cy) locale(gnome-chess:da) locale(gnome-chess:de) locale(gnome-chess:dz) locale(gnome-chess:el) locale(gnome-chess:en@shaw) locale(gnome-chess:en_CA) locale(gnome-chess:en_GB) locale(gnome-chess:eo) locale(gnome-chess:es) locale(gnome-chess:et) locale(gnome-chess:eu) locale(gnome-chess:fa) locale(gnome-chess:fi) locale(gnome-chess:fr) locale(gnome-chess:fur) locale(gnome-chess:ga) locale(gnome-chess:gl) locale(gnome-chess:gu) locale(gnome-chess:he) locale(gnome-chess:hi) locale(gnome-chess:hr) locale(gnome-chess:hu) locale(gnome-chess:id) locale(gnome-chess:is) locale(gnome-chess:it) locale(gnome-chess:ja) locale(gnome-chess:ka) locale(gnome-chess:kk) locale(gnome-chess:km) locale(gnome-chess:kn) locale(gnome-chess:ko) locale(gnome-chess:lt) locale(gnome-chess:lv) locale(gnome-chess:mai) locale(gnome-chess:mk) locale(gnome-chess:ml) locale(gnome-chess:mr) locale(gnome-chess:ms) locale(gnome-chess:nb) locale(gnome-chess:ne) locale(gnome-chess:nl) locale(gnome-chess:nn) locale(gnome-chess:oc) locale(gnome-chess:or) locale(gnome-chess:pa) locale(gnome-chess:pl) locale(gnome-chess:pt) locale(gnome-chess:pt_BR) locale(gnome-chess:ro) locale(gnome-chess:ru) locale(gnome-chess:si) locale(gnome-chess:sk) locale(gnome-chess:sl) locale(gnome-chess:sq) locale(gnome-chess:sr) locale(gnome-chess:sr@latin) locale(gnome-chess:sv) locale(gnome-chess:ta) locale(gnome-chess:te) locale(gnome-chess:th) locale(gnome-chess:tr) locale(gnome-chess:ug) locale(gnome-chess:uk) locale(gnome-chess:vi) locale(gnome-chess:wa) locale(gnome-chess:zh_CN) locale(gnome-chess:zh_HK) locale(gnome-chess:zh_TW)"
RDEPENDS:${PN} += "gnome-chess"

inherit rpm
