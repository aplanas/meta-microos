SUMMARY = "Documentation for texlive-bibarts"
DESCRIPTION = "This package includes the documentation for texlive-bibarts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.5svn64579"

RPM_NAME = "texlive-bibarts-doc-2023.201.2.5svn64579-53.1.noarch.rpm"
RPM_HASH = "17ec4187e3f52fc0bdb74c63d204aec035a9c0e51af64f5e3efd608ecab0db33e073aa806fc7dc17cb694e34a6a3d0d9e92b2605fce180edd648abfbf3e79f83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-bibarts-doc:de) \
texlive-bibarts-doc"
RDEPENDS:${PN} += ""

inherit rpm
