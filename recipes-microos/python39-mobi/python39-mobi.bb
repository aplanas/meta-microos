SUMMARY = "Library for unpacking unencrypted mobi files"
DESCRIPTION = "Python library for unpacking unencrypted mobi files (forked from KindleUnpack)"
LICENSE = "GPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "python39-mobi-0.3.3-1.4.noarch.rpm"
RPM_HASH = "4910bcc5e13a02dff85eb684ffae28f448f93e4533060a5a68b82389110f4d5bc3f996e52852e2a920ada067a19294669417b43a3b7b721dae29c6f783e97b2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mobi) \
python39-mobi \
python3dist(mobi)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-loguru"

inherit rpm
