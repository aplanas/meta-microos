SUMMARY = "Translations for package libgphoto2-6"
DESCRIPTION = "Provides translations for the 'libgphoto2-6' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.30"

RPM_NAME = "libgphoto2-6-lang-2.5.30-2.1.noarch.rpm"
RPM_HASH = "27f836ee4c566c166d7e10aa94e1074d3df28714f9e1afb902e50f06d9bb986fe09a8cc0dc70ffc3458232662e11ce84b66124bea7b76052f934245c6e3e3d31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgphoto2-6-lang libgphoto2-6-lang-all locale(libgphoto2-6:cs) locale(libgphoto2-6:da) locale(libgphoto2-6:de) locale(libgphoto2-6:es) locale(libgphoto2-6:eu) locale(libgphoto2-6:fi) locale(libgphoto2-6:fr) locale(libgphoto2-6:hu) locale(libgphoto2-6:it) locale(libgphoto2-6:ja) locale(libgphoto2-6:nl) locale(libgphoto2-6:pl) locale(libgphoto2-6:pt_BR) locale(libgphoto2-6:ro) locale(libgphoto2-6:ru) locale(libgphoto2-6:sk) locale(libgphoto2-6:sr) locale(libgphoto2-6:sv) locale(libgphoto2-6:uk) locale(libgphoto2-6:vi) locale(libgphoto2-6:zh_CN) locale(libgphoto2-6:zh_TW)"
RDEPENDS:${PN} += "libgphoto2-6"

inherit rpm
