SUMMARY = "Library to detect surrounding shell"
DESCRIPTION = "Python library to detect surrounding shell."
LICENSE = "ISC"

PV = "1.5.0"

RPM_NAME = "python311-shellingham-1.5.0-2.1.noarch.rpm"
RPM_HASH = "870d7c4d6d97027f2ea4038241384c7b546cd543fb217a63124d49409e4e1bf6e49191f7098a775d4024a036cbe479915f5ecc94f0b55b5932423bb257072c86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(shellingham) python311-shellingham python3dist(shellingham)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
