SUMMARY = "Translations for package lxqt-config"
DESCRIPTION = "Provides translations for the 'lxqt-config' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-config-lang-1.3.0-1.1.noarch.rpm"
RPM_HASH = "0449f38b578e1addbd043f8838aa040f02182af623bd34d99df084e8d31737894169d27df3a3165839d7b927e4ef1412a72b2a3f6cba11b1d7e04f110f37eb2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-config-lang lxqt-config-lang-all"
RDEPENDS:${PN} += "lxqt-config"

inherit rpm
