SUMMARY = "Plugin for testing gettext, .po and .mo files"
DESCRIPTION = "pytest-translations is a py.test plugin to check gettext, .po and .mo files. \
Test check for: \
-  Spelling (using enchant & aspell) \
-  Consistency of mo files \
-  Obsolete translations \
-  Fuzzy translations"
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python310-pytest-translations-3.0.0-1.10.noarch.rpm"
RPM_HASH = "52b55ad48e6de48d69213531a9be37d5b30ad11c2d4500dce895ffbde51a2c7685ebcf0ac764176f58607decbfe67411df2d77cdce26aa3ccec15e57577cdc3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-translations python3.10dist(pytest-translations) python310-pytest-translations python3dist(pytest-translations)"
RDEPENDS:${PN} += "python(abi) python310-polib python310-pyenchant"

inherit rpm
