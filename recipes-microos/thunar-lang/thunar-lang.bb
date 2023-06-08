SUMMARY = "Translations for package thunar"
DESCRIPTION = "Provides translations for the 'thunar' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.6"

RPM_NAME = "thunar-lang-4.18.6-1.1.noarch.rpm"
RPM_HASH = "4cff9c1c1c945bb67951429e490c2180f48f78fc2a301f2332b154f1ad5a790e6ca871e0e0c4c4e6b5315de247fa7b291b5b7ea3a4ba9747f750d657d55fb164"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(thunar:ar) locale(thunar:ast) locale(thunar:be) locale(thunar:bg) locale(thunar:bn) locale(thunar:ca) locale(thunar:cs) locale(thunar:da) locale(thunar:de) locale(thunar:el) locale(thunar:en_AU) locale(thunar:en_GB) locale(thunar:eo) locale(thunar:es) locale(thunar:et) locale(thunar:eu) locale(thunar:fi) locale(thunar:fr) locale(thunar:gl) locale(thunar:he) locale(thunar:hr) locale(thunar:hu) locale(thunar:id) locale(thunar:is) locale(thunar:it) locale(thunar:ja) locale(thunar:kk) locale(thunar:ko) locale(thunar:lt) locale(thunar:lv) locale(thunar:ms) locale(thunar:nb) locale(thunar:nl) locale(thunar:nn) locale(thunar:oc) locale(thunar:pa) locale(thunar:pl) locale(thunar:pt) locale(thunar:pt_BR) locale(thunar:ro) locale(thunar:ru) locale(thunar:si) locale(thunar:sk) locale(thunar:sl) locale(thunar:sq) locale(thunar:sr) locale(thunar:sv) locale(thunar:te) locale(thunar:th) locale(thunar:tr) locale(thunar:ug) locale(thunar:uk) locale(thunar:vi) locale(thunar:zh_CN) locale(thunar:zh_HK) locale(thunar:zh_TW) thunar-lang thunar-lang-all"
RDEPENDS:${PN} += "thunar"

inherit rpm
