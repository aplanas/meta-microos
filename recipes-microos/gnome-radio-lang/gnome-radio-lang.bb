SUMMARY = "Translations for package gnome-radio"
DESCRIPTION = "Provides translations for the 'gnome-radio' package."
LICENSE = "GPL-3.0-or-later"

PV = "64.0"

RPM_NAME = "gnome-radio-lang-64.0-1.1.noarch.rpm"
RPM_HASH = "7888270c26c4c21878e97baf241017a695e4a5c06712bea0ab2f6b7e671e765b099822d03be0b114f37ed676f63bf9b981272b0486ee2dbbbc8a248f4d00a24b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-radio-lang gnome-radio-lang-all locale(gnome-radio:ca) locale(gnome-radio:cs) locale(gnome-radio:da) locale(gnome-radio:de) locale(gnome-radio:el) locale(gnome-radio:es) locale(gnome-radio:eu) locale(gnome-radio:fr) locale(gnome-radio:fur) locale(gnome-radio:hr) locale(gnome-radio:hu) locale(gnome-radio:id) locale(gnome-radio:nb) locale(gnome-radio:nl) locale(gnome-radio:oc) locale(gnome-radio:pl) locale(gnome-radio:pt_BR) locale(gnome-radio:ro) locale(gnome-radio:sk) locale(gnome-radio:sl) locale(gnome-radio:sr) locale(gnome-radio:sv) locale(gnome-radio:tr) locale(gnome-radio:uk) locale(gnome-radio:zh_CN)"
RDEPENDS:${PN} += "gnome-radio"

inherit rpm
