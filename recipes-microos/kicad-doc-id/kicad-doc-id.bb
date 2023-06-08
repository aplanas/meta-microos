SUMMARY = "Indonesian documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Indonesian documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.2"

RPM_NAME = "kicad-doc-id-7.0.2-1.1.noarch.rpm"
RPM_HASH = "9c958f777eaf41d91f28bcd20baa6ad17c6ff3a6840455c6f3c751acadaa3b7a7dd14ea75a5252b66f3fe5210f007412b5922f08444969db7ffdb1a4824ffe89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-id locale(kicad-doc:id)"
RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
