SUMMARY = "Translations for package tuner"
DESCRIPTION = "Provides translations for the 'tuner' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "tuner-lang-1.5.1-1.7.noarch.rpm"
RPM_HASH = "3eacdbbf3c4a50ddd53f68dd6ce3f8bcf6f0b735c86a4e6efa2143143e97d8dc5f69df62339815a35d805fce51a31d1d60739b00a31f922c4d49814761c32dfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(tuner:de) locale(tuner:fr) locale(tuner:it) locale(tuner:nl) locale(tuner:tr) tuner-lang tuner-lang-all"
RDEPENDS:${PN} += "tuner"

inherit rpm
