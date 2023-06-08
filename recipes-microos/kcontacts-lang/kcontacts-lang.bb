SUMMARY = "Translations for package kcontacts"
DESCRIPTION = "Provides translations for the 'kcontacts' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kcontacts-lang-5.105.0-1.1.noarch.rpm"
RPM_HASH = "124daaae50455aa0ab1e4c35c76dd64f0bb6ff1a7ee9901b0aedcf2cbfd0586532dcb653f6927c8f71b9bd66fc5c774d05dba8b0c2b65c51463fa145599e1be6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcontacts-lang kcontacts-lang-all locale(kcontacts:ar) locale(kcontacts:az) locale(kcontacts:be) locale(kcontacts:bg) locale(kcontacts:bs) locale(kcontacts:ca) locale(kcontacts:ca@valencia) locale(kcontacts:cs) locale(kcontacts:da) locale(kcontacts:de) locale(kcontacts:el) locale(kcontacts:en_GB) locale(kcontacts:eo) locale(kcontacts:es) locale(kcontacts:et) locale(kcontacts:eu) locale(kcontacts:fi) locale(kcontacts:fr) locale(kcontacts:ga) locale(kcontacts:gl) locale(kcontacts:hi) locale(kcontacts:hu) locale(kcontacts:ia) locale(kcontacts:id) locale(kcontacts:it) locale(kcontacts:ja) locale(kcontacts:ka) locale(kcontacts:kk) locale(kcontacts:km) locale(kcontacts:ko) locale(kcontacts:lt) locale(kcontacts:lv) locale(kcontacts:mai) locale(kcontacts:ml) locale(kcontacts:mr) locale(kcontacts:nb) locale(kcontacts:nds) locale(kcontacts:nl) locale(kcontacts:nn) locale(kcontacts:pa) locale(kcontacts:pl) locale(kcontacts:pt) locale(kcontacts:pt_BR) locale(kcontacts:ro) locale(kcontacts:ru) locale(kcontacts:sk) locale(kcontacts:sl) locale(kcontacts:sq) locale(kcontacts:sr) locale(kcontacts:sr@ijekavian) locale(kcontacts:sr@ijekavianlatin) locale(kcontacts:sr@latin) locale(kcontacts:sv) locale(kcontacts:th) locale(kcontacts:tr) locale(kcontacts:ug) locale(kcontacts:uk) locale(kcontacts:zh_CN) locale(kcontacts:zh_TW)"
RDEPENDS:${PN} += "kcontacts"

inherit rpm
