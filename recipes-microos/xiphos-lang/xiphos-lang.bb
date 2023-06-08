SUMMARY = "Translations for package xiphos"
DESCRIPTION = "Provides translations for the 'xiphos' package."
LICENSE = "GPL-2.0-only"

PV = "4.2.1.7"

RPM_NAME = "xiphos-lang-4.2.1.7-1.15.noarch.rpm"
RPM_HASH = "05f987d22e1cf8c427a0571e135784e6263b6ad30ad4b12920e7682379eb598cc0b4278826324a763c8749bbfd08c231d5c7d8f95c829337955b2316718cd552"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xiphos:ar) locale(xiphos:bg) locale(xiphos:cs) locale(xiphos:cy) locale(xiphos:da) locale(xiphos:de) locale(xiphos:en_GB) locale(xiphos:es) locale(xiphos:fa) locale(xiphos:fi) locale(xiphos:fr) locale(xiphos:he) locale(xiphos:hu) locale(xiphos:it) locale(xiphos:ja) locale(xiphos:lt) locale(xiphos:lv) locale(xiphos:nb) locale(xiphos:nl) locale(xiphos:pl) locale(xiphos:pt) locale(xiphos:pt_BR) locale(xiphos:ro) locale(xiphos:ru) locale(xiphos:sk) locale(xiphos:sl) locale(xiphos:sv) locale(xiphos:tr) locale(xiphos:vi) locale(xiphos:zh_CN) locale(xiphos:zh_TW) xiphos-lang xiphos-lang-all"
RDEPENDS:${PN} += "xiphos"

inherit rpm
