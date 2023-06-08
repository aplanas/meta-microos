SUMMARY = "Translations for package gnome-maps"
DESCRIPTION = "Provides translations for the 'gnome-maps' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-maps-lang-44.1-1.1.noarch.rpm"
RPM_HASH = "00a581931ba1a2b13c2639ac2d8dca8e65309217b703e0cc041081c9a860ce3806fd72e7849984a8b38be41a5b0518de7b178859dbf667774d5afefedf05c1fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-maps-lang gnome-maps-lang-all locale(gnome-maps:af) locale(gnome-maps:ar) locale(gnome-maps:as) locale(gnome-maps:be) locale(gnome-maps:bg) locale(gnome-maps:bs) locale(gnome-maps:ca) locale(gnome-maps:ca@valencia) locale(gnome-maps:cs) locale(gnome-maps:da) locale(gnome-maps:de) locale(gnome-maps:el) locale(gnome-maps:en_GB) locale(gnome-maps:eo) locale(gnome-maps:es) locale(gnome-maps:et) locale(gnome-maps:eu) locale(gnome-maps:fa) locale(gnome-maps:fi) locale(gnome-maps:fr) locale(gnome-maps:fur) locale(gnome-maps:ga) locale(gnome-maps:gd) locale(gnome-maps:gl) locale(gnome-maps:he) locale(gnome-maps:hi) locale(gnome-maps:hr) locale(gnome-maps:hu) locale(gnome-maps:id) locale(gnome-maps:is) locale(gnome-maps:it) locale(gnome-maps:ja) locale(gnome-maps:ka) locale(gnome-maps:kk) locale(gnome-maps:kn) locale(gnome-maps:ko) locale(gnome-maps:lt) locale(gnome-maps:lv) locale(gnome-maps:ml) locale(gnome-maps:ms) locale(gnome-maps:nb) locale(gnome-maps:ne) locale(gnome-maps:nl) locale(gnome-maps:oc) locale(gnome-maps:pa) locale(gnome-maps:pl) locale(gnome-maps:pt) locale(gnome-maps:pt_BR) locale(gnome-maps:ro) locale(gnome-maps:ru) locale(gnome-maps:sk) locale(gnome-maps:sl) locale(gnome-maps:sr) locale(gnome-maps:sr@latin) locale(gnome-maps:sv) locale(gnome-maps:ta) locale(gnome-maps:te) locale(gnome-maps:tr) locale(gnome-maps:uk) locale(gnome-maps:vi) locale(gnome-maps:zh_CN) locale(gnome-maps:zh_HK) locale(gnome-maps:zh_TW)"
RDEPENDS:${PN} += "gnome-maps"

inherit rpm
