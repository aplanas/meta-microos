SUMMARY = "Translations for package xfce4-dict"
DESCRIPTION = "Provides translations for the 'xfce4-dict' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.5"

RPM_NAME = "xfce4-dict-lang-0.8.5-1.1.noarch.rpm"
RPM_HASH = "a04b57bf2256fa7a12eb13fafcbdbc36fad1653ffdf40c4a7cdcc69ae82fecc1f8ac7a5c1310591349d2ea685a1001df5d946153198b95e2df8561d345fa004c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-dict:ar) \
locale(xfce4-dict:be) \
locale(xfce4-dict:bg) \
locale(xfce4-dict:ca) \
locale(xfce4-dict:cs) \
locale(xfce4-dict:da) \
locale(xfce4-dict:de) \
locale(xfce4-dict:el) \
locale(xfce4-dict:en_AU) \
locale(xfce4-dict:en_GB) \
locale(xfce4-dict:es) \
locale(xfce4-dict:et) \
locale(xfce4-dict:eu) \
locale(xfce4-dict:fi) \
locale(xfce4-dict:fr) \
locale(xfce4-dict:gl) \
locale(xfce4-dict:he) \
locale(xfce4-dict:hr) \
locale(xfce4-dict:hu) \
locale(xfce4-dict:id) \
locale(xfce4-dict:is) \
locale(xfce4-dict:it) \
locale(xfce4-dict:ja) \
locale(xfce4-dict:ko) \
locale(xfce4-dict:lt) \
locale(xfce4-dict:lv) \
locale(xfce4-dict:ms) \
locale(xfce4-dict:nb) \
locale(xfce4-dict:nl) \
locale(xfce4-dict:oc) \
locale(xfce4-dict:pl) \
locale(xfce4-dict:pt) \
locale(xfce4-dict:pt_BR) \
locale(xfce4-dict:ru) \
locale(xfce4-dict:sk) \
locale(xfce4-dict:sl) \
locale(xfce4-dict:sq) \
locale(xfce4-dict:sr) \
locale(xfce4-dict:sv) \
locale(xfce4-dict:th) \
locale(xfce4-dict:tr) \
locale(xfce4-dict:ug) \
locale(xfce4-dict:uk) \
locale(xfce4-dict:vi) \
locale(xfce4-dict:zh_CN) \
locale(xfce4-dict:zh_TW) \
xfce4-dict-lang \
xfce4-dict-lang-all"
RDEPENDS:${PN} += "xfce4-dict"

inherit rpm
