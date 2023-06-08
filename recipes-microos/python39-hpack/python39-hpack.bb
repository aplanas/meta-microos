SUMMARY = "Pure-Python HPACK header compression"
DESCRIPTION = "This module contains a pure-Python HTTP/2 header encoding (HPACK) logic for use in \
Python programs that implement HTTP/2. It also contains a compatibility layer that \
automatically enables the use of nghttp2 if it’s available."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python39-hpack-4.0.0-2.1.noarch.rpm"
RPM_HASH = "a691df021e70e8a20fee0f0ae8d2a64c219e43cd4acd25ad6b0a37ad66c5583c4a2b5e5ab7e059df2aa18e4332d0a9d58a97344c5e41f013e5052b9d42d0de81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hpack) python39-hpack python3dist(hpack)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
