SUMMARY = "Documentation for texlive-a2ping"
DESCRIPTION = "This package includes the documentation for texlive-a2ping"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.84psvn52964"

RPM_NAME = "texlive-a2ping-doc-2023.201.2.84psvn52964-54.1.noarch.rpm"
RPM_HASH = "aff106da294637c75f9815fadcbc4592bcef75d219fc98439df592e0b207dc7b4350e4d4562fe26989f87d957a5e71ab43dcccee40f19fd31d57a24c2cab573f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(a2ping.1) \
texlive-a2ping-doc"
RDEPENDS:${PN} += ""

inherit rpm
