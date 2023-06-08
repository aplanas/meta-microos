SUMMARY = "An Asynchronous Server Gateway Interface server"
DESCRIPTION = "Uvicorn is an ASGI server implementation, using uvloop and httptools. \
It supports HTTP/1.1 and WebSockets only."
LICENSE = "BSD-3-Clause"

PV = "0.20.0"

RPM_NAME = "python310-uvicorn-0.20.0-3.1.noarch.rpm"
RPM_HASH = "db6d5657121073b63b9124e5fb751cb71fbb21a8e6dfc299d5387df5c2ebe3d297d6d564e087a2235b43d278da4a5d9a15b970edb545303db40436ab003d8270"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uvicorn python3.10dist(uvicorn) python310-uvicorn python3dist(uvicorn)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-click python310-h11 update-alternatives"

inherit rpm
