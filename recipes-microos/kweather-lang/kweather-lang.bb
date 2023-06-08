SUMMARY = "Translations for package kweather"
DESCRIPTION = "Provides translations for the 'kweather' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kweather-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "433215c6565bc49c2152337ee7161529e9174527b9d84a59ef63fafaf0530322868d5e9bf391e92ae895e9d03a387fb0f1b6c4e2cb1a4d8ef4e2a8c383308987"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kweather-lang kweather-lang-all locale(kweather:az) locale(kweather:ca) locale(kweather:ca@valencia) locale(kweather:cs) locale(kweather:de) locale(kweather:el) locale(kweather:en_GB) locale(kweather:es) locale(kweather:et) locale(kweather:eu) locale(kweather:fi) locale(kweather:fr) locale(kweather:is) locale(kweather:it) locale(kweather:ja) locale(kweather:ka) locale(kweather:ko) locale(kweather:lt) locale(kweather:nl) locale(kweather:nn) locale(kweather:pa) locale(kweather:pl) locale(kweather:pt) locale(kweather:pt_BR) locale(kweather:ru) locale(kweather:sk) locale(kweather:sl) locale(kweather:sv) locale(kweather:tr) locale(kweather:uk) locale(kweather:zh_CN) locale(kweather:zh_TW)"
RDEPENDS:${PN} += "kweather"

inherit rpm
