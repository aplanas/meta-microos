SUMMARY = "Validator for HTTP"
DESCRIPTION = "HTTPolice is a validator or linter for HTTP requests and responses. \
It can spot bad header syntax, inappropriate status codes, and other potential \
problems in your HTTP server or client."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-HTTPolice-0.9.0-4.14.noarch.rpm"
RPM_HASH = "84ef4dd05d93a9a3186fcc15c5fe4c13f8a066c26b9fe0b821304dc58977915d4aaa5656a71dedbc21c1c27b8f4a005dc2e46c5f50949d9a429d5acb10f660aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(httpolice) \
python311-HTTPolice \
python3dist(httpolice)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-Brotli \
python311-bitstring \
python311-defusedxml \
python311-dominate \
python311-lxml \
update-alternatives"

inherit rpm
