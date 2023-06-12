SUMMARY = "Translations for package ghostwriter"
DESCRIPTION = "Provides translations for the 'ghostwriter' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "ghostwriter-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "4c8fd5903af35f5ccc3642bb014b2955696699675fc68c6abbb9475c62d405b153526ee838e80062b73059f4f4c048ffc203671a59669f3a8f5f90bae48b9deb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghostwriter-lang ghostwriter-lang-all locale(ghostwriter:ca) locale(ghostwriter:ca@valencia) locale(ghostwriter:cs) locale(ghostwriter:de) locale(ghostwriter:en) locale(ghostwriter:en_GB) locale(ghostwriter:es) locale(ghostwriter:eu) locale(ghostwriter:fi) locale(ghostwriter:fr) locale(ghostwriter:id) locale(ghostwriter:it) locale(ghostwriter:ja) locale(ghostwriter:ka) locale(ghostwriter:lt) locale(ghostwriter:nl) locale(ghostwriter:pl) locale(ghostwriter:pt) locale(ghostwriter:ru) locale(ghostwriter:sk) locale(ghostwriter:sl) locale(ghostwriter:tr) locale(ghostwriter:uk) locale(ghostwriter:zh_CN) locale(ghostwriter:zh_TW)"
RDEPENDS:${PN} += "ghostwriter"

inherit rpm
