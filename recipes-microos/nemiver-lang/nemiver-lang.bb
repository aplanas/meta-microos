SUMMARY = "Translations for package nemiver"
DESCRIPTION = "Provides translations for the 'nemiver' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.6"

RPM_NAME = "nemiver-lang-0.9.6-9.8.noarch.rpm"
RPM_HASH = "7f284debc8b7013472eaa558d58d405f28bd18e63435d0ab4663285ba3c973e3e0e4d5a65eb4c9f44c70ebbee5699581dafa50ca5da97e7e964b23d2017e96bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(nemiver:ar) locale(nemiver:as) locale(nemiver:bs) locale(nemiver:ca) locale(nemiver:ca@valencia) locale(nemiver:cs) locale(nemiver:da) locale(nemiver:de) locale(nemiver:dz) locale(nemiver:el) locale(nemiver:en_GB) locale(nemiver:eo) locale(nemiver:es) locale(nemiver:eu) locale(nemiver:fi) locale(nemiver:fr) locale(nemiver:gl) locale(nemiver:hi) locale(nemiver:hu) locale(nemiver:id) locale(nemiver:it) locale(nemiver:ja) locale(nemiver:ko) locale(nemiver:lt) locale(nemiver:lv) locale(nemiver:ml) locale(nemiver:nb) locale(nemiver:nl) locale(nemiver:oc) locale(nemiver:pl) locale(nemiver:pt) locale(nemiver:pt_BR) locale(nemiver:ro) locale(nemiver:ru) locale(nemiver:sk) locale(nemiver:sl) locale(nemiver:sr) locale(nemiver:sr@latin) locale(nemiver:sv) locale(nemiver:th) locale(nemiver:tr) locale(nemiver:ug) locale(nemiver:zh_CN) locale(nemiver:zh_HK) locale(nemiver:zh_TW) nemiver-lang nemiver-lang-all"
RDEPENDS:${PN} += "nemiver"

inherit rpm
