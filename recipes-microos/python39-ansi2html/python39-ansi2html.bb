SUMMARY = "Python module to convert text with ANSI color codes to HTML or LaTeX"
DESCRIPTION = "A module to convert text with ANSI color codes to HTML or to LaTeX."
LICENSE = "LGPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "python39-ansi2html-1.8.0-2.1.noarch.rpm"
RPM_HASH = "f858b11e8be9da257b8671b85b096bc1cce0ab694be5ad006d19ab893c60cf2f07d7faa2d28e9412b5ae31fd9ee58e17aa6858187803012e47f6067800f3b2cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ansi2html) python39-ansi2html python3dist(ansi2html)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-six update-alternatives"

inherit rpm
