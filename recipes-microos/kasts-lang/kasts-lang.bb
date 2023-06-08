SUMMARY = "Translations for package kasts"
DESCRIPTION = "Provides translations for the 'kasts' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kasts-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "6f20b6b44805e2a3e6e6d071ca474fef978811f5a78ab5c284c9006fc7021f63905c8d86f4595cb106faae49d639c2ed9ddf845c0b825cc13cfe43fab8afc5ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kasts-lang kasts-lang-all locale(kasts:ca) locale(kasts:ca@valencia) locale(kasts:cs) locale(kasts:de) locale(kasts:en_GB) locale(kasts:es) locale(kasts:fi) locale(kasts:fr) locale(kasts:it) locale(kasts:ja) locale(kasts:ka) locale(kasts:ko) locale(kasts:lt) locale(kasts:nl) locale(kasts:pa) locale(kasts:pl) locale(kasts:pt) locale(kasts:pt_BR) locale(kasts:sk) locale(kasts:sl) locale(kasts:sv) locale(kasts:tr) locale(kasts:uk) locale(kasts:zh_CN) locale(kasts:zh_TW)"
RDEPENDS:${PN} += "kasts"

inherit rpm
