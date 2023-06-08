SUMMARY = "Colorization of help messages in Click"
DESCRIPTION = "Colorization of help messages in Click"
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python310-click-help-colors-0.9.1-1.8.noarch.rpm"
RPM_HASH = "bf5bbf9f160a40baf5e2c2e8521d279a7465ff36f33c37fa9b9b40fa6bd585157d7b9899928ef29f4a16c60b57cc382b83f1c1061e32f81b4f3b94bae93b9de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-help-colors python3.10dist(click-help-colors) python310-click-help-colors python3dist(click-help-colors)"
RDEPENDS:${PN} += "python(abi) python310-click"

inherit rpm
