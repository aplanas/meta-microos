SUMMARY = "Translations for package gnome-text-editor"
DESCRIPTION = "Provides translations for the 'gnome-text-editor' package."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-text-editor-lang-44.0-1.1.noarch.rpm"
RPM_HASH = "cb5882a9fdcba49d39deab8398557c97bcb55cc1471e7fecd91e8e135224bc2982d8d8e294ca0280767e457fc8ffb28d1b2771a4781d0c77b07f0eb07656087a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-text-editor-lang gnome-text-editor-lang-all locale(gnome-text-editor:be) locale(gnome-text-editor:bg) locale(gnome-text-editor:ca) locale(gnome-text-editor:cs) locale(gnome-text-editor:da) locale(gnome-text-editor:de) locale(gnome-text-editor:el) locale(gnome-text-editor:en_GB) locale(gnome-text-editor:es) locale(gnome-text-editor:eu) locale(gnome-text-editor:fa) locale(gnome-text-editor:fi) locale(gnome-text-editor:fr) locale(gnome-text-editor:fur) locale(gnome-text-editor:gl) locale(gnome-text-editor:he) locale(gnome-text-editor:hr) locale(gnome-text-editor:hu) locale(gnome-text-editor:id) locale(gnome-text-editor:is) locale(gnome-text-editor:it) locale(gnome-text-editor:ja) locale(gnome-text-editor:ka) locale(gnome-text-editor:kk) locale(gnome-text-editor:ko) locale(gnome-text-editor:lt) locale(gnome-text-editor:lv) locale(gnome-text-editor:nb) locale(gnome-text-editor:ne) locale(gnome-text-editor:nl) locale(gnome-text-editor:oc) locale(gnome-text-editor:pa) locale(gnome-text-editor:pl) locale(gnome-text-editor:pt) locale(gnome-text-editor:pt_BR) locale(gnome-text-editor:ru) locale(gnome-text-editor:sk) locale(gnome-text-editor:sl) locale(gnome-text-editor:sr) locale(gnome-text-editor:sv) locale(gnome-text-editor:tr) locale(gnome-text-editor:uk) locale(gnome-text-editor:vi) locale(gnome-text-editor:zh_CN) locale(gnome-text-editor:zh_TW)"
RDEPENDS:${PN} += "gnome-text-editor"

inherit rpm
