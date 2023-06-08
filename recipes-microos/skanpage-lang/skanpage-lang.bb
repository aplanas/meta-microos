SUMMARY = "Translations for package skanpage"
DESCRIPTION = "Provides translations for the 'skanpage' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "skanpage-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "7f8a7b07c9d10a17d9bdf671e8b6f52e3e039869b7b4f297b766f35ec0f7b81e2b259f2e1401c2e6ec2cd5b1f1634bffce9033fea193075d6960541b91390220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(skanpage:ar) locale(skanpage:be) locale(skanpage:bg) locale(skanpage:ca) locale(skanpage:ca@valencia) locale(skanpage:cs) locale(skanpage:de) locale(skanpage:el) locale(skanpage:en_GB) locale(skanpage:es) locale(skanpage:eu) locale(skanpage:fi) locale(skanpage:fr) locale(skanpage:ia) locale(skanpage:id) locale(skanpage:is) locale(skanpage:it) locale(skanpage:ja) locale(skanpage:ka) locale(skanpage:ko) locale(skanpage:lt) locale(skanpage:nl) locale(skanpage:pl) locale(skanpage:pt) locale(skanpage:pt_BR) locale(skanpage:ru) locale(skanpage:sk) locale(skanpage:sl) locale(skanpage:sv) locale(skanpage:tr) locale(skanpage:uk) locale(skanpage:zh_CN) locale(skanpage:zh_TW) skanpage-lang skanpage-lang-all"
RDEPENDS:${PN} += "skanpage"

inherit rpm
