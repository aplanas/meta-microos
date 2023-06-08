SUMMARY = "Chinese documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Chinese documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.2"

RPM_NAME = "kicad-doc-zh-7.0.2-1.1.noarch.rpm"
RPM_HASH = "833291f98282e92dca79b554395169b29f3c229f1d6a36c819805947005d1cb19760744031bbaa622e5ab868045d2bf8a39c45efc145769d77609cb74f01f1d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-zh locale(kicad-doc:zh)"
RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
