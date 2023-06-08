SUMMARY = "Translations for package grilo"
DESCRIPTION = "Provides translations for the 'grilo' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.15"

RPM_NAME = "grilo-lang-0.3.15-2.1.noarch.rpm"
RPM_HASH = "4068b4b2f756ee7be78023814a383d34367ef256bc571997ccce25af11098825487477503877bdf4b52dcbb5c932e3ae76ca8a780b7bed3a07f9a4e8fd9e542e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grilo-lang grilo-lang-all locale(grilo:as) locale(grilo:be) locale(grilo:bg) locale(grilo:bs) locale(grilo:ca) locale(grilo:ca@valencia) locale(grilo:cs) locale(grilo:da) locale(grilo:de) locale(grilo:el) locale(grilo:en_GB) locale(grilo:eo) locale(grilo:es) locale(grilo:eu) locale(grilo:fa) locale(grilo:fi) locale(grilo:fr) locale(grilo:fur) locale(grilo:gl) locale(grilo:he) locale(grilo:hr) locale(grilo:hu) locale(grilo:id) locale(grilo:it) locale(grilo:ja) locale(grilo:ka) locale(grilo:ko) locale(grilo:lt) locale(grilo:lv) locale(grilo:ml) locale(grilo:ms) locale(grilo:nb) locale(grilo:ne) locale(grilo:nl) locale(grilo:oc) locale(grilo:pa) locale(grilo:pl) locale(grilo:pt) locale(grilo:pt_BR) locale(grilo:ro) locale(grilo:ru) locale(grilo:sk) locale(grilo:sl) locale(grilo:sr) locale(grilo:sr@latin) locale(grilo:sv) locale(grilo:tr) locale(grilo:uk) locale(grilo:zh_CN) locale(grilo:zh_HK) locale(grilo:zh_TW)"
RDEPENDS:${PN} += "grilo"

inherit rpm
