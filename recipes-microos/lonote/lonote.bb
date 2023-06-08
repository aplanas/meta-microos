SUMMARY = "A personal note-taking application"
DESCRIPTION = "Lonote is a personal note-taking application based on python3 \
and modern browsers. \
It features in well interact UI, minimal design, structural notes, \
auto reloading, archiving and versioning."
LICENSE = "Apache-2.0 & GPL-3.0-only"

PV = "3.2.13"

RPM_NAME = "lonote-3.2.13-3.7.noarch.rpm"
RPM_HASH = "007e2c7ddf2bc79f6e39ce91cd0d2ee0054055d791ef49f28daf002a18b4ac982d7354968cfe1cc5926222fd1195c315acc3afe6b267c9f9a4fde0ed5c01c6d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(lonote.desktop) lonote metainfo() metainfo(lonote.appdata.xml) python3.10dist(lonote) python3dist(lonote)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-dbm python3-xml"

inherit rpm
