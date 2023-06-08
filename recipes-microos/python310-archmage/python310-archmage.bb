SUMMARY = "A reader and decompiler for files in the CHM format"
DESCRIPTION = "arCHMage is a reader and decompiler for files in the CHM format. This is \
the format used by Microsoft HTML Help, and is also known as Compiled HTML."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2.1"

RPM_NAME = "python310-archmage-0.4.2.1-2.9.noarch.rpm"
RPM_HASH = "489091068253881ada90db25027748fa2763276d1b23e2fc3d9f7d6164c4abeb867570892222bfcaae5eefade3a6eeaa455ab41372a0759c7986041e0f6eafd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-archmage python3.10dist(archmage) python310-archmage python3dist(archmage)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python3-beautifulsoup4 python3-pychm python3-setuptools python3-sgmllib3k update-alternatives"

inherit rpm
