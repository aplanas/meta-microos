SUMMARY = "Translations for package scim-tables"
DESCRIPTION = "Provides translations for the 'scim-tables' package."
LICENSE = "GPL-2.0+"

PV = "0.5.14.1"

RPM_NAME = "scim-tables-lang-0.5.14.1-2.31.noarch.rpm"
RPM_HASH = "099941248a90b3dc7d5a95dff3b53ba0c3c94f70b94d26b1009bb0bd286dd0605ce6dbb29bb935666ec736ab3e4a3261d6d860834a7dfcd80b4f84824127fce5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(scim-tables:de) locale(scim-tables:fr) locale(scim-tables:it) locale(scim-tables:ja) locale(scim-tables:ko) locale(scim-tables:nl) locale(scim-tables:pa) locale(scim-tables:zh_CN) locale(scim-tables:zh_TW) scim-tables-lang scim-tables-lang-all"
RDEPENDS:${PN} += "scim-tables"

inherit rpm
