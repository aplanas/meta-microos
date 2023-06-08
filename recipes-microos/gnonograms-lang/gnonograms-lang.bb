SUMMARY = "Translations for package gnonograms"
DESCRIPTION = "Provides translations for the 'gnonograms' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "gnonograms-lang-2.0.0-1.7.noarch.rpm"
RPM_HASH = "0e83f3e52470b8bed6eff925f9bd78d33112329321f1fed27d7325c55a696a37c95ac619c1c8be4f2d3a2c97faaee762b140798ff32070aee3eb43e4299d66ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnonograms-lang gnonograms-lang-all locale(gnonograms:fr) locale(gnonograms:nl) locale(gnonograms:pt)"
RDEPENDS:${PN} += "gnonograms"

inherit rpm
