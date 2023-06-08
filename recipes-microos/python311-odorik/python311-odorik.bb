SUMMARY = "Python module for Odorik API"
DESCRIPTION = "Python module to work with Odorik API."
LICENSE = "GPL-3.0-or-later"

PV = "0.5"

RPM_NAME = "python311-odorik-0.5-6.4.noarch.rpm"
RPM_HASH = "8102ed54a389fe7e8a3582515ee161bf5a44756ecd9fa608c6b19502489dbc6e6667a3cd856e073e4e4903da4b4856257d452b58b5b4b2c1453be7de2c7cd6db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(odorik) python311-odorik python3dist(odorik)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-python-dateutil python311-xdg update-alternatives"

inherit rpm
