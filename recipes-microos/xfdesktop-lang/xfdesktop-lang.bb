SUMMARY = "Translations for package xfdesktop"
DESCRIPTION = "Provides translations for the 'xfdesktop' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.1"

RPM_NAME = "xfdesktop-lang-4.18.1-1.3.noarch.rpm"
RPM_HASH = "0a881b76d6e5bff9c05919e1a5a9c6d2627470e5034a2988f3f1b368a45d6688cfac9873f97c75e131d9878494448ef1e9fe57c056860fb32d2938a02dca8691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfdesktop:ar) locale(xfdesktop:az) locale(xfdesktop:be) locale(xfdesktop:bg) locale(xfdesktop:bn) locale(xfdesktop:ca) locale(xfdesktop:cs) locale(xfdesktop:da) locale(xfdesktop:de) locale(xfdesktop:el) locale(xfdesktop:en_AU) locale(xfdesktop:en_CA) locale(xfdesktop:en_GB) locale(xfdesktop:eo) locale(xfdesktop:es) locale(xfdesktop:et) locale(xfdesktop:eu) locale(xfdesktop:fi) locale(xfdesktop:fr) locale(xfdesktop:gl) locale(xfdesktop:he) locale(xfdesktop:hr) locale(xfdesktop:hu) locale(xfdesktop:id) locale(xfdesktop:is) locale(xfdesktop:it) locale(xfdesktop:ja) locale(xfdesktop:ka) locale(xfdesktop:ko) locale(xfdesktop:lt) locale(xfdesktop:lv) locale(xfdesktop:ms) locale(xfdesktop:nb) locale(xfdesktop:ne) locale(xfdesktop:nl) locale(xfdesktop:nn) locale(xfdesktop:oc) locale(xfdesktop:pa) locale(xfdesktop:pl) locale(xfdesktop:pt) locale(xfdesktop:pt_BR) locale(xfdesktop:ro) locale(xfdesktop:ru) locale(xfdesktop:si) locale(xfdesktop:sk) locale(xfdesktop:sl) locale(xfdesktop:sq) locale(xfdesktop:sr) locale(xfdesktop:sv) locale(xfdesktop:te) locale(xfdesktop:th) locale(xfdesktop:tr) locale(xfdesktop:ug) locale(xfdesktop:uk) locale(xfdesktop:vi) locale(xfdesktop:zh_CN) locale(xfdesktop:zh_HK) locale(xfdesktop:zh_TW) xfdesktop-lang xfdesktop-lang-all"
RDEPENDS:${PN} += "xfdesktop"

inherit rpm
