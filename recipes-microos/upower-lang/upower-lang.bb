SUMMARY = "Translations for package upower"
DESCRIPTION = "Provides translations for the 'upower' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.90.0"

RPM_NAME = "upower-lang-1.90.0-1.4.noarch.rpm"
RPM_HASH = "95bd4f205df763d734107aaeb26ad148aa3b93981e3b1e78a90bd1d84c1f403183710e456b977e7f5c0bd96a1a72e83efe57887b0f5c83d93e4eb5054a83b028"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(upower:fr) locale(upower:it) locale(upower:pl) locale(upower:sv) upower-lang upower-lang-all"
RDEPENDS:${PN} += "upower"

inherit rpm
