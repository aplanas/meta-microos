SUMMARY = "Translations for package safeeyes"
DESCRIPTION = "Provides translations for the 'safeeyes' package."
LICENSE = "GPL-3.0-only"

PV = "2.1.4"

RPM_NAME = "safeeyes-lang-2.1.4-1.2.noarch.rpm"
RPM_HASH = "a36dad365e6c0555e312b2c52e3de2645ee4143175f704b2ced77f34c364e27fbaf892ebf21949c896c0d75742266e02ebd8476133e4ad62db1fd80c771b4712"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(safeeyes:ar) \
locale(safeeyes:bg) \
locale(safeeyes:ca) \
locale(safeeyes:cs) \
locale(safeeyes:da) \
locale(safeeyes:de) \
locale(safeeyes:en_US) \
locale(safeeyes:eo) \
locale(safeeyes:es) \
locale(safeeyes:et) \
locale(safeeyes:eu) \
locale(safeeyes:fa) \
locale(safeeyes:fr) \
locale(safeeyes:he) \
locale(safeeyes:hi) \
locale(safeeyes:hu) \
locale(safeeyes:id) \
locale(safeeyes:it) \
locale(safeeyes:kn) \
locale(safeeyes:ko) \
locale(safeeyes:lt) \
locale(safeeyes:lv) \
locale(safeeyes:mk) \
locale(safeeyes:mr) \
locale(safeeyes:nb) \
locale(safeeyes:nl) \
locale(safeeyes:pl) \
locale(safeeyes:pt) \
locale(safeeyes:pt_BR) \
locale(safeeyes:ru) \
locale(safeeyes:sk) \
locale(safeeyes:sr) \
locale(safeeyes:sv) \
locale(safeeyes:ta) \
locale(safeeyes:tr) \
locale(safeeyes:ug) \
locale(safeeyes:uk) \
locale(safeeyes:uz_Latn) \
locale(safeeyes:vi) \
locale(safeeyes:zh_CN) \
locale(safeeyes:zh_TW) \
safeeyes-lang \
safeeyes-lang-all"
RDEPENDS:${PN} += "safeeyes"

inherit rpm
