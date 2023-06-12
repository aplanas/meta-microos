SUMMARY = "Python library for the HTTP/2 Apple Push Notification Service"
DESCRIPTION = "A python library for interacting with the Apple Push Notification Service \
via HTTP/2 protocol."
LICENSE = "MIT"

PV = "0.7.2"

RPM_NAME = "python310-apns2-0.7.2-2.3.noarch.rpm"
RPM_HASH = "222d6ccbd5c151fd58516ddda13c70fa348ed8138de050026ae17a0c724a17217d269485f678ee29af3b75c630ed3f33599120496fa1603c92a6112663840ab2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apns2 \
python3.10dist(apns2) \
python310-apns2 \
python3dist(apns2)"
RDEPENDS:${PN} += "python(abi) \
python310-PyJWT \
python310-cryptography \
python310-h2 \
python310-httpx"

inherit rpm
