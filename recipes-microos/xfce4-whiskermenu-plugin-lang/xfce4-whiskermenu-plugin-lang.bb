SUMMARY = "Translations for package xfce4-whiskermenu-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-whiskermenu-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.3"

RPM_NAME = "xfce4-whiskermenu-plugin-lang-2.7.3-1.1.noarch.rpm"
RPM_HASH = "2c6bd073cb6b08120c83aa754f6c25ff3ec7517b2f41427cd2f56d6ce246f5b267580db1bcda9c592acd000e9fb5215e70074288b58cbd78339a5d4e1445d7d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-whiskermenu-plugin:ar) \
locale(xfce4-whiskermenu-plugin:ast) \
locale(xfce4-whiskermenu-plugin:be) \
locale(xfce4-whiskermenu-plugin:bg) \
locale(xfce4-whiskermenu-plugin:ca) \
locale(xfce4-whiskermenu-plugin:ca@valencia) \
locale(xfce4-whiskermenu-plugin:cs) \
locale(xfce4-whiskermenu-plugin:cy) \
locale(xfce4-whiskermenu-plugin:da) \
locale(xfce4-whiskermenu-plugin:de) \
locale(xfce4-whiskermenu-plugin:el) \
locale(xfce4-whiskermenu-plugin:en_GB) \
locale(xfce4-whiskermenu-plugin:eo) \
locale(xfce4-whiskermenu-plugin:es) \
locale(xfce4-whiskermenu-plugin:et) \
locale(xfce4-whiskermenu-plugin:eu) \
locale(xfce4-whiskermenu-plugin:fa) \
locale(xfce4-whiskermenu-plugin:fi) \
locale(xfce4-whiskermenu-plugin:fr) \
locale(xfce4-whiskermenu-plugin:gl) \
locale(xfce4-whiskermenu-plugin:he) \
locale(xfce4-whiskermenu-plugin:hr) \
locale(xfce4-whiskermenu-plugin:hu) \
locale(xfce4-whiskermenu-plugin:id) \
locale(xfce4-whiskermenu-plugin:is) \
locale(xfce4-whiskermenu-plugin:it) \
locale(xfce4-whiskermenu-plugin:ja) \
locale(xfce4-whiskermenu-plugin:ka) \
locale(xfce4-whiskermenu-plugin:kk) \
locale(xfce4-whiskermenu-plugin:ko) \
locale(xfce4-whiskermenu-plugin:lt) \
locale(xfce4-whiskermenu-plugin:lv) \
locale(xfce4-whiskermenu-plugin:ms) \
locale(xfce4-whiskermenu-plugin:nb) \
locale(xfce4-whiskermenu-plugin:ne) \
locale(xfce4-whiskermenu-plugin:nl) \
locale(xfce4-whiskermenu-plugin:pl) \
locale(xfce4-whiskermenu-plugin:pt) \
locale(xfce4-whiskermenu-plugin:pt_BR) \
locale(xfce4-whiskermenu-plugin:ro) \
locale(xfce4-whiskermenu-plugin:ru) \
locale(xfce4-whiskermenu-plugin:sk) \
locale(xfce4-whiskermenu-plugin:sl) \
locale(xfce4-whiskermenu-plugin:sr) \
locale(xfce4-whiskermenu-plugin:sr@latin) \
locale(xfce4-whiskermenu-plugin:sv) \
locale(xfce4-whiskermenu-plugin:th) \
locale(xfce4-whiskermenu-plugin:tr) \
locale(xfce4-whiskermenu-plugin:uk) \
locale(xfce4-whiskermenu-plugin:vi) \
locale(xfce4-whiskermenu-plugin:zh_CN) \
locale(xfce4-whiskermenu-plugin:zh_TW) \
xfce4-panel-plugin-whiskermenu-lang \
xfce4-whiskermenu-plugin-lang \
xfce4-whiskermenu-plugin-lang-all"
RDEPENDS:${PN} += "xfce4-whiskermenu-plugin"

inherit rpm
