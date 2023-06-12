SUMMARY = "Documentation for texlive-biblatex-fiwi"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-fiwi"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn45876"

RPM_NAME = "texlive-biblatex-fiwi-doc-2023.201.1.7svn45876-53.1.noarch.rpm"
RPM_HASH = "925f85eeede408a59c5bd3bd91d8ccd6a6b7a7b3ea1de44d841e686cfa9d21455b10340a9a923dc7a97c317120720c6bc2867eb35e028d5157421577d5450658"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-biblatex-fiwi-doc:de) \
texlive-biblatex-fiwi-doc"
RDEPENDS:${PN} += ""

inherit rpm
