SUMMARY = "Translations for package xfce4-stopwatch-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-stopwatch-plugin' package."
LICENSE = "BSD-2-Clause"

PV = "0.5.0"

RPM_NAME = "xfce4-stopwatch-plugin-lang-0.5.0-1.9.noarch.rpm"
RPM_HASH = "4c1ab1d51f0f9e61b38f899a5f8e58d38ce9fd150e3e80663c3cbe0bf12252d2129a531fd8e7a5a2122d2949330b45c905ed156ff35e4ec8b4313d62e9a35fe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-stopwatch-plugin:ar) locale(xfce4-stopwatch-plugin:ast) locale(xfce4-stopwatch-plugin:be) locale(xfce4-stopwatch-plugin:bg) locale(xfce4-stopwatch-plugin:ca) locale(xfce4-stopwatch-plugin:cs) locale(xfce4-stopwatch-plugin:da) locale(xfce4-stopwatch-plugin:de) locale(xfce4-stopwatch-plugin:el) locale(xfce4-stopwatch-plugin:en_AU) locale(xfce4-stopwatch-plugin:en_CA) locale(xfce4-stopwatch-plugin:en_GB) locale(xfce4-stopwatch-plugin:es) locale(xfce4-stopwatch-plugin:et) locale(xfce4-stopwatch-plugin:eu) locale(xfce4-stopwatch-plugin:fi) locale(xfce4-stopwatch-plugin:fr) locale(xfce4-stopwatch-plugin:gl) locale(xfce4-stopwatch-plugin:he) locale(xfce4-stopwatch-plugin:hr) locale(xfce4-stopwatch-plugin:hu) locale(xfce4-stopwatch-plugin:id) locale(xfce4-stopwatch-plugin:is) locale(xfce4-stopwatch-plugin:it) locale(xfce4-stopwatch-plugin:ja) locale(xfce4-stopwatch-plugin:kk) locale(xfce4-stopwatch-plugin:ko) locale(xfce4-stopwatch-plugin:lt) locale(xfce4-stopwatch-plugin:ms) locale(xfce4-stopwatch-plugin:nb) locale(xfce4-stopwatch-plugin:nl) locale(xfce4-stopwatch-plugin:oc) locale(xfce4-stopwatch-plugin:pl) locale(xfce4-stopwatch-plugin:pt) locale(xfce4-stopwatch-plugin:pt_BR) locale(xfce4-stopwatch-plugin:ru) locale(xfce4-stopwatch-plugin:sk) locale(xfce4-stopwatch-plugin:sl) locale(xfce4-stopwatch-plugin:sq) locale(xfce4-stopwatch-plugin:sr) locale(xfce4-stopwatch-plugin:sv) locale(xfce4-stopwatch-plugin:tr) locale(xfce4-stopwatch-plugin:ug) locale(xfce4-stopwatch-plugin:uk) locale(xfce4-stopwatch-plugin:zh_CN) locale(xfce4-stopwatch-plugin:zh_TW) xfce4-panel-plugin-stopwatch-lang xfce4-stopwatch-plugin-lang xfce4-stopwatch-plugin-lang-all"
RDEPENDS:${PN} += "xfce4-stopwatch-plugin"

inherit rpm
