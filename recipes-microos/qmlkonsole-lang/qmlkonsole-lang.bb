SUMMARY = "Translations for package qmlkonsole"
DESCRIPTION = "Provides translations for the 'qmlkonsole' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "qmlkonsole-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "ac7474bc2acac24163aae681dd3a33e0477cb7fc6e89aa2910f4b778662125a1c5ef38cbb554726feb0c4b6d50b83bf332211a7e65e9ae4491dfd9b3960cc1cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(qmlkonsole:ca) locale(qmlkonsole:ca@valencia) locale(qmlkonsole:cs) locale(qmlkonsole:de) locale(qmlkonsole:en_GB) locale(qmlkonsole:es) locale(qmlkonsole:eu) locale(qmlkonsole:fi) locale(qmlkonsole:fr) locale(qmlkonsole:hi) locale(qmlkonsole:hu) locale(qmlkonsole:it) locale(qmlkonsole:ja) locale(qmlkonsole:ka) locale(qmlkonsole:ko) locale(qmlkonsole:lt) locale(qmlkonsole:nl) locale(qmlkonsole:nn) locale(qmlkonsole:pa) locale(qmlkonsole:pl) locale(qmlkonsole:pt) locale(qmlkonsole:pt_BR) locale(qmlkonsole:ro) locale(qmlkonsole:ru) locale(qmlkonsole:sk) locale(qmlkonsole:sl) locale(qmlkonsole:sv) locale(qmlkonsole:ta) locale(qmlkonsole:tr) locale(qmlkonsole:uk) locale(qmlkonsole:zh_CN) locale(qmlkonsole:zh_TW) qmlkonsole-lang qmlkonsole-lang-all"
RDEPENDS:${PN} += "qmlkonsole"

inherit rpm
