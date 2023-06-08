SUMMARY = "Translations for package tepl-6"
DESCRIPTION = "Provides translations for the 'tepl-6' package."
LICENSE = "LGPL-3.0-or-later"

PV = "6.4.0"

RPM_NAME = "tepl-6-lang-6.4.0-1.4.noarch.rpm"
RPM_HASH = "97f66e0cc3f579f9b0b4ebc8f61935f48aa1158a1954698d10ccfed94aa78ae22e3f210f06937b3ee6ccae7a337688204ceebfc2ae475b082f646d3aa1328b35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(tepl-6:ca) locale(tepl-6:cs) locale(tepl-6:da) locale(tepl-6:de) locale(tepl-6:el) locale(tepl-6:en_GB) locale(tepl-6:es) locale(tepl-6:eu) locale(tepl-6:fr) locale(tepl-6:fur) locale(tepl-6:hr) locale(tepl-6:hu) locale(tepl-6:id) locale(tepl-6:ja) locale(tepl-6:nl) locale(tepl-6:pl) locale(tepl-6:pt_BR) locale(tepl-6:ro) locale(tepl-6:ru) locale(tepl-6:sl) locale(tepl-6:sr) locale(tepl-6:sv) locale(tepl-6:tr) locale(tepl-6:uk) locale(tepl-6:zh_CN) tepl-6-lang tepl-6-lang-all"
RDEPENDS:${PN} += "tepl-6"

inherit rpm
