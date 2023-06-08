SUMMARY = "Translations for package scim"
DESCRIPTION = "Provides translations for the 'scim' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.18"

RPM_NAME = "scim-lang-1.4.18-5.10.noarch.rpm"
RPM_HASH = "1b823db58f5a26b6d93e5a30df0855af2671a65bb1e20657e8a3193233f7c90f86ae5b259c73f1d2b695c5da53e6a627469f6bd42b0e01c69043cfab2d181a76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(scim:as) locale(scim:bn_IN) locale(scim:ca) locale(scim:cs) locale(scim:de) locale(scim:es) locale(scim:fi) locale(scim:fr) locale(scim:gu) locale(scim:hi) locale(scim:it) locale(scim:ja) locale(scim:kn) locale(scim:ko) locale(scim:ml) locale(scim:mr) locale(scim:nl) locale(scim:pa) locale(scim:pt_BR) locale(scim:ru) locale(scim:sk) locale(scim:sv) locale(scim:ta) locale(scim:te) locale(scim:vi) locale(scim:zh_CN) locale(scim:zh_TW) scim-lang scim-lang-all"
RDEPENDS:${PN} += "scim"

inherit rpm
