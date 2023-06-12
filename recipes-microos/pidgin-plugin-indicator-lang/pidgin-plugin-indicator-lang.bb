SUMMARY = "Translations for package pidgin-plugin-indicator"
DESCRIPTION = "Provides translations for the 'pidgin-plugin-indicator' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "pidgin-plugin-indicator-lang-1.0.1-2.14.noarch.rpm"
RPM_HASH = "2e83611d5630a2d20a048e3247585e7eef620ecbe78e81406964a40b369ac823b1fbcd0a53e7bf216f6a2fa84d948f64fc06295c1197e1d6cc6bf657725f8abb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(pidgin-plugin-indicator:de) \
locale(pidgin-plugin-indicator:es) \
locale(pidgin-plugin-indicator:hu) \
locale(pidgin-plugin-indicator:ru) \
locale(pidgin-plugin-indicator:zh_CN) \
pidgin-plugin-indicator-lang \
pidgin-plugin-indicator-lang-all"
RDEPENDS:${PN} += "pidgin-plugin-indicator"

inherit rpm
