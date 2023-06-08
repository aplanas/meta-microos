SUMMARY = "Translations for package kosmindoormap"
DESCRIPTION = "Provides translations for the 'kosmindoormap' package."
LICENSE = "LGPL-2.0-or-later & CC0-1.0"

PV = "23.04.0"

RPM_NAME = "kosmindoormap-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "2c6fd0cd236481ec6382f730064ae95a82bcfcc051da2a6324acffd1d9e28ee7932c322fe7b37ed2c524e2b8256c97263919f9299253c2ba54bbcf8ed5c8fdff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kosmindoormap-lang kosmindoormap-lang-all locale(kosmindoormap:ca) locale(kosmindoormap:ca@valencia) locale(kosmindoormap:cs) locale(kosmindoormap:de) locale(kosmindoormap:en_GB) locale(kosmindoormap:es) locale(kosmindoormap:fi) locale(kosmindoormap:fr) locale(kosmindoormap:it) locale(kosmindoormap:ja) locale(kosmindoormap:ka) locale(kosmindoormap:ko) locale(kosmindoormap:lt) locale(kosmindoormap:nl) locale(kosmindoormap:pl) locale(kosmindoormap:pt) locale(kosmindoormap:pt_BR) locale(kosmindoormap:ru) locale(kosmindoormap:sk) locale(kosmindoormap:sl) locale(kosmindoormap:sv) locale(kosmindoormap:tr) locale(kosmindoormap:uk) locale(kosmindoormap:zh_CN) locale(kosmindoormap:zh_TW)"
RDEPENDS:${PN} += "kosmindoormap"

inherit rpm
