SUMMARY = "Slugify application that handles Unicode"
DESCRIPTION = "A Python Slugify application that handles Unicode."
LICENSE = "MIT"

PV = "5.0.2"

RPM_NAME = "python39-python-slugify-5.0.2-1.9.noarch.rpm"
RPM_HASH = "df969df03e62fb727144e367509a86aa0df67922bcee5118506f6ce4c64e908b5111528db51b25602e7ea92cf03d7cd6ec796b1b4491dcfbae73c796a27f42e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-slugify) python39-python-slugify python3dist(python-slugify)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-setuptools python39-text-unidecode update-alternatives"

inherit rpm
