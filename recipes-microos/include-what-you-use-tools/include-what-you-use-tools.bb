SUMMARY = "Additional tools to use include-what-you-use effectively"
DESCRIPTION = "This package contains additional scripts for using include-what-you-use as automated \
refactoring tool."
LICENSE = "NCSA"

PV = "0.20"

RPM_NAME = "include-what-you-use-tools-0.20-1.1.noarch.rpm"
RPM_HASH = "74f9931424bd4556a31b09d726af8a2964a80ce333cb4824cc12f92b40d57db3517fd012849963ccc81d67dea11efddd71d41a4cf3cf38bdc716bd78cbc748ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "include-what-you-use-tools"
RDEPENDS:${PN} += "/usr/bin/python3 include-what-you-use"

inherit rpm
