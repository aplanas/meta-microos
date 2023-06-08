SUMMARY = "A plugin for flake8 finding likely bugs and design problems in your program"
DESCRIPTION = "A plugin for Flake8 finding likely bugs and design problems in your \
program.  Contains warnings that don't belong in pyflakes and \
pycodestyle."
LICENSE = "MIT"

PV = "23.3.23"

RPM_NAME = "python311-flake8-bugbear-23.3.23-1.1.noarch.rpm"
RPM_HASH = "626af65c6b64ab116db5bdf844b6473851b3422def72ec973604bb4eab059b3631a4a964ea3ee0eef770f4e31a28181f2c796c79feba4867d436f43d2f4401ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flake8-bugbear) python311-flake8-bugbear python3dist(flake8-bugbear)"
RDEPENDS:${PN} += "python(abi) python311-attrs python311-flake8"

inherit rpm
