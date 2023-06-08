SUMMARY = "A plugin for flake8 finding likely bugs and design problems in your program"
DESCRIPTION = "A plugin for Flake8 finding likely bugs and design problems in your \
program.  Contains warnings that don't belong in pyflakes and \
pycodestyle."
LICENSE = "MIT"

PV = "23.3.23"

RPM_NAME = "python39-flake8-bugbear-23.3.23-1.1.noarch.rpm"
RPM_HASH = "ff7814564c890e56e5cf08a83f3081c6ce5421cb812c5ee1cc1798fa9c192c656c22279063b808be994efd69371265c882a471ea9f01438962ffe0dbe52452ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flake8-bugbear) python39-flake8-bugbear python3dist(flake8-bugbear)"
RDEPENDS:${PN} += "python(abi) python39-attrs python39-flake8"

inherit rpm
