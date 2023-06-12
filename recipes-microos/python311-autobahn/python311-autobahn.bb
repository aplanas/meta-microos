SUMMARY = "WebSocket and WAMP in Python for Twisted and asyncio"
DESCRIPTION = "WebSocket allows bidirectional real-time messaging on the Web and WAMP adds \
asynchronous Remote Procedure Calls and Publish & Subscribe on top of WebSocket."
LICENSE = "MIT"

PV = "22.7.1"

RPM_NAME = "python311-autobahn-22.7.1-1.5.aarch64.rpm"
RPM_HASH = "371ff2e05001febcdf1cdebb328be19bb46a85ee972b227303dd4f6b85b1034b8c31b05521c86835bd53f43789b33f170616cb22640ba55d79c0c150b0b7b086"

RPROVIDES:${PN} += "python3.11dist(autobahn) \
python311-autobahn \
python311-autobahn(aarch-64) \
python3dist(autobahn)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-PyNaCl \
python311-PyQRCode \
python311-Twisted \
python311-argon2-cffi \
python311-attrs \
python311-cbor \
python311-cbor2 \
python311-cffi \
python311-flatbuffers \
python311-hyperlink \
python311-lz4 \
python311-msgpack \
python311-passlib \
python311-py-ubjson \
python311-pyOpenSSL \
python311-pytrie \
python311-service_identity \
python311-txaio \
python311-ujson \
python311-wsaccel \
python311-zope.interface \
update-alternatives"

inherit rpm
