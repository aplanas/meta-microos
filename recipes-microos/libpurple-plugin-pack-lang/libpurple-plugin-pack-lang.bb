SUMMARY = "Translations for package libpurple-plugin-pack"
DESCRIPTION = "Provides translations for the 'libpurple-plugin-pack' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.8.0"

RPM_NAME = "libpurple-plugin-pack-lang-2.8.0-1.3.noarch.rpm"
RPM_HASH = "42aea31617c0f667c6ceab9c160d4dc9cc93598db451c3384f7f5f73744098d57bee993da001a38bbb9d85bc0b61b6e2fc50a2e47402807c19118b4a63082229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpurple-plugin-pack-lang \
libpurple-plugin-pack-lang-all \
locale(libpurple-plugin-pack:de) \
locale(libpurple-plugin-pack:en_AU) \
locale(libpurple-plugin-pack:es_ES) \
locale(libpurple-plugin-pack:fr) \
locale(libpurple-plugin-pack:vi)"
RDEPENDS:${PN} += "libpurple-plugin-pack"

inherit rpm
