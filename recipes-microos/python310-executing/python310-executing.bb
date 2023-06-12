SUMMARY = "Get the currently executing AST node of a frame, and other information"
DESCRIPTION = "Get the currently executing AST node of a frame, and other information"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-executing-1.2.0-2.1.noarch.rpm"
RPM_HASH = "12ad7a8e75048722c2a521430f2f96fe3c850d926735228337139af78a9058ac237999866fbbf90eb7e847682d2fbdc0e3d48938d27528a2072282f4e19f57a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-executing \
python3.10dist(executing) \
python310-executing \
python3dist(executing)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
