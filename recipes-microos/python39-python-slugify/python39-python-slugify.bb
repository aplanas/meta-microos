SUMMARY = "Slugify application that handles Unicode"
DESCRIPTION = "A Python Slugify application that handles Unicode."
LICENSE = "MIT"

PV = "5.0.2"

RPM_NAME = "python39-python-slugify-5.0.2-2.1.noarch.rpm"
RPM_HASH = "efa91d453fc78668592a439a99ec4055aebfeac9bd9517adca0653c7a739426b0d87bd824dcde467cdb1cf5a368a4465ed6fd997cf913d9963c7b7152538f8d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-slugify) python39-python-slugify python3dist(python-slugify)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-setuptools python39-text-unidecode update-alternatives"

inherit rpm
