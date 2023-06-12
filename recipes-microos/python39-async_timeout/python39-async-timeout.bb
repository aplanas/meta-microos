SUMMARY = "Timeout context manager for asyncio programs"
DESCRIPTION = "This provides an asyncio-compatible timeout context manager."
LICENSE = "Apache-2.0"

PV = "4.0.2"

RPM_NAME = "python39-async_timeout-4.0.2-3.1.noarch.rpm"
RPM_HASH = "6b598be7ffe65721b70b7fd4a473ef33099bc57afad491c9eded408b5f2e02100a309761f2904659b8b844b48633c4b2b608b7a5afb25e199b06e4433e7cf3ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(async-timeout) \
python39-async-timeout \
python39-async_timeout \
python3dist(async-timeout)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
