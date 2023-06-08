SUMMARY = "A plugin for flake8 finding likely bugs and design problems in your program"
DESCRIPTION = "A plugin for Flake8 finding likely bugs and design problems in your \
program.  Contains warnings that don't belong in pyflakes and \
pycodestyle."
LICENSE = "MIT"

PV = "23.3.23"

RPM_NAME = "python310-flake8-bugbear-23.3.23-1.1.noarch.rpm"
RPM_HASH = "7bcc267dbcb192aebcc63b72c6df74b9e6638711f38895914ddc072ef88af5f70454f7c78959849772c7ae85cfac5d9f1e34d260b9a15fdd35a3085434fad612"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-bugbear python3.10dist(flake8-bugbear) python310-flake8-bugbear python3dist(flake8-bugbear)"
RDEPENDS:${PN} += "python(abi) python310-attrs python310-flake8"

inherit rpm
