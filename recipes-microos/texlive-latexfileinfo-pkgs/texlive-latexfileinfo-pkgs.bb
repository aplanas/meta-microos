SUMMARY = "A comparison of packages showing LaTeX file information"
DESCRIPTION = "The package provides an HTML file that lists and compares CTAN \
packages that display LaTeX source file information from \
\\ProvidesClass, \\ProvidesFile, and \\ProvidesPackage commands in \
the LaTeX file. Five packages of the author's, and several \
other packages are discussed; revision control systems are \
mentioned briefly."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.22svn26760"

RPM_NAME = "texlive-latexfileinfo-pkgs-2023.201.0.0.22svn26760-54.1.noarch.rpm"
RPM_HASH = "717021fa067273478615823dfd6a8e4a0ddb467aed48108ed6224490c074027831dac3d6f974e158fa5c74edca00a770f8549024ad6a86989145e5fe5b0384e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexfileinfo-pkgs"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
