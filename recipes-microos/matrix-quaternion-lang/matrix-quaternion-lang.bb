SUMMARY = "Translations for package matrix-quaternion"
DESCRIPTION = "Provides translations for the 'matrix-quaternion' package."
LICENSE = "GPL-3.0-only"

PV = "0.0.95.1"

RPM_NAME = "matrix-quaternion-lang-0.0.95.1-1.11.noarch.rpm"
RPM_HASH = "49973900aa050d40b173955f2744705e82b0066a810b6be72320c29136c3b41d14dfe2bd02eebda6e98f824740e25b1fd6af8886914f65c0d458937dd53ef6df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "matrix-quaternion-lang \
matrix-quaternion-lang-all"
RDEPENDS:${PN} += "matrix-quaternion"

inherit rpm
