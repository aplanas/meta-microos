SUMMARY = "ANSI colors for Python"
DESCRIPTION = "Add ANSI colors and decorations to your strings."
LICENSE = "ISC"

PV = "1.1.8"

RPM_NAME = "python39-ansicolors-1.1.8-3.14.noarch.rpm"
RPM_HASH = "e5123660e0913b3faad73591c09399c3806f714a722bfbea74d6b0a1b89c7c4454dc0032edfe6ebeed555f05545ae3f7df0f70e13862c8df5cc2f912060bbaae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ansicolors) python39-ansicolors python3dist(ansicolors)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
