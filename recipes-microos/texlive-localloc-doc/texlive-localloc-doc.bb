SUMMARY = "Documentation for texlive-localloc"
DESCRIPTION = "This package includes the documentation for texlive-localloc"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn56496"

RPM_NAME = "texlive-localloc-doc-2023.201.svn56496-54.1.noarch.rpm"
RPM_HASH = "2d83f2a253da4e733b81d4a7bf669602e788239179233ff417de426a865848822d4e13faea11b8e0ed816d7df2a6d1c9457ccf1b0989e4ff2195fe8c27a75e52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-localloc-doc"
RDEPENDS:${PN} += ""

inherit rpm
