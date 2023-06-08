SUMMARY = "Documentation for texlive-modulus"
DESCRIPTION = "This package includes the documentation for texlive-modulus"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn47599"

RPM_NAME = "texlive-modulus-doc-2023.201.1.0svn47599-54.1.noarch.rpm"
RPM_HASH = "607c85ad9fa4c17df1c42cd812dd82606fb4f03c9f52b0908951593f863ecb9b1c9f74d745a1f61959fdc0f510b17cf7dd2462aa65eef5dfac3eb16f8c7f0683"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-modulus-doc"
RDEPENDS:${PN} += ""

inherit rpm
