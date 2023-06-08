SUMMARY = "Translations for package spectacle"
DESCRIPTION = "Provides translations for the 'spectacle' package."
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "spectacle-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "505ae89d07b76f81286f94705530516ebac679494a81ca79ea1afef4c3a66fa06a7b0e7e5b0864a0516db3d2e94ab62ab70db10da661453e9c92e49b3428f04a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(spectacle:ar) locale(spectacle:az) locale(spectacle:bg) locale(spectacle:ca) locale(spectacle:ca@valencia) locale(spectacle:cs) locale(spectacle:da) locale(spectacle:de) locale(spectacle:el) locale(spectacle:en_GB) locale(spectacle:es) locale(spectacle:et) locale(spectacle:eu) locale(spectacle:fi) locale(spectacle:fr) locale(spectacle:gl) locale(spectacle:he) locale(spectacle:hu) locale(spectacle:ia) locale(spectacle:id) locale(spectacle:is) locale(spectacle:it) locale(spectacle:ja) locale(spectacle:ka) locale(spectacle:ko) locale(spectacle:lt) locale(spectacle:ml) locale(spectacle:nl) locale(spectacle:nn) locale(spectacle:pa) locale(spectacle:pl) locale(spectacle:pt) locale(spectacle:pt_BR) locale(spectacle:ro) locale(spectacle:ru) locale(spectacle:sk) locale(spectacle:sl) locale(spectacle:sr) locale(spectacle:sr@ijekavian) locale(spectacle:sr@ijekavianlatin) locale(spectacle:sr@latin) locale(spectacle:sv) locale(spectacle:ta) locale(spectacle:tr) locale(spectacle:uk) locale(spectacle:zh_CN) locale(spectacle:zh_TW) spectacle-lang spectacle-lang-all"
RDEPENDS:${PN} += "spectacle"

inherit rpm
