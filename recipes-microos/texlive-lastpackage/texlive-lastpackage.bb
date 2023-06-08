SUMMARY = "Indicates the last loaded package"
DESCRIPTION = "This package may be used to define the last point where some \
code shall be executed. Its provides a package name for use in \
package-placing commands from the author's templatetools. Usage \
examples are provided in the documentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn34481"

RPM_NAME = "texlive-lastpackage-2023.201.0.0.1svn34481-55.1.noarch.rpm"
RPM_HASH = "ba6b4042cba99a00d1835cb18d9b42731f521da364aa3653a5b7f222d2a070adda6c9de48c4fae42e79e2a284ef45e54ad8b2fa189f235a52eaf7123d3aff89e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lastpackage.sty) texlive-lastpackage"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
