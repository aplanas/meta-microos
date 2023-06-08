SUMMARY = "Read & Write Java Properties Files"
DESCRIPTION = "Read & write Java .properties files."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python310-javaproperties-0.8.1-1.1.noarch.rpm"
RPM_HASH = "664485fd41f401aa01cbdd2a9e9f8ca05c693df0d21d6916ccd2757fe77b38911cfa8b463ddfcf602add1095cc9158398eeecb7b5a91f7d522de2a2f1f45554f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-javaproperties python3.10dist(javaproperties) python310-javaproperties python3dist(javaproperties)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
