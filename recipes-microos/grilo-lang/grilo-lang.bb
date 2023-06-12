SUMMARY = "Translations for package grilo"
DESCRIPTION = "Provides translations for the 'grilo' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.16"

RPM_NAME = "grilo-lang-0.3.16-1.1.noarch.rpm"
RPM_HASH = "1e4df446c7904d718659ef2f684318e1bfae742001c850c7f6cbf0f874df5b592b15f81e294a11c7c9d7ec51ed0e586927e55a1c437df813f71c5c0b04c0c6db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grilo-lang grilo-lang-all locale(grilo:as) locale(grilo:be) locale(grilo:bg) locale(grilo:bs) locale(grilo:ca) locale(grilo:ca@valencia) locale(grilo:cs) locale(grilo:da) locale(grilo:de) locale(grilo:el) locale(grilo:en_GB) locale(grilo:eo) locale(grilo:es) locale(grilo:eu) locale(grilo:fa) locale(grilo:fi) locale(grilo:fr) locale(grilo:fur) locale(grilo:gl) locale(grilo:he) locale(grilo:hr) locale(grilo:hu) locale(grilo:id) locale(grilo:it) locale(grilo:ja) locale(grilo:ka) locale(grilo:ko) locale(grilo:lt) locale(grilo:lv) locale(grilo:ml) locale(grilo:ms) locale(grilo:nb) locale(grilo:ne) locale(grilo:nl) locale(grilo:oc) locale(grilo:pa) locale(grilo:pl) locale(grilo:pt) locale(grilo:pt_BR) locale(grilo:ro) locale(grilo:ru) locale(grilo:sk) locale(grilo:sl) locale(grilo:sr) locale(grilo:sr@latin) locale(grilo:sv) locale(grilo:tr) locale(grilo:uk) locale(grilo:zh_CN) locale(grilo:zh_HK) locale(grilo:zh_TW)"
RDEPENDS:${PN} += "grilo"

inherit rpm
