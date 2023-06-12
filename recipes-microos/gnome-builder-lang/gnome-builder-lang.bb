SUMMARY = "Translations for package gnome-builder"
DESCRIPTION = "Provides translations for the 'gnome-builder' package."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later & GPL-3.0-or-later & LGPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "gnome-builder-lang-44.1-1.3.noarch.rpm"
RPM_HASH = "d643566d91acbaccce9127fcaf389de941c34dd2b79f730733b21c43f4d781f5f3f50b0a80531d181ce762d80f61976cf9134a16507de5612afe17684119ed6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-builder-lang gnome-builder-lang-all locale(gnome-builder:bs) locale(gnome-builder:ca) locale(gnome-builder:ca@valencia) locale(gnome-builder:cs) locale(gnome-builder:da) locale(gnome-builder:de) locale(gnome-builder:el) locale(gnome-builder:en_GB) locale(gnome-builder:eo) locale(gnome-builder:es) locale(gnome-builder:eu) locale(gnome-builder:fi) locale(gnome-builder:fr) locale(gnome-builder:fur) locale(gnome-builder:gl) locale(gnome-builder:he) locale(gnome-builder:hr) locale(gnome-builder:hu) locale(gnome-builder:id) locale(gnome-builder:it) locale(gnome-builder:ja) locale(gnome-builder:ka) locale(gnome-builder:kk) locale(gnome-builder:ko) locale(gnome-builder:lt) locale(gnome-builder:lv) locale(gnome-builder:ml) locale(gnome-builder:ms) locale(gnome-builder:nb) locale(gnome-builder:ne) locale(gnome-builder:nl) locale(gnome-builder:oc) locale(gnome-builder:pl) locale(gnome-builder:pt) locale(gnome-builder:pt_BR) locale(gnome-builder:ro) locale(gnome-builder:ru) locale(gnome-builder:sk) locale(gnome-builder:sl) locale(gnome-builder:sr) locale(gnome-builder:sr@latin) locale(gnome-builder:sv) locale(gnome-builder:tr) locale(gnome-builder:uk) locale(gnome-builder:zh_CN) locale(gnome-builder:zh_TW)"
RDEPENDS:${PN} += "gnome-builder"

inherit rpm
