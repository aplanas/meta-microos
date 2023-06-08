SUMMARY = "Python module to convert text with ANSI color codes to HTML or LaTeX"
DESCRIPTION = "A module to convert text with ANSI color codes to HTML or to LaTeX."
LICENSE = "LGPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "python311-ansi2html-1.8.0-1.9.noarch.rpm"
RPM_HASH = "2bfd2dc7121482ea0492e8fbeec9483c8094ef455a198217698af606b6e37f28a85ec3a4505d42af8d4a5cfc09f074e03e66d1634d74ad86540d3f2ecfdd7573"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ansi2html) python311-ansi2html python3dist(ansi2html)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-six update-alternatives"

inherit rpm
