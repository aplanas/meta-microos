SUMMARY = "Python Documentation Utilities"
DESCRIPTION = "Docutils is a modular system for processing documentation into useful formats, \
such as HTML, XML, and LaTeX. For input Docutils supports reStructuredText, an \
easy-to-read, what-you-see-is-what-you-get plaintext markup syntax."
LICENSE = "BSD-2-Clause & Python-2.0 & GPL-2.0-or-later & GPL-3.0-or-later & SUSE-Public-Domain"

PV = "0.19"

RPM_NAME = "python311-docutils-0.19-4.1.noarch.rpm"
RPM_HASH = "7800320b9a220997016607e2e7e49f2a12376fc59c5daf1e7664ce33770f990aa84acf2372e299dbc899af3519d782b5a43f761fa06fd9a529b7076037b3650f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(docutils) python311-docutils python3dist(docutils)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-packaging python311-xml update-alternatives"

inherit rpm
