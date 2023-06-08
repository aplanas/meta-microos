SUMMARY = "Package to replace curses and create ASCII animations"
DESCRIPTION = "Asciimatics is a package to help people create full-screen text UIs \
(from interactive forms to ASCII animations) on any platform."
LICENSE = "Apache-2.0"

PV = "1.14.0"

RPM_NAME = "python310-asciimatics-1.14.0-1.3.noarch.rpm"
RPM_HASH = "70774e308af83771e31ec119b32dccb41ad707e8cf391919706b89aba95e0d6470a56a435d02cd63b44d08a868a5edbea4fd3cc6e6e3d9cbab624639015c9ba1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asciimatics python3.10dist(asciimatics) python310-asciimatics python3dist(asciimatics)"
RDEPENDS:${PN} += "python(abi) python310-Pillow python310-curses python310-future python310-pyfiglet python310-wcwidth"

inherit rpm
