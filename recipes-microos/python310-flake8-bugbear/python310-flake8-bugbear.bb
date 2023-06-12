SUMMARY = "A plugin for flake8 finding likely bugs and design problems in your program"
DESCRIPTION = "A plugin for Flake8 finding likely bugs and design problems in your \
program.  Contains warnings that don't belong in pyflakes and \
pycodestyle."
LICENSE = "MIT"

PV = "23.5.9"

RPM_NAME = "python310-flake8-bugbear-23.5.9-1.1.noarch.rpm"
RPM_HASH = "a7f29d0727dd2cee4d395fc5489abd881a5e6fcea912b8d3343950703af5afbe6e80bb8605b805cda14a66850701b426dabd4a1512f307be18207b9448bd39de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-bugbear python3.10dist(flake8-bugbear) python310-flake8-bugbear python3dist(flake8-bugbear)"
RDEPENDS:${PN} += "python(abi) python310-attrs python310-flake8"

inherit rpm
