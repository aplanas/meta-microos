SUMMARY = "Translations for package gtksourceview5"
DESCRIPTION = "Provides translations for the 'gtksourceview5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.8.0"

RPM_NAME = "gtksourceview5-lang-5.8.0-1.1.noarch.rpm"
RPM_HASH = "48df3b25356e8d09d98ad25ba2dde905a470bfa414a653c31d05de5ca815d1a9624c528983ccfd85815c281e7df911ce46b6c85c00b5843ee4975c9fc467ab1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtksourceview5-lang gtksourceview5-lang-all locale(gtksourceview5:ar) locale(gtksourceview5:as) locale(gtksourceview5:ast) locale(gtksourceview5:az) locale(gtksourceview5:be) locale(gtksourceview5:bg) locale(gtksourceview5:bn) locale(gtksourceview5:bn_IN) locale(gtksourceview5:bs) locale(gtksourceview5:ca) locale(gtksourceview5:ca@valencia) locale(gtksourceview5:cs) locale(gtksourceview5:cy) locale(gtksourceview5:da) locale(gtksourceview5:de) locale(gtksourceview5:dz) locale(gtksourceview5:el) locale(gtksourceview5:en@shaw) locale(gtksourceview5:en_CA) locale(gtksourceview5:en_GB) locale(gtksourceview5:eo) locale(gtksourceview5:es) locale(gtksourceview5:et) locale(gtksourceview5:eu) locale(gtksourceview5:fa) locale(gtksourceview5:fi) locale(gtksourceview5:fr) locale(gtksourceview5:fur) locale(gtksourceview5:ga) locale(gtksourceview5:gl) locale(gtksourceview5:gu) locale(gtksourceview5:he) locale(gtksourceview5:hi) locale(gtksourceview5:hr) locale(gtksourceview5:hu) locale(gtksourceview5:id) locale(gtksourceview5:is) locale(gtksourceview5:it) locale(gtksourceview5:ja) locale(gtksourceview5:ka) locale(gtksourceview5:kk) locale(gtksourceview5:kn) locale(gtksourceview5:ko) locale(gtksourceview5:lt) locale(gtksourceview5:lv) locale(gtksourceview5:mai) locale(gtksourceview5:mk) locale(gtksourceview5:ml) locale(gtksourceview5:mr) locale(gtksourceview5:ms) locale(gtksourceview5:nb) locale(gtksourceview5:ne) locale(gtksourceview5:nl) locale(gtksourceview5:nn) locale(gtksourceview5:oc) locale(gtksourceview5:or) locale(gtksourceview5:pa) locale(gtksourceview5:pl) locale(gtksourceview5:pt) locale(gtksourceview5:pt_BR) locale(gtksourceview5:ro) locale(gtksourceview5:ru) locale(gtksourceview5:si) locale(gtksourceview5:sk) locale(gtksourceview5:sl) locale(gtksourceview5:sq) locale(gtksourceview5:sr) locale(gtksourceview5:sr@latin) locale(gtksourceview5:sv) locale(gtksourceview5:ta) locale(gtksourceview5:te) locale(gtksourceview5:th) locale(gtksourceview5:tr) locale(gtksourceview5:ug) locale(gtksourceview5:uk) locale(gtksourceview5:vi) locale(gtksourceview5:zh_CN) locale(gtksourceview5:zh_HK) locale(gtksourceview5:zh_TW)"
RDEPENDS:${PN} += "gtksourceview5"

inherit rpm
