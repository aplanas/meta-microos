SUMMARY = "Translations for package pimcommon"
DESCRIPTION = "Provides translations for the 'pimcommon' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "pimcommon-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "da42ca7766afb4c22758df090012b5a882ea7e06cb436dbe50258b788c1e7ef67a0f77a7e5a69423f5da3b221ad701775f86b6a3e17390030c49aa0ff3442648"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(pimcommon:ar) \
locale(pimcommon:bs) \
locale(pimcommon:ca) \
locale(pimcommon:ca@valencia) \
locale(pimcommon:cs) \
locale(pimcommon:da) \
locale(pimcommon:de) \
locale(pimcommon:el) \
locale(pimcommon:en_GB) \
locale(pimcommon:es) \
locale(pimcommon:et) \
locale(pimcommon:eu) \
locale(pimcommon:fi) \
locale(pimcommon:fr) \
locale(pimcommon:ga) \
locale(pimcommon:gl) \
locale(pimcommon:hu) \
locale(pimcommon:ia) \
locale(pimcommon:it) \
locale(pimcommon:ja) \
locale(pimcommon:ka) \
locale(pimcommon:kk) \
locale(pimcommon:ko) \
locale(pimcommon:lt) \
locale(pimcommon:mr) \
locale(pimcommon:nb) \
locale(pimcommon:nds) \
locale(pimcommon:nl) \
locale(pimcommon:pl) \
locale(pimcommon:pt) \
locale(pimcommon:pt_BR) \
locale(pimcommon:ro) \
locale(pimcommon:ru) \
locale(pimcommon:sk) \
locale(pimcommon:sl) \
locale(pimcommon:sr) \
locale(pimcommon:sr@ijekavian) \
locale(pimcommon:sr@ijekavianlatin) \
locale(pimcommon:sr@latin) \
locale(pimcommon:sv) \
locale(pimcommon:tr) \
locale(pimcommon:ug) \
locale(pimcommon:uk) \
locale(pimcommon:zh_CN) \
locale(pimcommon:zh_TW) \
pimcommon-lang \
pimcommon-lang-all"
RDEPENDS:${PN} += "pimcommon"

inherit rpm
