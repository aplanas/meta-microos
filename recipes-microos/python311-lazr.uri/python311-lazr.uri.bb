SUMMARY = "Code for parsing and dealing with URI"
DESCRIPTION = "The lazr.uri package includes code for parsing and dealing with URIs."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "python311-lazr.uri-1.0.6-1.8.noarch.rpm"
RPM_HASH = "9bb9bfba36f5c8fa43c3a7a086a9cd88d75543f4c81bac04bfc4cacd721939ef5da96eef8705f88deb675e99c8a95798e560c816c57b9eb38514d81ecc3925d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(lazr.uri) \
python311-lazr.uri \
python3dist(lazr.uri)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
