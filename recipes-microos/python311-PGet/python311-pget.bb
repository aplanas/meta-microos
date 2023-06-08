SUMMARY = "Download tool using chunks"
DESCRIPTION = "A tool and library to save large files by creating multiple connections."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python311-PGet-0.5.1-1.9.noarch.rpm"
RPM_HASH = "b4c96257b4a3833f3bd868b18437552435ac4b08ce5afd85c17e744140734845cbc0ab96b043aa3853b41c084b175d672dd22cfc133fc36078b8715a0ef156fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pget) python311-PGet python3dist(pget)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-requests update-alternatives"

inherit rpm
