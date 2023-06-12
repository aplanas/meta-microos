SUMMARY = "Translations for package xfce4-session"
DESCRIPTION = "Provides translations for the 'xfce4-session' package."
LICENSE = "GPL-2.0-only"

PV = "4.18.3"

RPM_NAME = "xfce4-session-lang-4.18.3-1.1.noarch.rpm"
RPM_HASH = "dae6a3d9691b239733c8e601ef95dc8938d3e12fc7c3f7ad580135ba3eaaa780f327ca35e4d6ce5f4361848ea905e013c4ecc461722e3da2d10872aabe323625"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-session:ar) locale(xfce4-session:ast) locale(xfce4-session:az) locale(xfce4-session:be) locale(xfce4-session:bg) locale(xfce4-session:bn) locale(xfce4-session:ca) locale(xfce4-session:cs) locale(xfce4-session:da) locale(xfce4-session:de) locale(xfce4-session:el) locale(xfce4-session:en_AU) locale(xfce4-session:en_CA) locale(xfce4-session:en_GB) locale(xfce4-session:eo) locale(xfce4-session:es) locale(xfce4-session:et) locale(xfce4-session:eu) locale(xfce4-session:fi) locale(xfce4-session:fr) locale(xfce4-session:gl) locale(xfce4-session:he) locale(xfce4-session:hi) locale(xfce4-session:hr) locale(xfce4-session:hu) locale(xfce4-session:id) locale(xfce4-session:is) locale(xfce4-session:it) locale(xfce4-session:ja) locale(xfce4-session:kk) locale(xfce4-session:ko) locale(xfce4-session:lt) locale(xfce4-session:lv) locale(xfce4-session:ms) locale(xfce4-session:nb) locale(xfce4-session:nl) locale(xfce4-session:nn) locale(xfce4-session:oc) locale(xfce4-session:pa) locale(xfce4-session:pl) locale(xfce4-session:pt) locale(xfce4-session:pt_BR) locale(xfce4-session:ro) locale(xfce4-session:ru) locale(xfce4-session:si) locale(xfce4-session:sk) locale(xfce4-session:sl) locale(xfce4-session:sq) locale(xfce4-session:sr) locale(xfce4-session:sv) locale(xfce4-session:te) locale(xfce4-session:th) locale(xfce4-session:tr) locale(xfce4-session:ug) locale(xfce4-session:uk) locale(xfce4-session:vi) locale(xfce4-session:zh_CN) locale(xfce4-session:zh_HK) locale(xfce4-session:zh_TW) xfce4-session-lang xfce4-session-lang-all"
RDEPENDS:${PN} += "xfce4-session"

inherit rpm
