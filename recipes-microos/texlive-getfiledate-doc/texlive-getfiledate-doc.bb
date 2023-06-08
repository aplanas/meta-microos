SUMMARY = "Documentation for texlive-getfiledate"
DESCRIPTION = "This package includes the documentation for texlive-getfiledate"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn16189"

RPM_NAME = "texlive-getfiledate-doc-2023.201.1.2svn16189-52.1.noarch.rpm"
RPM_HASH = "1d63ddaebb133ef2ac45ebe54f13b8c187548294f7006d3211b32afab49aa3620af2ff71bbffd135001566da23c9f3059e8bf66713a882b4eda411dfd2096496"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-getfiledate-doc"
RDEPENDS:${PN} += ""

inherit rpm
