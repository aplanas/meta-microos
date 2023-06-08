SUMMARY = "Read & Write Java Properties Files"
DESCRIPTION = "Read & write Java .properties files."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python311-javaproperties-0.8.1-1.1.noarch.rpm"
RPM_HASH = "4d923ac67fe4b409b2206ec5478b8b7d0f6bf17272f66e18ef70678412159e026ffb201c8e5fc810307187ed8c1d74129d8dc57a5e71bbebdf73422f87f73426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(javaproperties) python311-javaproperties python3dist(javaproperties)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
