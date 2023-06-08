SUMMARY = "Documentation for texlive-captcont"
DESCRIPTION = "This package includes the documentation for texlive-captcont"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn15878"

RPM_NAME = "texlive-captcont-doc-2023.201.2.0svn15878-52.1.noarch.rpm"
RPM_HASH = "5e40497ed2dcacdfd4cd82ce0aa6ada059b02f40b633a847e541bd3ba9da1a00e4538b472060745ecf949ec4f8e0872f469fa54d07df4fd7a7a7e2fd34811979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-captcont-doc"
RDEPENDS:${PN} += ""

inherit rpm
