SUMMARY = "A library to manipulate gettext files"
DESCRIPTION = "polib allows you to manipulate, create, modify gettext catalogs (.pot, .po and \
binary .mo files). You can load existing files, iterate through it's entries, \
add, modify entries, comments or metadata, etc... or create new po/pot files \
from scratch. \
 \
polib provides a simple and pythonic API, exporting only two convenience \
functions 'pofile' and 'mofile', and the 4 core classes: POFile, MOFile, \
POEntry and MOEntry for creating new files/entries."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-polib-1.1.1-1.8.noarch.rpm"
RPM_HASH = "2d55a3cd8f905da4e0f9bfc67051bae7c5155d0157486aa5c8c76f9a87b0525ce9e50c75b9b04fd2dca44964ef4178602d67b0f79933bbad4f251259bcc243de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(polib) python39-polib python3dist(polib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
