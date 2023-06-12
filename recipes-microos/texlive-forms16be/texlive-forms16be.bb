SUMMARY = "Initialize form properties using big-endian encoding"
DESCRIPTION = "This package provides support for UTF-16BE Unicode character \
encoding (called a big-endian character string) for the text \
string type (PDF Reference, version 1.7, beginning on page \
158). Text strings are used in 'text annotations, bookmark \
names, article threads, document information, and so forth' (to \
partially quote page 158). The particular application is to set \
property values of form fields, at least those properties that \
take the text strings as its value. The package contains \
support for Basic Latin plus the ability to enter any unicode \
character using the notation \\uXXXX, where XXXX are four hex \
digits. The Package works for dvips/Distiller, pdfLaTeX, \
LuaLaTeX, and XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn51305"

RPM_NAME = "texlive-forms16be-2023.201.1.3svn51305-52.1.noarch.rpm"
RPM_HASH = "2dcb4b3ec3b4c0d56f8db9fa8cda59f628ab835c01e305641b268757f9edf5cd7c9e5dae2c4316d2e6fb416720667dceaa5907644aee6de6b1dfc89042c243ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(forms16be.sty) \
tex(uni4basic-latin.def) \
texlive-forms16be"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
