SUMMARY = "ANSI text color library for Python"
DESCRIPTION = "Yet another ANSI color text library for Python. It provides 'auto \
colors' for dark/light terminals. \
 \
In Python 2.x, this library subclasses `unicode`, while on \
Python 3.x, it subclasses `str`."
LICENSE = "MIT"

PV = "2.2.2"

RPM_NAME = "python39-colorclass-2.2.2-2.1.noarch.rpm"
RPM_HASH = "1df0d3affe1698a449cd2de03c4c28571964bafd801d29af3162df0125a08fd0eb3b8c1ec62701d8ab9b2e60c0a90a540fc00af21472aa630cbebfe3d577b804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(colorclass) python39-colorclass python3dist(colorclass)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
