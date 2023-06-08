SUMMARY = "Translations for package lxqt-sudo"
DESCRIPTION = "Provides translations for the 'lxqt-sudo' package."
LICENSE = "LGPL-2.1-only"

PV = "1.3.0"

RPM_NAME = "lxqt-sudo-lang-1.3.0-1.1.noarch.rpm"
RPM_HASH = "62261368bbd4716319b1377be97d084e94247e4682edac711db494cb38166cc52243e5f8a53a77d43e4ca4b7e0912dd82b85a1ae7ef83c2ff2b2da91661abbec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-sudo-lang lxqt-sudo-lang-all"
RDEPENDS:${PN} += "lxqt-sudo"

inherit rpm
