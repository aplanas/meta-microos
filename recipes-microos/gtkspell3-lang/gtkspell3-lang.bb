SUMMARY = "Translations for package gtkspell3"
DESCRIPTION = "Provides translations for the 'gtkspell3' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.10"

RPM_NAME = "gtkspell3-lang-3.0.10-3.8.noarch.rpm"
RPM_HASH = "04e05fa8b6d5f3901b73e2e692871ac768a9875a41505312a537fa48f69825d8bd1eeb4958d5efbca6e41298554f4b4f3e91c031df923b9b63f103b7f1d37866"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkspell3-lang gtkspell3-lang-all locale(gtkspell3:af) locale(gtkspell3:ast) locale(gtkspell3:be) locale(gtkspell3:ca) locale(gtkspell3:cs) locale(gtkspell3:da) locale(gtkspell3:de) locale(gtkspell3:el) locale(gtkspell3:eo) locale(gtkspell3:es) locale(gtkspell3:eu) locale(gtkspell3:fi) locale(gtkspell3:fr) locale(gtkspell3:ga) locale(gtkspell3:gl) locale(gtkspell3:he) locale(gtkspell3:hr) locale(gtkspell3:hu) locale(gtkspell3:id) locale(gtkspell3:is) locale(gtkspell3:it) locale(gtkspell3:ja) locale(gtkspell3:lt) locale(gtkspell3:lv) locale(gtkspell3:ms) locale(gtkspell3:nb) locale(gtkspell3:nl) locale(gtkspell3:pl) locale(gtkspell3:pt) locale(gtkspell3:pt_BR) locale(gtkspell3:ro) locale(gtkspell3:ru) locale(gtkspell3:sk) locale(gtkspell3:sl) locale(gtkspell3:sq) locale(gtkspell3:sr) locale(gtkspell3:sv) locale(gtkspell3:th) locale(gtkspell3:tr) locale(gtkspell3:uk) locale(gtkspell3:vi) locale(gtkspell3:wa) locale(gtkspell3:zh_CN) locale(gtkspell3:zh_HK) locale(gtkspell3:zh_TW)"
RDEPENDS:${PN} += "gtkspell3"

inherit rpm
