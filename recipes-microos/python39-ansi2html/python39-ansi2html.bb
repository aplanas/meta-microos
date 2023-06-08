SUMMARY = "Python module to convert text with ANSI color codes to HTML or LaTeX"
DESCRIPTION = "A module to convert text with ANSI color codes to HTML or to LaTeX."
LICENSE = "LGPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "python39-ansi2html-1.8.0-1.9.noarch.rpm"
RPM_HASH = "3088ebd492a208cda3e70056ba6e5930502b0deeee2a2df21418f09a35c4ac5fac501ae48887ede11b39cfbc7e3ce0ba0881acd90af080064ffe2cf645e8af1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ansi2html) python39-ansi2html python3dist(ansi2html)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-six update-alternatives"

inherit rpm
