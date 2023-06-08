SUMMARY = "Translations for package xfce4-timer-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-timer-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.2"

RPM_NAME = "xfce4-timer-plugin-lang-1.7.2-1.1.noarch.rpm"
RPM_HASH = "5b4f7a4434f93dbefc9376f5d2cbd7da988adb287ee8e3a8d5b192fab479994bf7780126fd9d4c914031e457b555ff7897a70de0ceea9f23423b20191c84ce20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-timer-plugin:ar) locale(xfce4-timer-plugin:ast) locale(xfce4-timer-plugin:be) locale(xfce4-timer-plugin:bg) locale(xfce4-timer-plugin:ca) locale(xfce4-timer-plugin:cs) locale(xfce4-timer-plugin:da) locale(xfce4-timer-plugin:de) locale(xfce4-timer-plugin:el) locale(xfce4-timer-plugin:en_AU) locale(xfce4-timer-plugin:en_GB) locale(xfce4-timer-plugin:es) locale(xfce4-timer-plugin:et) locale(xfce4-timer-plugin:eu) locale(xfce4-timer-plugin:fi) locale(xfce4-timer-plugin:fr) locale(xfce4-timer-plugin:gl) locale(xfce4-timer-plugin:he) locale(xfce4-timer-plugin:hr) locale(xfce4-timer-plugin:hu) locale(xfce4-timer-plugin:id) locale(xfce4-timer-plugin:is) locale(xfce4-timer-plugin:it) locale(xfce4-timer-plugin:ja) locale(xfce4-timer-plugin:ko) locale(xfce4-timer-plugin:lt) locale(xfce4-timer-plugin:lv) locale(xfce4-timer-plugin:ms) locale(xfce4-timer-plugin:nb) locale(xfce4-timer-plugin:nl) locale(xfce4-timer-plugin:oc) locale(xfce4-timer-plugin:pl) locale(xfce4-timer-plugin:pt) locale(xfce4-timer-plugin:pt_BR) locale(xfce4-timer-plugin:ru) locale(xfce4-timer-plugin:sk) locale(xfce4-timer-plugin:sl) locale(xfce4-timer-plugin:sq) locale(xfce4-timer-plugin:sr) locale(xfce4-timer-plugin:sv) locale(xfce4-timer-plugin:th) locale(xfce4-timer-plugin:tr) locale(xfce4-timer-plugin:ug) locale(xfce4-timer-plugin:uk) locale(xfce4-timer-plugin:zh_CN) locale(xfce4-timer-plugin:zh_TW) xfce4-panel-plugin-timer-lang xfce4-timer-plugin-lang xfce4-timer-plugin-lang-all"
RDEPENDS:${PN} += "xfce4-timer-plugin"

inherit rpm
