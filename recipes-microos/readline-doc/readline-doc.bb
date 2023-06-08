SUMMARY = "Documentation how to Use and Program with the Readline Library"
DESCRIPTION = "This package contains the documentation for using the readline library \
as well as programming with the interface of the readline library."
LICENSE = "GPL-3.0-or-later"

PV = "8.2"

RPM_NAME = "readline-doc-8.2-2.3.noarch.rpm"
RPM_HASH = "83d3abcee1d87c1f3337b4ced2fddae877e186192e697e351ebd993dd21fa9a766bda831be971576160095a0a3403da171dabf9ef3bb6cd4dd2264a647007bf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "readline-doc readline:/usr/share/info/readline.info.gz"
RDEPENDS:${PN} += ""

inherit rpm
