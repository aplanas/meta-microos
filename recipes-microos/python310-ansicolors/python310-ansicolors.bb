SUMMARY = "ANSI colors for Python"
DESCRIPTION = "Add ANSI colors and decorations to your strings."
LICENSE = "ISC"

PV = "1.1.8"

RPM_NAME = "python310-ansicolors-1.1.8-3.14.noarch.rpm"
RPM_HASH = "29ec20143afd3a275cc94d0287e0ed5b23a4f1d4e90ee7e52d990bb834842d81b22e14b691269122a782be6ea92076b3e724f7528ca6d6ff21b0a72b33890148"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ansicolors python3.10dist(ansicolors) python310-ansicolors python3dist(ansicolors)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
