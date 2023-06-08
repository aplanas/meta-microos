SUMMARY = "Plugin for testing gettext, .po and .mo files"
DESCRIPTION = "pytest-translations is a py.test plugin to check gettext, .po and .mo files. \
Test check for: \
-  Spelling (using enchant & aspell) \
-  Consistency of mo files \
-  Obsolete translations \
-  Fuzzy translations"
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python311-pytest-translations-3.0.0-1.10.noarch.rpm"
RPM_HASH = "b6cba86507c7feb26121db529d5df658516c91cb6ff3dd2bab4df016e63602efb04975a1993af39b0d041f4835200bd2b4d8eeedf0453142f72d606a9956c5ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-translations) python311-pytest-translations python3dist(pytest-translations)"
RDEPENDS:${PN} += "python(abi) python311-polib python311-pyenchant"

inherit rpm
