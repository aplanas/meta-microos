SUMMARY = "Slugify application that handles Unicode"
DESCRIPTION = "A Python Slugify application that handles Unicode."
LICENSE = "MIT"

PV = "5.0.2"

RPM_NAME = "python310-python-slugify-5.0.2-1.9.noarch.rpm"
RPM_HASH = "feb4bb3338b3bd5357c934133bf49e0aff821c7855491e0ec8582f71280a7d12235def0942549104f11166557a74f0364a9f649c62991cb6b01875b9e5584488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-slugify python3.10dist(python-slugify) python310-python-slugify python3dist(python-slugify)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-setuptools python310-text-unidecode update-alternatives"

inherit rpm
