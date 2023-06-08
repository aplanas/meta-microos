SUMMARY = "Slugify application that handles Unicode"
DESCRIPTION = "A Python Slugify application that handles Unicode."
LICENSE = "MIT"

PV = "5.0.2"

RPM_NAME = "python311-python-slugify-5.0.2-1.9.noarch.rpm"
RPM_HASH = "4bdc97dc8171cf89de964ea537d4b85db5d875ad69696c66fed9f663b51898d8b830d247c1bac67bece3cb2167a3449000db91b61bed7f5e71a4277b4ce031b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-slugify) python311-python-slugify python3dist(python-slugify)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-setuptools python311-text-unidecode update-alternatives"

inherit rpm
