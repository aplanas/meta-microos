SUMMARY = "Translations for package gnome-shell"
DESCRIPTION = "Provides translations for the 'gnome-shell' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-shell-lang-44.1-1.1.noarch.rpm"
RPM_HASH = "ad7b449765d253c6582702a7a344672c4b0c91f37ca0a07decd5b1fa02e0f9424d0cd62e3fa392377678ee859aa42173033257dea0d54e5f2f9913e0767553ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-lang gnome-shell-lang-all locale(gnome-shell:af) locale(gnome-shell:ar) locale(gnome-shell:as) locale(gnome-shell:ast) locale(gnome-shell:be) locale(gnome-shell:bg) locale(gnome-shell:bn) locale(gnome-shell:bn_IN) locale(gnome-shell:bs) locale(gnome-shell:ca) locale(gnome-shell:ca@valencia) locale(gnome-shell:cs) locale(gnome-shell:da) locale(gnome-shell:de) locale(gnome-shell:el) locale(gnome-shell:en_GB) locale(gnome-shell:eo) locale(gnome-shell:es) locale(gnome-shell:et) locale(gnome-shell:eu) locale(gnome-shell:fa) locale(gnome-shell:fi) locale(gnome-shell:fr) locale(gnome-shell:fur) locale(gnome-shell:ga) locale(gnome-shell:gd) locale(gnome-shell:gl) locale(gnome-shell:gu) locale(gnome-shell:he) locale(gnome-shell:hi) locale(gnome-shell:hr) locale(gnome-shell:hu) locale(gnome-shell:ia) locale(gnome-shell:id) locale(gnome-shell:is) locale(gnome-shell:it) locale(gnome-shell:ja) locale(gnome-shell:ka) locale(gnome-shell:kk) locale(gnome-shell:km) locale(gnome-shell:kn) locale(gnome-shell:ko) locale(gnome-shell:lt) locale(gnome-shell:lv) locale(gnome-shell:mk) locale(gnome-shell:ml) locale(gnome-shell:mr) locale(gnome-shell:ms) locale(gnome-shell:nb) locale(gnome-shell:ne) locale(gnome-shell:nl) locale(gnome-shell:nn) locale(gnome-shell:oc) locale(gnome-shell:or) locale(gnome-shell:pa) locale(gnome-shell:pl) locale(gnome-shell:pt) locale(gnome-shell:pt_BR) locale(gnome-shell:ro) locale(gnome-shell:ru) locale(gnome-shell:si) locale(gnome-shell:sk) locale(gnome-shell:sl) locale(gnome-shell:sr) locale(gnome-shell:sr@latin) locale(gnome-shell:sv) locale(gnome-shell:ta) locale(gnome-shell:te) locale(gnome-shell:th) locale(gnome-shell:tr) locale(gnome-shell:ug) locale(gnome-shell:uk) locale(gnome-shell:vi) locale(gnome-shell:zh_CN) locale(gnome-shell:zh_HK) locale(gnome-shell:zh_TW)"
RDEPENDS:${PN} += "gnome-shell"

inherit rpm
