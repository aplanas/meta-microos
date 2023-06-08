SUMMARY = "Translations for package gtkspell"
DESCRIPTION = "Provides translations for the 'gtkspell' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.16"

RPM_NAME = "gtkspell-lang-2.0.16-23.9.noarch.rpm"
RPM_HASH = "9d1e99d75c5bfcad44934752ee002c36e466ca98cbb64bb358b4d05d9f98413659c6002387addb980d4fbc9cec42293a90fcfd22027c9607c2abe5d6cf8ed272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkspell-lang gtkspell-lang-all locale(gtkspell:af) locale(gtkspell:be) locale(gtkspell:cs) locale(gtkspell:da) locale(gtkspell:de) locale(gtkspell:el) locale(gtkspell:eo) locale(gtkspell:es) locale(gtkspell:eu) locale(gtkspell:fi) locale(gtkspell:fr) locale(gtkspell:ga) locale(gtkspell:gl) locale(gtkspell:hu) locale(gtkspell:id) locale(gtkspell:it) locale(gtkspell:ja) locale(gtkspell:lt) locale(gtkspell:lv) locale(gtkspell:ms) locale(gtkspell:nb) locale(gtkspell:nl) locale(gtkspell:pl) locale(gtkspell:pt) locale(gtkspell:pt_BR) locale(gtkspell:ro) locale(gtkspell:ru) locale(gtkspell:sk) locale(gtkspell:sl) locale(gtkspell:sq) locale(gtkspell:sr) locale(gtkspell:sv) locale(gtkspell:th) locale(gtkspell:tr) locale(gtkspell:uk) locale(gtkspell:vi) locale(gtkspell:wa) locale(gtkspell:zh_CN) locale(gtkspell:zh_HK) locale(gtkspell:zh_TW)"
RDEPENDS:${PN} += "gtkspell"

inherit rpm
