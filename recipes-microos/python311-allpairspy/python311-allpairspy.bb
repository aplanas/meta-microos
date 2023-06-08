SUMMARY = "Pairwise test combinations generator"
DESCRIPTION = "Pairwise test combinations generator."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python311-allpairspy-2.5.0-2.3.noarch.rpm"
RPM_HASH = "b314be18ba258692b18dc35cf785bccbcd6b3d4bc621a6f54818a8f6fc1bdec21f6ce776fde0c63b87b57dbf709f462548ff587e8278dd0caa815aad89f546b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(allpairspy) python311-allpairspy python3dist(allpairspy)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
