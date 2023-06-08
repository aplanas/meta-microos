SUMMARY = "Pure-Python HPACK header compression"
DESCRIPTION = "This module contains a pure-Python HTTP/2 header encoding (HPACK) logic for use in \
Python programs that implement HTTP/2. It also contains a compatibility layer that \
automatically enables the use of nghttp2 if it’s available."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python310-hpack-4.0.0-2.1.noarch.rpm"
RPM_HASH = "2ebad43c97cd4cefd2a0b924e4e402a10b5140564fafaf653f49ad08f0c61a336ba03b5f4b30c51e0fe1a33582ec9f069b0a9ce500fb8ab571e04e191c7e8c0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hpack python3.10dist(hpack) python310-hpack python3dist(hpack)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
