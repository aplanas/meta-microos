SUMMARY = "Documentation for texlive-luamplib"
DESCRIPTION = "This package includes the documentation for texlive-luamplib"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.23.0svn61587"

RPM_NAME = "texlive-luamplib-doc-2023.201.2.23.0svn61587-52.1.noarch.rpm"
RPM_HASH = "5750c974d4d0f757eed23112fd3c0f4f44e94da10e17368063776cc5855d5ba8ba03150dcba694fa6d2ef6f041665a4bebb58bae81b2b25f8597b8646f26b9a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luamplib-doc"
RDEPENDS:${PN} += ""

inherit rpm
