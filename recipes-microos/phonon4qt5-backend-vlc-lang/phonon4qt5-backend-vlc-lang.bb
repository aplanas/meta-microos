SUMMARY = "Translations for package phonon4qt5-backend-vlc"
DESCRIPTION = "Provides translations for the 'phonon4qt5-backend-vlc' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.11.3"

RPM_NAME = "phonon4qt5-backend-vlc-lang-0.11.3-1.14.noarch.rpm"
RPM_HASH = "e6047e894ac9a73c89e6cf1f7eadb1dcdabef10d71573050db4fd9990b15857a64a30f879e2e4ba5c85ab7cfb17a3f27d8f2146e4cca2ed5fe8a8b035f436096"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(phonon4qt5-backend-vlc:ca) locale(phonon4qt5-backend-vlc:ca@valencia) locale(phonon4qt5-backend-vlc:cs) locale(phonon4qt5-backend-vlc:da) locale(phonon4qt5-backend-vlc:de) locale(phonon4qt5-backend-vlc:en_GB) locale(phonon4qt5-backend-vlc:es) locale(phonon4qt5-backend-vlc:et) locale(phonon4qt5-backend-vlc:eu) locale(phonon4qt5-backend-vlc:fi) locale(phonon4qt5-backend-vlc:fr) locale(phonon4qt5-backend-vlc:gl) locale(phonon4qt5-backend-vlc:hu) locale(phonon4qt5-backend-vlc:id) locale(phonon4qt5-backend-vlc:it) locale(phonon4qt5-backend-vlc:ko) locale(phonon4qt5-backend-vlc:nl) locale(phonon4qt5-backend-vlc:nn) locale(phonon4qt5-backend-vlc:pl) locale(phonon4qt5-backend-vlc:pt) locale(phonon4qt5-backend-vlc:pt_BR) locale(phonon4qt5-backend-vlc:ro) locale(phonon4qt5-backend-vlc:ru) locale(phonon4qt5-backend-vlc:sk) locale(phonon4qt5-backend-vlc:sl) locale(phonon4qt5-backend-vlc:sv) locale(phonon4qt5-backend-vlc:uk) locale(phonon4qt5-backend-vlc:zh_CN) locale(phonon4qt5-backend-vlc:zh_TW) phonon4qt5-backend-vlc-lang phonon4qt5-backend-vlc-lang-all"
RDEPENDS:${PN} += "phonon4qt5-backend-vlc"

inherit rpm
