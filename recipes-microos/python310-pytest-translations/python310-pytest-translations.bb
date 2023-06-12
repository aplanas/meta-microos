SUMMARY = "Plugin for testing gettext, .po and .mo files"
DESCRIPTION = "pytest-translations is a py.test plugin to check gettext, .po and .mo files. \
Test check for: \
-  Spelling (using enchant & aspell) \
-  Consistency of mo files \
-  Obsolete translations \
-  Fuzzy translations"
LICENSE = "Apache-2.0"

PV = "4.0.1"

RPM_NAME = "python310-pytest-translations-4.0.1-1.1.noarch.rpm"
RPM_HASH = "107ff4e847f91210f6f8d50bd7c12a9857e358a8facf03aaadbdc70e1007e8c18cdbe7d13d46bd79381c644f5fc9f5573412a320b59e7f93dff9131c99eff744"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-translations python3.10dist(pytest-translations) python310-pytest-translations python3dist(pytest-translations)"
RDEPENDS:${PN} += "python(abi) python310-polib python310-pyenchant"

inherit rpm
