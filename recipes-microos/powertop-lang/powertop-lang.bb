SUMMARY = "Translations for package powertop"
DESCRIPTION = "Provides translations for the 'powertop' package."
LICENSE = "GPL-2.0-only"

PV = "2.15"

RPM_NAME = "powertop-lang-2.15-1.3.noarch.rpm"
RPM_HASH = "ae3649d7bbd60dc7a0a02a94c9fc3d2772b9974ff6bf12be3dae3e56fda22c01a2d113dcd3759b4a2b6a05f8cf2869a8413eb6a0e1bd5deb09339e48a2f3fcac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(powertop:ca) locale(powertop:cs_CZ) locale(powertop:de_DE) locale(powertop:en_GB) locale(powertop:en_US) locale(powertop:es_ES) locale(powertop:zh_TW) powertop-lang powertop-lang-all"
RDEPENDS:${PN} += "powertop"

inherit rpm
