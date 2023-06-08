SUMMARY = "Translations for package gnome-music"
DESCRIPTION = "Provides translations for the 'gnome-music' package."
LICENSE = "LGPL-2.1-or-later & SUSE-GPL-2.0-with-plugin-exception"

PV = "44.0"

RPM_NAME = "gnome-music-lang-44.0-1.1.noarch.rpm"
RPM_HASH = "172f3453d5b0e79d8910b36d01796d9af44009372e9b79ccce241580ed3221716d3037c912228555713dfa9e0f798db69d3005099a0a95f7ddd0202bd9eeb04d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-music-lang gnome-music-lang-all locale(gnome-music:af) locale(gnome-music:ar) locale(gnome-music:as) locale(gnome-music:be) locale(gnome-music:bg) locale(gnome-music:bs) locale(gnome-music:ca) locale(gnome-music:ca@valencia) locale(gnome-music:cs) locale(gnome-music:da) locale(gnome-music:de) locale(gnome-music:el) locale(gnome-music:en_GB) locale(gnome-music:eo) locale(gnome-music:es) locale(gnome-music:et) locale(gnome-music:eu) locale(gnome-music:fa) locale(gnome-music:fi) locale(gnome-music:fr) locale(gnome-music:fur) locale(gnome-music:ga) locale(gnome-music:gd) locale(gnome-music:gl) locale(gnome-music:he) locale(gnome-music:hr) locale(gnome-music:hu) locale(gnome-music:id) locale(gnome-music:is) locale(gnome-music:it) locale(gnome-music:ja) locale(gnome-music:ka) locale(gnome-music:kk) locale(gnome-music:kn) locale(gnome-music:ko) locale(gnome-music:lt) locale(gnome-music:lv) locale(gnome-music:ml) locale(gnome-music:ms) locale(gnome-music:nb) locale(gnome-music:ne) locale(gnome-music:nl) locale(gnome-music:oc) locale(gnome-music:pa) locale(gnome-music:pl) locale(gnome-music:pt) locale(gnome-music:pt_BR) locale(gnome-music:ro) locale(gnome-music:ru) locale(gnome-music:sk) locale(gnome-music:sl) locale(gnome-music:sr) locale(gnome-music:sr@latin) locale(gnome-music:sv) locale(gnome-music:ta) locale(gnome-music:te) locale(gnome-music:tr) locale(gnome-music:uk) locale(gnome-music:vi) locale(gnome-music:zh_CN) locale(gnome-music:zh_HK) locale(gnome-music:zh_TW)"
RDEPENDS:${PN} += "gnome-music"

inherit rpm
