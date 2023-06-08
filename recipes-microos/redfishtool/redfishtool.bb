SUMMARY = "A CLI tool for accessing the Redfish API"
DESCRIPTION = "redfishtool is a commandline tool that implements the client side \
of the Redfish RESTful API for Data Center Hardware Management."
LICENSE = "BSD-3-Clause"

PV = "1.1.5"

RPM_NAME = "redfishtool-1.1.5-1.7.noarch.rpm"
RPM_HASH = "c6e13d8f727254bdfa35e726b57058d4e0f7ff08a10e27c2f6250bc2648b6e37560583a4e669832d43232547cd2da3c3011fba8611f42539a5d4793202fb4fb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(redfishtool) python3dist(redfishtool) redfishtool"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-requests"

inherit rpm
