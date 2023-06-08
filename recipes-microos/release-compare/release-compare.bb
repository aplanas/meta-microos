SUMMARY = "Release Compare Script"
DESCRIPTION = "This package contains scripts to create changelog files relative \
to last released result. \
 \
Note: you need to use a releasetarget definition in your OBS repository \
      to get this working. And the release target needs to have published binaries."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.6"

RPM_NAME = "release-compare-0.5.6-1.4.noarch.rpm"
RPM_HASH = "5158f96d16287403f44fb5557d74d787e4b00cfdf712115897e050c653bd9f8321d7a17337f033ca1b375c511f81c3dc68a6f1b3023639b51d0983efc904c2b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "release-compare"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
