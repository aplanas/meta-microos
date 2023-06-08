SUMMARY = "Translations for package xfce4-smartbookmark-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-smartbookmark-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "xfce4-smartbookmark-plugin-lang-0.5.2-1.12.noarch.rpm"
RPM_HASH = "55bf0480908e1e4647ec23531d394d0b01a4cee8e11b928356bf4dbe8c455e74c476d57f05ee19b05328f8b71c1097925017521546b34fc82b1ede968e1728f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-smartbookmark-plugin:ar) locale(xfce4-smartbookmark-plugin:be) locale(xfce4-smartbookmark-plugin:bg) locale(xfce4-smartbookmark-plugin:ca) locale(xfce4-smartbookmark-plugin:cs) locale(xfce4-smartbookmark-plugin:da) locale(xfce4-smartbookmark-plugin:de) locale(xfce4-smartbookmark-plugin:el) locale(xfce4-smartbookmark-plugin:en_AU) locale(xfce4-smartbookmark-plugin:en_CA) locale(xfce4-smartbookmark-plugin:en_GB) locale(xfce4-smartbookmark-plugin:es) locale(xfce4-smartbookmark-plugin:et) locale(xfce4-smartbookmark-plugin:eu) locale(xfce4-smartbookmark-plugin:fi) locale(xfce4-smartbookmark-plugin:fr) locale(xfce4-smartbookmark-plugin:gl) locale(xfce4-smartbookmark-plugin:he) locale(xfce4-smartbookmark-plugin:hi) locale(xfce4-smartbookmark-plugin:hr) locale(xfce4-smartbookmark-plugin:hu) locale(xfce4-smartbookmark-plugin:id) locale(xfce4-smartbookmark-plugin:is) locale(xfce4-smartbookmark-plugin:it) locale(xfce4-smartbookmark-plugin:ja) locale(xfce4-smartbookmark-plugin:ko) locale(xfce4-smartbookmark-plugin:lt) locale(xfce4-smartbookmark-plugin:lv) locale(xfce4-smartbookmark-plugin:ms) locale(xfce4-smartbookmark-plugin:nb) locale(xfce4-smartbookmark-plugin:nl) locale(xfce4-smartbookmark-plugin:oc) locale(xfce4-smartbookmark-plugin:pl) locale(xfce4-smartbookmark-plugin:pt) locale(xfce4-smartbookmark-plugin:pt_BR) locale(xfce4-smartbookmark-plugin:ru) locale(xfce4-smartbookmark-plugin:sk) locale(xfce4-smartbookmark-plugin:sl) locale(xfce4-smartbookmark-plugin:sq) locale(xfce4-smartbookmark-plugin:sr) locale(xfce4-smartbookmark-plugin:sv) locale(xfce4-smartbookmark-plugin:th) locale(xfce4-smartbookmark-plugin:tr) locale(xfce4-smartbookmark-plugin:ug) locale(xfce4-smartbookmark-plugin:uk) locale(xfce4-smartbookmark-plugin:zh_CN) locale(xfce4-smartbookmark-plugin:zh_TW) xfce4-panel-plugin-smartbookmark-lang xfce4-smartbookmark-plugin-lang xfce4-smartbookmark-plugin-lang-all"
RDEPENDS:${PN} += "xfce4-smartbookmark-plugin"

inherit rpm
