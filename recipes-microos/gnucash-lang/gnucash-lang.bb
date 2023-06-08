SUMMARY = "Translations for package gnucash"
DESCRIPTION = "Provides translations for the 'gnucash' package."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception | SUSE-GPL-3.0-with-openssl-exception"

PV = "4.14"

RPM_NAME = "gnucash-lang-4.14-1.2.noarch.rpm"
RPM_HASH = "57b8ad3c63720f13ba308d6471e8ec35ff080413bc4c6f45ef71c7de5cbb27726c898546382c0df9b97402f4ad40b8b23979d820603f4d9c96edfe5dbc677bb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnucash-lang gnucash-lang-all locale(gnucash:ar) locale(gnucash:as) locale(gnucash:az) locale(gnucash:bg) locale(gnucash:ca) locale(gnucash:cs) locale(gnucash:da) locale(gnucash:de) locale(gnucash:el) locale(gnucash:en_AU) locale(gnucash:en_GB) locale(gnucash:en_NZ) locale(gnucash:es) locale(gnucash:es_NI) locale(gnucash:et) locale(gnucash:eu) locale(gnucash:fa) locale(gnucash:fi) locale(gnucash:fr) locale(gnucash:gu) locale(gnucash:he) locale(gnucash:hi) locale(gnucash:hr) locale(gnucash:hu) locale(gnucash:id) locale(gnucash:it) locale(gnucash:ja) locale(gnucash:kn) locale(gnucash:ko) locale(gnucash:lt) locale(gnucash:lv) locale(gnucash:mai) locale(gnucash:mk) locale(gnucash:mr) locale(gnucash:nb) locale(gnucash:ne) locale(gnucash:nl) locale(gnucash:pl) locale(gnucash:pt) locale(gnucash:pt_BR) locale(gnucash:ro) locale(gnucash:ru) locale(gnucash:sk) locale(gnucash:sr) locale(gnucash:sv) locale(gnucash:ta) locale(gnucash:te) locale(gnucash:tr) locale(gnucash:uk) locale(gnucash:vi) locale(gnucash:zh_CN) locale(gnucash:zh_TW)"
RDEPENDS:${PN} += "gnucash"

inherit rpm
