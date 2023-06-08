SUMMARY = "Translations for package transmageddon"
DESCRIPTION = "Provides translations for the 'transmageddon' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "transmageddon-lang-1.5-5.6.noarch.rpm"
RPM_HASH = "5df692219fd3476c9f71f64f4fe14ad23c905339bcfd1f1889b61d7c54cb91d0a471f3c5fd36fc0d55423be6fb172bd70a3b88d3c5db4ac3e4fb7784c9c54d2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(transmageddon:ca) locale(transmageddon:cs) locale(transmageddon:da) locale(transmageddon:de) locale(transmageddon:el) locale(transmageddon:en_GB) locale(transmageddon:eo) locale(transmageddon:es) locale(transmageddon:fi) locale(transmageddon:fr) locale(transmageddon:gd) locale(transmageddon:gl) locale(transmageddon:he) locale(transmageddon:hu) locale(transmageddon:id) locale(transmageddon:it) locale(transmageddon:lt) locale(transmageddon:lv) locale(transmageddon:nb) locale(transmageddon:pl) locale(transmageddon:pt) locale(transmageddon:pt_BR) locale(transmageddon:ro) locale(transmageddon:ru) locale(transmageddon:sk) locale(transmageddon:sl) locale(transmageddon:sr) locale(transmageddon:sr@latin) locale(transmageddon:sv) locale(transmageddon:th) locale(transmageddon:tr) locale(transmageddon:uk) locale(transmageddon:zh_CN) transmageddon-lang transmageddon-lang-all"
RDEPENDS:${PN} += "transmageddon"

inherit rpm
