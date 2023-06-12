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

RPM_NAME = "python311-pybtex-0.24.0-2.2.noarch.rpm"
RPM_HASH = "f82b8e3002942db490166abb255ca58d7a11c53010dcb78244c442323c96f8a12e9f6b33c73d5612c6f7283d18a6ab1eef27ebf5bc737ec7423635a0d70174e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pybtex) \
python311-pybtex \
python3dist(pybtex)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-latexcodec \
python311-pyparsing \
update-alternatives"

inherit rpm
