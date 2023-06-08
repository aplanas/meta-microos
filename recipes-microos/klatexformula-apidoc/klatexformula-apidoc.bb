SUMMARY = "API documentation for KLatexFormula"
DESCRIPTION = "KLatexFormula is a graphical user interface for generating images \
from LaTeX equations. \
 \
This package contains the API documentation of the libraries libklfbackend and \
libklftool which are the different components of klatexformula."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "klatexformula-apidoc-4.1.0-1.13.noarch.rpm"
RPM_HASH = "947f091e32d91b0be01f15f960c5957d87025fa0feab709d4b2e6534c50389fd65e43450b7e12987b1469a2bba6d7794473f12cad697fb6379c57a8fa28ac72a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "klatexformula-apidoc"
RDEPENDS:${PN} += "klatexformula"

inherit rpm
