SUMMARY = "Python library for the HTTP/2 Apple Push Notification Service"
DESCRIPTION = "A python library for interacting with the Apple Push Notification Service \
via HTTP/2 protocol."
LICENSE = "MIT"

PV = "0.7.2"

RPM_NAME = "python311-apns2-0.7.2-2.3.noarch.rpm"
RPM_HASH = "58300e08e9650f49b9c7b126b26df602866f96e8ed83a0ee468c50c7ae1f3fa5fd632051fed59a60ab6fa87e19a586ada0f5f983e4c65623bcd4c457c116793f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(apns2) python311-apns2 python3dist(apns2)"
RDEPENDS:${PN} += "python(abi) python311-PyJWT python311-cryptography python311-h2 python311-httpx"

inherit rpm
