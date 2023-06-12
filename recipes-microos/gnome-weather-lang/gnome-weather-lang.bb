SUMMARY = "Translations for package gnome-weather"
DESCRIPTION = "Provides translations for the 'gnome-weather' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-weather-lang-44.0-2.1.noarch.rpm"
RPM_HASH = "b001265211949f8db134b3944e63511ee880f9385dd037175cdec6c8278cb4aac6c7dc2d8225854997d309995fcc9e546eb4851cd9ac4a20732e8a617d1d57c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-weather-lang \
gnome-weather-lang-all \
locale(gnome-weather:af) \
locale(gnome-weather:ar) \
locale(gnome-weather:as) \
locale(gnome-weather:be) \
locale(gnome-weather:bg) \
locale(gnome-weather:bn_IN) \
locale(gnome-weather:bs) \
locale(gnome-weather:ca) \
locale(gnome-weather:ca@valencia) \
locale(gnome-weather:cs) \
locale(gnome-weather:da) \
locale(gnome-weather:de) \
locale(gnome-weather:el) \
locale(gnome-weather:en_GB) \
locale(gnome-weather:eo) \
locale(gnome-weather:es) \
locale(gnome-weather:et) \
locale(gnome-weather:eu) \
locale(gnome-weather:fa) \
locale(gnome-weather:fi) \
locale(gnome-weather:fr) \
locale(gnome-weather:fur) \
locale(gnome-weather:ga) \
locale(gnome-weather:gd) \
locale(gnome-weather:gl) \
locale(gnome-weather:he) \
locale(gnome-weather:hi) \
locale(gnome-weather:hr) \
locale(gnome-weather:hu) \
locale(gnome-weather:id) \
locale(gnome-weather:is) \
locale(gnome-weather:it) \
locale(gnome-weather:ja) \
locale(gnome-weather:ka) \
locale(gnome-weather:kk) \
locale(gnome-weather:kn) \
locale(gnome-weather:ko) \
locale(gnome-weather:lt) \
locale(gnome-weather:lv) \
locale(gnome-weather:ml) \
locale(gnome-weather:ms) \
locale(gnome-weather:nb) \
locale(gnome-weather:ne) \
locale(gnome-weather:nl) \
locale(gnome-weather:oc) \
locale(gnome-weather:pa) \
locale(gnome-weather:pl) \
locale(gnome-weather:pt) \
locale(gnome-weather:pt_BR) \
locale(gnome-weather:ro) \
locale(gnome-weather:ru) \
locale(gnome-weather:sk) \
locale(gnome-weather:sl) \
locale(gnome-weather:sr) \
locale(gnome-weather:sr@latin) \
locale(gnome-weather:sv) \
locale(gnome-weather:ta) \
locale(gnome-weather:te) \
locale(gnome-weather:th) \
locale(gnome-weather:tr) \
locale(gnome-weather:uk) \
locale(gnome-weather:vi) \
locale(gnome-weather:zh_CN) \
locale(gnome-weather:zh_HK) \
locale(gnome-weather:zh_TW)"
RDEPENDS:${PN} += "gnome-weather"

inherit rpm
