SUMMARY = "Translations for package kweather"
DESCRIPTION = "Provides translations for the 'kweather' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kweather-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "1ca9bb7e1c664a85f1b053e5d8d698aeb05a8b6830ce231dcc8bbc34d14af0d184181586f762cee78867636a01f0113d9aeb83e0af5ee54d705280f8d73ca622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kweather-lang \
kweather-lang-all \
locale(kweather:az) \
locale(kweather:ca) \
locale(kweather:ca@valencia) \
locale(kweather:cs) \
locale(kweather:de) \
locale(kweather:el) \
locale(kweather:en_GB) \
locale(kweather:es) \
locale(kweather:et) \
locale(kweather:eu) \
locale(kweather:fi) \
locale(kweather:fr) \
locale(kweather:is) \
locale(kweather:it) \
locale(kweather:ja) \
locale(kweather:ka) \
locale(kweather:ko) \
locale(kweather:lt) \
locale(kweather:nl) \
locale(kweather:nn) \
locale(kweather:pa) \
locale(kweather:pl) \
locale(kweather:pt) \
locale(kweather:pt_BR) \
locale(kweather:ru) \
locale(kweather:sk) \
locale(kweather:sl) \
locale(kweather:sv) \
locale(kweather:tr) \
locale(kweather:uk) \
locale(kweather:zh_CN) \
locale(kweather:zh_TW)"
RDEPENDS:${PN} += "kweather"

inherit rpm
