SUMMARY = "Translations for package plasma-vault"
DESCRIPTION = "Provides translations for the 'plasma-vault' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "plasma-vault-lang-5.27.4-1.1.noarch.rpm"
RPM_HASH = "cae5d8d0a6ebc7e82b98c1c72fd66902054b1807638e85ec1b18d8f445754cfd26cb59309bfabccbaf32e64faf332b06466dd5438e1a75b8dfa5f1b26fe9a022"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(plasma-vault:ar) locale(plasma-vault:az) locale(plasma-vault:bg) locale(plasma-vault:ca) locale(plasma-vault:ca@valencia) locale(plasma-vault:cs) locale(plasma-vault:da) locale(plasma-vault:de) locale(plasma-vault:el) locale(plasma-vault:en_GB) locale(plasma-vault:es) locale(plasma-vault:et) locale(plasma-vault:eu) locale(plasma-vault:fi) locale(plasma-vault:fr) locale(plasma-vault:gl) locale(plasma-vault:hu) locale(plasma-vault:ia) locale(plasma-vault:id) locale(plasma-vault:it) locale(plasma-vault:ja) locale(plasma-vault:ka) locale(plasma-vault:ko) locale(plasma-vault:lt) locale(plasma-vault:nl) locale(plasma-vault:nn) locale(plasma-vault:pa) locale(plasma-vault:pl) locale(plasma-vault:pt) locale(plasma-vault:pt_BR) locale(plasma-vault:ro) locale(plasma-vault:ru) locale(plasma-vault:sk) locale(plasma-vault:sl) locale(plasma-vault:sr) locale(plasma-vault:sr@ijekavian) locale(plasma-vault:sr@ijekavianlatin) locale(plasma-vault:sr@latin) locale(plasma-vault:sv) locale(plasma-vault:tr) locale(plasma-vault:uk) locale(plasma-vault:zh_CN) locale(plasma-vault:zh_TW) plasma-vault-lang plasma-vault-lang-all"
RDEPENDS:${PN} += "plasma-vault"

inherit rpm
