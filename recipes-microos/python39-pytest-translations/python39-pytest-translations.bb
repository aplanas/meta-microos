SUMMARY = "Plugin for testing gettext, .po and .mo files"
DESCRIPTION = "pytest-translations is a py.test plugin to check gettext, .po and .mo files. \
Test check for: \
-  Spelling (using enchant & aspell) \
-  Consistency of mo files \
-  Obsolete translations \
-  Fuzzy translations"
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python39-pytest-translations-3.0.0-1.10.noarch.rpm"
RPM_HASH = "9ebefc9de01de1ff8d566102d80f2463d467d1fc91e34a5fd94536f4734d8809561d43dcc520b9419428cb62715d86dc053d3459092515ea78f75456e11f25fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-translations) python39-pytest-translations python3dist(pytest-translations)"
RDEPENDS:${PN} += "python(abi) python39-polib python39-pyenchant"

inherit rpm
