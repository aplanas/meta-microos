SUMMARY = "Translation Files Finder"
DESCRIPTION = "A translation file finder for Weblate, translation tool with tight version control integration."
LICENSE = "GPL-3.0-or-later"

PV = "2.15"

RPM_NAME = "python310-translation-finder-2.15-1.2.noarch.rpm"
RPM_HASH = "de8f58b322727405bf3ab5117781cc7e1121a32eeacfe4065c5a01b36468475e1ec4efc5377c3687fea143bdeddd39fd31773d88f1eee3ea40d4884b45d67319"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-translation-finder \
python3.10dist(translation-finder) \
python310-translation-finder \
python3dist(translation-finder)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-ruamel.yaml \
python310-setuptools \
python310-weblate-language-data \
update-alternatives"

inherit rpm
