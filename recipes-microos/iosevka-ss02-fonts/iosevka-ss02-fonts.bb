SUMMARY = "Iosevka in monospace, Anonymous Pro style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS02 typeface (monospace, Anonymous Pro \
style)."
LICENSE = "OFL-1.1"

PV = "22.1.0"

RPM_NAME = "iosevka-ss02-fonts-22.1.0-1.1.noarch.rpm"
RPM_HASH = "da94f39bcd7bf7f8319e4677b9fe9416acb20d919af3cc8c5bb0e980fc6b42f433f2417343ef660bec0b6c15aa3f52614a2f1966bc4c994108d6d1eec75189fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss02-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
