SUMMARY = "BibTeX-compatible Bibliography Processor in Python"
DESCRIPTION = "Pybtex is a BibTeX-compatible bibliography processor written in Python which \
can produce formatted bibliographies in different, customizable formats. It \
supports both native BibTeX style files and styles written in Python and \
accepts BibTeX, BibTeXML, and a custom YAML-based bibligraphy input format and \
can output LaTeX, HTML, and plain text. \
 \
Furthermore, Pybtex provides an interface for Python applications which need to \
process the above formats."
LICENSE = "MIT"

PV = "0.24.0"

RPM_NAME = "python39-pybtex-0.24.0-2.2.noarch.rpm"
RPM_HASH = "e2de9f176c29b2b5bca5329a24cc5e9b865312298a9adebc95139a39100d072b2fa3e686ed96a19e8b0a3f53f1332474563d705fe957882a51b5069ec7db1b2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pybtex) python39-pybtex python3dist(pybtex)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-latexcodec python39-pyparsing update-alternatives"

inherit rpm
