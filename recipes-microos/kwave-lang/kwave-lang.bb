SUMMARY = "Translations for package kwave"
DESCRIPTION = "Provides translations for the 'kwave' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kwave-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "2645135471b8c480ee47da01cd2e1f504cb759bd2c2d5225595323b0388a4ab6906538ab37db5634411efe689f4cc4c4fc033a42777b2da8d797c353b6cfe917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kwave-lang kwave-lang-all locale(kwave:bs) locale(kwave:ca) locale(kwave:ca@valencia) locale(kwave:cs) locale(kwave:da) locale(kwave:de) locale(kwave:el) locale(kwave:en_GB) locale(kwave:es) locale(kwave:et) locale(kwave:eu) locale(kwave:fi) locale(kwave:fr) locale(kwave:gl) locale(kwave:ia) locale(kwave:it) locale(kwave:ja) locale(kwave:ka) locale(kwave:ko) locale(kwave:lt) locale(kwave:nl) locale(kwave:pl) locale(kwave:pt) locale(kwave:pt_BR) locale(kwave:ru) locale(kwave:sk) locale(kwave:sl) locale(kwave:sv) locale(kwave:tr) locale(kwave:uk) locale(kwave:zh_CN) locale(kwave:zh_TW)"
RDEPENDS:${PN} += "kwave"

inherit rpm
