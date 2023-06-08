SUMMARY = "An Asynchronous Server Gateway Interface server"
DESCRIPTION = "Uvicorn is an ASGI server implementation, using uvloop and httptools. \
It supports HTTP/1.1 and WebSockets only."
LICENSE = "BSD-3-Clause"

PV = "0.20.0"

RPM_NAME = "python39-uvicorn-0.20.0-3.1.noarch.rpm"
RPM_HASH = "cc7b603da7156570c73572caf71e47538d7cb6be9b6959ffb43b810ffb8c7d823edfd6cab125213a1c04319c43da9ad0301b5c1a76309ea9cdb884fb033ea23a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(uvicorn) python39-uvicorn python3dist(uvicorn)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-click python39-h11 update-alternatives"

inherit rpm
