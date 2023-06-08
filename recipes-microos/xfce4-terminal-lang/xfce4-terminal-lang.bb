SUMMARY = "Translations for package xfce4-terminal"
DESCRIPTION = "Provides translations for the 'xfce4-terminal' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.4"

RPM_NAME = "xfce4-terminal-lang-1.0.4-1.4.noarch.rpm"
RPM_HASH = "d8c1eb06211bec99cc816a45a0974666a086a4e222df6a956dfc6f127c60120ddf21e29a63c1422eb6066e10f21571dc06260061be89ac00d0a7ce1ddbb761ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-terminal:ar) locale(xfce4-terminal:ast) locale(xfce4-terminal:be) locale(xfce4-terminal:bg) locale(xfce4-terminal:ca) locale(xfce4-terminal:cs) locale(xfce4-terminal:da) locale(xfce4-terminal:de) locale(xfce4-terminal:el) locale(xfce4-terminal:en_AU) locale(xfce4-terminal:en_GB) locale(xfce4-terminal:eo) locale(xfce4-terminal:es) locale(xfce4-terminal:et) locale(xfce4-terminal:eu) locale(xfce4-terminal:fi) locale(xfce4-terminal:fr) locale(xfce4-terminal:gl) locale(xfce4-terminal:he) locale(xfce4-terminal:hr) locale(xfce4-terminal:hu) locale(xfce4-terminal:id) locale(xfce4-terminal:is) locale(xfce4-terminal:it) locale(xfce4-terminal:ja) locale(xfce4-terminal:kk) locale(xfce4-terminal:ko) locale(xfce4-terminal:lt) locale(xfce4-terminal:lv) locale(xfce4-terminal:ms) locale(xfce4-terminal:nb) locale(xfce4-terminal:nl) locale(xfce4-terminal:oc) locale(xfce4-terminal:pa) locale(xfce4-terminal:pl) locale(xfce4-terminal:pt) locale(xfce4-terminal:pt_BR) locale(xfce4-terminal:ro) locale(xfce4-terminal:ru) locale(xfce4-terminal:si) locale(xfce4-terminal:sk) locale(xfce4-terminal:sl) locale(xfce4-terminal:sq) locale(xfce4-terminal:sr) locale(xfce4-terminal:sv) locale(xfce4-terminal:te) locale(xfce4-terminal:th) locale(xfce4-terminal:tr) locale(xfce4-terminal:ug) locale(xfce4-terminal:uk) locale(xfce4-terminal:vi) locale(xfce4-terminal:zh_CN) locale(xfce4-terminal:zh_TW) xfce4-terminal-lang xfce4-terminal-lang-all"
RDEPENDS:${PN} += "xfce4-terminal"

inherit rpm
