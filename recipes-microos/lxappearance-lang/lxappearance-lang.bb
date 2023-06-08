SUMMARY = "Translations for package lxappearance"
DESCRIPTION = "Provides translations for the 'lxappearance' package."
LICENSE = "GPL-2.0-only"

PV = "0.6.3"

RPM_NAME = "lxappearance-lang-0.6.3-1.14.noarch.rpm"
RPM_HASH = "d24db7af15c8100be81e7877821736f089f9ad5a6c1316327fce8025752482404cf96e27f1ded036e65a7de90793801213e1abc3d2ece33450d15f0690155755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(lxappearance:ar) locale(lxappearance:be) locale(lxappearance:bg) locale(lxappearance:ca) locale(lxappearance:cs) locale(lxappearance:da) locale(lxappearance:de) locale(lxappearance:el) locale(lxappearance:en_GB) locale(lxappearance:es) locale(lxappearance:et) locale(lxappearance:eu) locale(lxappearance:fa) locale(lxappearance:fi) locale(lxappearance:fr) locale(lxappearance:gl) locale(lxappearance:he) locale(lxappearance:hr) locale(lxappearance:hu) locale(lxappearance:id) locale(lxappearance:is) locale(lxappearance:it) locale(lxappearance:ja) locale(lxappearance:kk) locale(lxappearance:ko) locale(lxappearance:lt) locale(lxappearance:nl) locale(lxappearance:pa) locale(lxappearance:pl) locale(lxappearance:pt) locale(lxappearance:pt_BR) locale(lxappearance:ro) locale(lxappearance:ru) locale(lxappearance:sl) locale(lxappearance:sr) locale(lxappearance:sr@latin) locale(lxappearance:sv) locale(lxappearance:te) locale(lxappearance:tr) locale(lxappearance:ug) locale(lxappearance:uk) locale(lxappearance:vi) locale(lxappearance:zh_CN) locale(lxappearance:zh_TW) lxappearance-lang lxappearance-lang-all"
RDEPENDS:${PN} += "lxappearance"

inherit rpm
