SUMMARY = "An Asynchronous Server Gateway Interface server"
DESCRIPTION = "Uvicorn is an ASGI server implementation, using uvloop and httptools. \
It supports HTTP/1.1 and WebSockets only."
LICENSE = "BSD-3-Clause"

PV = "0.20.0"

RPM_NAME = "python311-uvicorn-0.20.0-3.1.noarch.rpm"
RPM_HASH = "b495722a26bde8a8b8d16ad09be4285dae5c566d930429a91f31ba56ce6149fc88c3af1cddf838050c7718f8a4d23802feb4e88ca7a0370d7db5d4505c895cf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(uvicorn) python311-uvicorn python3dist(uvicorn)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-click python311-h11 update-alternatives"

inherit rpm
