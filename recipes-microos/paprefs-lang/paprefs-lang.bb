SUMMARY = "Translations for package paprefs"
DESCRIPTION = "Provides translations for the 'paprefs' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "paprefs-lang-1.2-1.7.noarch.rpm"
RPM_HASH = "0e0f808ce58e82cbb46ea2b77d790fff3c924a4014b8905b00d29650478fc6ac43d124557f38d6c339a9ea369f838bdd2db88c61dc2e721c57041523e1cc2bf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(paprefs:as) \
locale(paprefs:ast) \
locale(paprefs:bn_IN) \
locale(paprefs:ca) \
locale(paprefs:cs) \
locale(paprefs:da) \
locale(paprefs:de) \
locale(paprefs:el) \
locale(paprefs:es) \
locale(paprefs:fi) \
locale(paprefs:fr) \
locale(paprefs:gl) \
locale(paprefs:gu) \
locale(paprefs:he) \
locale(paprefs:hi) \
locale(paprefs:hr) \
locale(paprefs:hu) \
locale(paprefs:id) \
locale(paprefs:it) \
locale(paprefs:ja) \
locale(paprefs:kk) \
locale(paprefs:kn) \
locale(paprefs:ko) \
locale(paprefs:lt) \
locale(paprefs:ml) \
locale(paprefs:mr) \
locale(paprefs:ms) \
locale(paprefs:nl) \
locale(paprefs:nn) \
locale(paprefs:or) \
locale(paprefs:pa) \
locale(paprefs:pl) \
locale(paprefs:pt) \
locale(paprefs:pt_BR) \
locale(paprefs:si) \
locale(paprefs:sk) \
locale(paprefs:sr) \
locale(paprefs:sr@latin) \
locale(paprefs:sv) \
locale(paprefs:ta) \
locale(paprefs:te) \
locale(paprefs:th) \
locale(paprefs:tr) \
locale(paprefs:uk) \
locale(paprefs:zh_CN) \
locale(paprefs:zh_TW) \
paprefs-lang \
paprefs-lang-all"
RDEPENDS:${PN} += "paprefs"

inherit rpm
