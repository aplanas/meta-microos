SUMMARY = "Translations for package xfce4-genmon-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-genmon-plugin' package."
LICENSE = "LGPL-2.1-or-later"

PV = "4.2.0"

RPM_NAME = "xfce4-genmon-plugin-lang-4.2.0-1.1.noarch.rpm"
RPM_HASH = "66c4f34df4458dd3ddcd2ee45565789ed7feb66ebe0e3f02dfc94cfb2e0a235ac4e1b719aee4db50b9651f029b4ba446d461f28c43da2eac2a10d5a34e058760"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-genmon-plugin:ar) \
locale(xfce4-genmon-plugin:be) \
locale(xfce4-genmon-plugin:bg) \
locale(xfce4-genmon-plugin:ca) \
locale(xfce4-genmon-plugin:cs) \
locale(xfce4-genmon-plugin:da) \
locale(xfce4-genmon-plugin:de) \
locale(xfce4-genmon-plugin:el) \
locale(xfce4-genmon-plugin:en_AU) \
locale(xfce4-genmon-plugin:en_CA) \
locale(xfce4-genmon-plugin:en_GB) \
locale(xfce4-genmon-plugin:es) \
locale(xfce4-genmon-plugin:et) \
locale(xfce4-genmon-plugin:eu) \
locale(xfce4-genmon-plugin:fi) \
locale(xfce4-genmon-plugin:fr) \
locale(xfce4-genmon-plugin:gl) \
locale(xfce4-genmon-plugin:he) \
locale(xfce4-genmon-plugin:hi) \
locale(xfce4-genmon-plugin:hr) \
locale(xfce4-genmon-plugin:hu) \
locale(xfce4-genmon-plugin:id) \
locale(xfce4-genmon-plugin:is) \
locale(xfce4-genmon-plugin:it) \
locale(xfce4-genmon-plugin:ja) \
locale(xfce4-genmon-plugin:ko) \
locale(xfce4-genmon-plugin:lt) \
locale(xfce4-genmon-plugin:lv) \
locale(xfce4-genmon-plugin:ms) \
locale(xfce4-genmon-plugin:nb) \
locale(xfce4-genmon-plugin:nl) \
locale(xfce4-genmon-plugin:oc) \
locale(xfce4-genmon-plugin:pl) \
locale(xfce4-genmon-plugin:pt) \
locale(xfce4-genmon-plugin:pt_BR) \
locale(xfce4-genmon-plugin:ru) \
locale(xfce4-genmon-plugin:sk) \
locale(xfce4-genmon-plugin:sl) \
locale(xfce4-genmon-plugin:sq) \
locale(xfce4-genmon-plugin:sr) \
locale(xfce4-genmon-plugin:sv) \
locale(xfce4-genmon-plugin:th) \
locale(xfce4-genmon-plugin:tr) \
locale(xfce4-genmon-plugin:ug) \
locale(xfce4-genmon-plugin:uk) \
locale(xfce4-genmon-plugin:zh_CN) \
locale(xfce4-genmon-plugin:zh_TW) \
xfce4-genmon-plugin-lang \
xfce4-genmon-plugin-lang-all \
xfce4-panel-plugin-genmon-lang"
RDEPENDS:${PN} += "xfce4-genmon-plugin"

inherit rpm
