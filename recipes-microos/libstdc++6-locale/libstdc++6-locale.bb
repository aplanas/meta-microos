SUMMARY = "Standard C++ Library Locales"
DESCRIPTION = "The standard C++ library locale data."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "13.0.1+git7231"

RPM_NAME = "libstdc++6-locale-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "d1661ce50f34c732715a68b40f44c146ae104370271b73c883602a19912f26a120e2476d588cb4f2e7016e307afc9dfecb0201701389f1dc02e011f5d60746da"

RPROVIDES:${PN} += "libstdc++6-locale libstdc++6-locale(aarch-64) locale(libstdc++6:de) locale(libstdc++6:fr)"
RDEPENDS:${PN} += ""

inherit rpm
