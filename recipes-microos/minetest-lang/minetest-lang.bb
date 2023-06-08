SUMMARY = "Translations for package minetest"
DESCRIPTION = "Provides translations for the 'minetest' package."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.1-or-later"

PV = "5.7.0"

RPM_NAME = "minetest-lang-5.7.0-1.1.noarch.rpm"
RPM_HASH = "5f397630d13a8f83d4c6028e724a4d59106281f299c586151468537bbe245798e884869919ae98d2ae2fbd61e0cfe9ddef557d1d4fc1fd6aabbd545eab93adcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(minetest:be) locale(minetest:bg) locale(minetest:ca) locale(minetest:cs) locale(minetest:cy) locale(minetest:da) locale(minetest:de) locale(minetest:el) locale(minetest:eo) locale(minetest:es) locale(minetest:et) locale(minetest:eu) locale(minetest:fi) locale(minetest:fr) locale(minetest:gd) locale(minetest:gl) locale(minetest:hu) locale(minetest:id) locale(minetest:it) locale(minetest:ja) locale(minetest:kk) locale(minetest:ko) locale(minetest:lt) locale(minetest:lv) locale(minetest:mr) locale(minetest:ms) locale(minetest:nb) locale(minetest:nl) locale(minetest:nn) locale(minetest:oc) locale(minetest:pl) locale(minetest:pt) locale(minetest:pt_BR) locale(minetest:ro) locale(minetest:ru) locale(minetest:sk) locale(minetest:sl) locale(minetest:sv) locale(minetest:tr) locale(minetest:uk) locale(minetest:vi) locale(minetest:zh_CN) locale(minetest:zh_TW) minetest-lang minetest-lang-all"
RDEPENDS:${PN} += "minetest"

inherit rpm
