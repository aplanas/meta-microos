SUMMARY = "Translations for package spectacle"
DESCRIPTION = "Provides translations for the 'spectacle' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "spectacle-lang-23.04.1-2.1.noarch.rpm"
RPM_HASH = "25a38513402010c0985cd5ffa240f2e00a11f4bd1302e145c405962dcad62e803649898d617c1a4f7cd04edccf6e4b94f64ad1cf1061fe660a3ccdec8adc32f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(spectacle:ar) locale(spectacle:az) locale(spectacle:bg) locale(spectacle:ca) locale(spectacle:ca@valencia) locale(spectacle:cs) locale(spectacle:da) locale(spectacle:de) locale(spectacle:el) locale(spectacle:en_GB) locale(spectacle:es) locale(spectacle:et) locale(spectacle:eu) locale(spectacle:fi) locale(spectacle:fr) locale(spectacle:gl) locale(spectacle:he) locale(spectacle:hu) locale(spectacle:ia) locale(spectacle:id) locale(spectacle:is) locale(spectacle:it) locale(spectacle:ja) locale(spectacle:ka) locale(spectacle:ko) locale(spectacle:lt) locale(spectacle:ml) locale(spectacle:nl) locale(spectacle:nn) locale(spectacle:pa) locale(spectacle:pl) locale(spectacle:pt) locale(spectacle:pt_BR) locale(spectacle:ro) locale(spectacle:ru) locale(spectacle:sk) locale(spectacle:sl) locale(spectacle:sr) locale(spectacle:sr@ijekavian) locale(spectacle:sr@ijekavianlatin) locale(spectacle:sr@latin) locale(spectacle:sv) locale(spectacle:ta) locale(spectacle:tr) locale(spectacle:uk) locale(spectacle:zh_CN) locale(spectacle:zh_TW) spectacle-lang spectacle-lang-all"
RDEPENDS:${PN} += "spectacle"

inherit rpm
