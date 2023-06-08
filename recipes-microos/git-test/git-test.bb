SUMMARY = "Git extension to conveniently test all distinct versions"
DESCRIPTION = "Run tests on each distinct tree in a revision list, skipping versions whose \
contents have already been tested."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "git-test-1.0.4-1.8.noarch.rpm"
RPM_HASH = "3dc03a90238216603b0364488baf29710cb3b788d4d636fcde7883412289812bf16eca1dacfe48698550d1105400e6192aece74df0c43e892232d1065e07930b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-test"
RDEPENDS:${PN} += "/bin/bash git-core"

inherit rpm
