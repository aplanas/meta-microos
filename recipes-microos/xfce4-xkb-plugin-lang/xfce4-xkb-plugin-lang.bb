SUMMARY = "Translations for package xfce4-xkb-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-xkb-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.3"

RPM_NAME = "xfce4-xkb-plugin-lang-0.8.3-1.4.noarch.rpm"
RPM_HASH = "c21aa0a7e3b0a67c281ae518786c94ab09692dc73ff0db5802fde2a6ef5422b7c371c5d0d127d708fec637a40227d69c9f352550cea2472731507bbe05992ff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-xkb-plugin:ar) locale(xfce4-xkb-plugin:be) locale(xfce4-xkb-plugin:bg) locale(xfce4-xkb-plugin:ca) locale(xfce4-xkb-plugin:cs) locale(xfce4-xkb-plugin:da) locale(xfce4-xkb-plugin:de) locale(xfce4-xkb-plugin:el) locale(xfce4-xkb-plugin:en_AU) locale(xfce4-xkb-plugin:en_CA) locale(xfce4-xkb-plugin:en_GB) locale(xfce4-xkb-plugin:es) locale(xfce4-xkb-plugin:et) locale(xfce4-xkb-plugin:eu) locale(xfce4-xkb-plugin:fi) locale(xfce4-xkb-plugin:fr) locale(xfce4-xkb-plugin:gl) locale(xfce4-xkb-plugin:he) locale(xfce4-xkb-plugin:hr) locale(xfce4-xkb-plugin:hu) locale(xfce4-xkb-plugin:id) locale(xfce4-xkb-plugin:is) locale(xfce4-xkb-plugin:it) locale(xfce4-xkb-plugin:ja) locale(xfce4-xkb-plugin:ka) locale(xfce4-xkb-plugin:ko) locale(xfce4-xkb-plugin:lt) locale(xfce4-xkb-plugin:lv) locale(xfce4-xkb-plugin:ms) locale(xfce4-xkb-plugin:nb) locale(xfce4-xkb-plugin:nl) locale(xfce4-xkb-plugin:oc) locale(xfce4-xkb-plugin:pl) locale(xfce4-xkb-plugin:pt) locale(xfce4-xkb-plugin:pt_BR) locale(xfce4-xkb-plugin:ro) locale(xfce4-xkb-plugin:ru) locale(xfce4-xkb-plugin:sk) locale(xfce4-xkb-plugin:sl) locale(xfce4-xkb-plugin:sq) locale(xfce4-xkb-plugin:sr) locale(xfce4-xkb-plugin:sv) locale(xfce4-xkb-plugin:th) locale(xfce4-xkb-plugin:tr) locale(xfce4-xkb-plugin:ug) locale(xfce4-xkb-plugin:uk) locale(xfce4-xkb-plugin:zh_CN) locale(xfce4-xkb-plugin:zh_TW) xfce4-panel-plugin-xkb-lang xfce4-xkb-plugin-lang xfce4-xkb-plugin-lang-all"
RDEPENDS:${PN} += "xfce4-xkb-plugin"

inherit rpm
