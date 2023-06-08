SUMMARY = "Get the currently executing AST node of a frame, and other information"
DESCRIPTION = "Get the currently executing AST node of a frame, and other information"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-executing-1.2.0-2.1.noarch.rpm"
RPM_HASH = "a4e8cad27466ec89f369b561c7bb397de4a8f648305c209b86ac19b025539fd5c94ea2f143a72e123d2c4a10a0b1a27b4871be45126c3892d65ebec415b4cecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(executing) python311-executing python3dist(executing)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
