SUMMARY = "Translations for package thunar-volman"
DESCRIPTION = "Provides translations for the 'thunar-volman' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "thunar-volman-lang-4.18.0-1.3.noarch.rpm"
RPM_HASH = "3eac297461bc4e038d7abdff020d36c1fcac1463da4982b50160166cb3c4c6e75a96bc38744b40b5be25d326b3376605ef3bb2b431150831ee7b82e4d24f2ad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(thunar-volman:ar) locale(thunar-volman:be) locale(thunar-volman:bg) locale(thunar-volman:ca) locale(thunar-volman:cs) locale(thunar-volman:da) locale(thunar-volman:de) locale(thunar-volman:el) locale(thunar-volman:en_AU) locale(thunar-volman:en_GB) locale(thunar-volman:es) locale(thunar-volman:et) locale(thunar-volman:eu) locale(thunar-volman:fi) locale(thunar-volman:fr) locale(thunar-volman:gl) locale(thunar-volman:he) locale(thunar-volman:hi) locale(thunar-volman:hr) locale(thunar-volman:hu) locale(thunar-volman:id) locale(thunar-volman:is) locale(thunar-volman:it) locale(thunar-volman:ja) locale(thunar-volman:ko) locale(thunar-volman:lt) locale(thunar-volman:lv) locale(thunar-volman:ms) locale(thunar-volman:nb) locale(thunar-volman:nl) locale(thunar-volman:nn) locale(thunar-volman:oc) locale(thunar-volman:pl) locale(thunar-volman:pt) locale(thunar-volman:pt_BR) locale(thunar-volman:ro) locale(thunar-volman:ru) locale(thunar-volman:sk) locale(thunar-volman:sl) locale(thunar-volman:sq) locale(thunar-volman:sr) locale(thunar-volman:sv) locale(thunar-volman:te) locale(thunar-volman:th) locale(thunar-volman:tr) locale(thunar-volman:ug) locale(thunar-volman:uk) locale(thunar-volman:vi) locale(thunar-volman:zh_CN) locale(thunar-volman:zh_HK) locale(thunar-volman:zh_TW) thunar-volman-lang thunar-volman-lang-all"
RDEPENDS:${PN} += "thunar-volman"

inherit rpm
