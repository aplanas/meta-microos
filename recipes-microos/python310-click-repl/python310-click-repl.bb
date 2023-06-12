SUMMARY = "REPL plugin for Click"
DESCRIPTION = "REPL plugin for Click"
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-click-repl-0.2.0-2.3.noarch.rpm"
RPM_HASH = "effffbc04f1b979701c4d46608f836c9415e740a9818f24521fdc3513b6f90af705d8ecd58c2a21d851f93f1bc1e7e795545d2927d1ff42a3a0ae4357545dc12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-repl \
python3.10dist(click-repl) \
python310-click-repl \
python3dist(click-repl)"
RDEPENDS:${PN} += "python(abi) \
python310-click \
python310-prompt_toolkit \
python310-six"

inherit rpm
