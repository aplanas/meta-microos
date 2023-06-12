SUMMARY = "Translations for package polkit-kde-agent-5"
DESCRIPTION = "Provides translations for the 'polkit-kde-agent-5' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "5.27.5"

RPM_NAME = "polkit-kde-agent-5-lang-5.27.5-1.2.noarch.rpm"
RPM_HASH = "beecaf9023673eacbb5f9d94e06245b610f0cd93d7fe92f6db450cc16de2f251a5775dcee02f25e13e1edc60258895a77ddf83494fda811ce74d89d22ac6b231"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(polkit-kde-agent-5:ar) locale(polkit-kde-agent-5:be) locale(polkit-kde-agent-5:bg) locale(polkit-kde-agent-5:bs) locale(polkit-kde-agent-5:ca) locale(polkit-kde-agent-5:ca@valencia) locale(polkit-kde-agent-5:cs) locale(polkit-kde-agent-5:da) locale(polkit-kde-agent-5:de) locale(polkit-kde-agent-5:el) locale(polkit-kde-agent-5:en_GB) locale(polkit-kde-agent-5:eo) locale(polkit-kde-agent-5:es) locale(polkit-kde-agent-5:et) locale(polkit-kde-agent-5:eu) locale(polkit-kde-agent-5:fi) locale(polkit-kde-agent-5:fr) locale(polkit-kde-agent-5:ga) locale(polkit-kde-agent-5:gl) locale(polkit-kde-agent-5:he) locale(polkit-kde-agent-5:hr) locale(polkit-kde-agent-5:hu) locale(polkit-kde-agent-5:ia) locale(polkit-kde-agent-5:id) locale(polkit-kde-agent-5:is) locale(polkit-kde-agent-5:it) locale(polkit-kde-agent-5:ja) locale(polkit-kde-agent-5:ka) locale(polkit-kde-agent-5:kk) locale(polkit-kde-agent-5:km) locale(polkit-kde-agent-5:ko) locale(polkit-kde-agent-5:lt) locale(polkit-kde-agent-5:mai) locale(polkit-kde-agent-5:ml) locale(polkit-kde-agent-5:mr) locale(polkit-kde-agent-5:ms) locale(polkit-kde-agent-5:nb) locale(polkit-kde-agent-5:nds) locale(polkit-kde-agent-5:nl) locale(polkit-kde-agent-5:nn) locale(polkit-kde-agent-5:pa) locale(polkit-kde-agent-5:pl) locale(polkit-kde-agent-5:pt) locale(polkit-kde-agent-5:pt_BR) locale(polkit-kde-agent-5:ro) locale(polkit-kde-agent-5:ru) locale(polkit-kde-agent-5:sk) locale(polkit-kde-agent-5:sl) locale(polkit-kde-agent-5:sr) locale(polkit-kde-agent-5:sr@ijekavian) locale(polkit-kde-agent-5:sr@ijekavianlatin) locale(polkit-kde-agent-5:sr@latin) locale(polkit-kde-agent-5:sv) locale(polkit-kde-agent-5:th) locale(polkit-kde-agent-5:tr) locale(polkit-kde-agent-5:ug) locale(polkit-kde-agent-5:uk) locale(polkit-kde-agent-5:vi) locale(polkit-kde-agent-5:zh_CN) locale(polkit-kde-agent-5:zh_TW) polkit-kde-agent-5-lang polkit-kde-agent-5-lang-all"
RDEPENDS:${PN} += "polkit-kde-agent-5"

inherit rpm
