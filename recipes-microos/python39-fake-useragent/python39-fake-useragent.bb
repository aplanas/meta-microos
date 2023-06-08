SUMMARY = "Useragent faker package for Python"
DESCRIPTION = "Useragent faker with real world database."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "python39-fake-useragent-1.1.3-1.1.noarch.rpm"
RPM_HASH = "8a809a2f9b17661f758cfe37dc06de30c2ed8c1ddd333c18f99f145e347123bfcf69ee54d7226a230a262624bd740251443fb1afdd761010d9951d2162187691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fake-useragent) python39-fake-useragent python3dist(fake-useragent)"
RDEPENDS:${PN} += "python(abi) python39-importlib-resources"

inherit rpm
