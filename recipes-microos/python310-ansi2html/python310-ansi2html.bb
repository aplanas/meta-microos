SUMMARY = "Python module to convert text with ANSI color codes to HTML or LaTeX"
DESCRIPTION = "A module to convert text with ANSI color codes to HTML or to LaTeX."
LICENSE = "LGPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "python310-ansi2html-1.8.0-1.9.noarch.rpm"
RPM_HASH = "2813f650494070b550d29aaa8f88cd5b9f592af7e7e69a22169f53472e89d68dbe0c88c0aa9eb7c314db73b3e9f1ada596cc512172dee26483c477383a1d2351"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ansi2html python3.10dist(ansi2html) python310-ansi2html python3dist(ansi2html)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-six update-alternatives"

inherit rpm
