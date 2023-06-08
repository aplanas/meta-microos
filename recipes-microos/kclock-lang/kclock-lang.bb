SUMMARY = "Translations for package kclock"
DESCRIPTION = "Provides translations for the 'kclock' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kclock-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "4a90b24e54f477036276e81afb40d39d3c262dfe22f5fc6467f1bb1776cbcd684a2f32ff13fa76c15950183ca782c018f34a6749957445cdd9bfddb5a4eb599b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kclock-lang kclock-lang-all locale(kclock:ar) locale(kclock:ca) locale(kclock:ca@valencia) locale(kclock:cs) locale(kclock:de) locale(kclock:el) locale(kclock:en_GB) locale(kclock:es) locale(kclock:eu) locale(kclock:fi) locale(kclock:fr) locale(kclock:hi) locale(kclock:hu) locale(kclock:it) locale(kclock:ja) locale(kclock:ka) locale(kclock:ko) locale(kclock:lt) locale(kclock:nl) locale(kclock:nn) locale(kclock:pa) locale(kclock:pl) locale(kclock:pt) locale(kclock:pt_BR) locale(kclock:ro) locale(kclock:ru) locale(kclock:sk) locale(kclock:sl) locale(kclock:sv) locale(kclock:tr) locale(kclock:uk) locale(kclock:zh_CN) locale(kclock:zh_TW)"
RDEPENDS:${PN} += "kclock"

inherit rpm
