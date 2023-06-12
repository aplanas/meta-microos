SUMMARY = "Translations for package gnome-mahjongg"
DESCRIPTION = "Provides translations for the 'gnome-mahjongg' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.40.0"

RPM_NAME = "gnome-mahjongg-lang-3.40.0-1.1.noarch.rpm"
RPM_HASH = "9e2eed7ed53b01028a093cebd66473dbdbcccccb0fc9d3e993835f044b4e89277ed2d3ae25f09d0e8a04204fb76b8ee4ab25074fb71bf12f1cb3f4520d109130"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-mahjongg-lang gnome-mahjongg-lang-all locale(gnome-mahjongg:af) locale(gnome-mahjongg:ar) locale(gnome-mahjongg:as) locale(gnome-mahjongg:ast) locale(gnome-mahjongg:az) locale(gnome-mahjongg:be) locale(gnome-mahjongg:bg) locale(gnome-mahjongg:bn) locale(gnome-mahjongg:bn_IN) locale(gnome-mahjongg:br) locale(gnome-mahjongg:bs) locale(gnome-mahjongg:ca) locale(gnome-mahjongg:ca@valencia) locale(gnome-mahjongg:cs) locale(gnome-mahjongg:cy) locale(gnome-mahjongg:da) locale(gnome-mahjongg:de) locale(gnome-mahjongg:dz) locale(gnome-mahjongg:el) locale(gnome-mahjongg:en@shaw) locale(gnome-mahjongg:en_CA) locale(gnome-mahjongg:en_GB) locale(gnome-mahjongg:eo) locale(gnome-mahjongg:es) locale(gnome-mahjongg:et) locale(gnome-mahjongg:eu) locale(gnome-mahjongg:fa) locale(gnome-mahjongg:fi) locale(gnome-mahjongg:fr) locale(gnome-mahjongg:fur) locale(gnome-mahjongg:ga) locale(gnome-mahjongg:gl) locale(gnome-mahjongg:gu) locale(gnome-mahjongg:he) locale(gnome-mahjongg:hi) locale(gnome-mahjongg:hr) locale(gnome-mahjongg:hu) locale(gnome-mahjongg:id) locale(gnome-mahjongg:is) locale(gnome-mahjongg:it) locale(gnome-mahjongg:ja) locale(gnome-mahjongg:ka) locale(gnome-mahjongg:kk) locale(gnome-mahjongg:km) locale(gnome-mahjongg:kn) locale(gnome-mahjongg:ko) locale(gnome-mahjongg:lt) locale(gnome-mahjongg:lv) locale(gnome-mahjongg:mai) locale(gnome-mahjongg:mk) locale(gnome-mahjongg:ml) locale(gnome-mahjongg:mr) locale(gnome-mahjongg:ms) locale(gnome-mahjongg:nb) locale(gnome-mahjongg:ne) locale(gnome-mahjongg:nl) locale(gnome-mahjongg:nn) locale(gnome-mahjongg:oc) locale(gnome-mahjongg:or) locale(gnome-mahjongg:pa) locale(gnome-mahjongg:pl) locale(gnome-mahjongg:pt) locale(gnome-mahjongg:pt_BR) locale(gnome-mahjongg:ro) locale(gnome-mahjongg:ru) locale(gnome-mahjongg:si) locale(gnome-mahjongg:sk) locale(gnome-mahjongg:sl) locale(gnome-mahjongg:sq) locale(gnome-mahjongg:sr) locale(gnome-mahjongg:sr@latin) locale(gnome-mahjongg:sv) locale(gnome-mahjongg:ta) locale(gnome-mahjongg:te) locale(gnome-mahjongg:th) locale(gnome-mahjongg:tr) locale(gnome-mahjongg:ug) locale(gnome-mahjongg:uk) locale(gnome-mahjongg:vi) locale(gnome-mahjongg:wa) locale(gnome-mahjongg:zh_CN) locale(gnome-mahjongg:zh_HK) locale(gnome-mahjongg:zh_TW)"
RDEPENDS:${PN} += "gnome-mahjongg"

inherit rpm
