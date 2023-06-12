SUMMARY = "A flexible and scriptable password generator which generates strong passphrases"
DESCRIPTION = "A flexible and scriptable password generator which generates strong passphrases, \
inspired by XKCD 936 (https://xkcd.com/936/)"
LICENSE = "BSD-3-Clause"

PV = "1.19.3"

RPM_NAME = "python311-xkcdpass-1.19.3-2.3.noarch.rpm"
RPM_HASH = "7a9d6ba4f20e3f5495c7bd648b4ee3d4f7dc92a051c70b55dac38b79c725bc792c8b6260076c0e1cdde79944b0cd22afcabbf4b042499e06f14c53e906148054"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xkcdpass) \
python311-xkcdpass \
python3dist(xkcdpass)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
