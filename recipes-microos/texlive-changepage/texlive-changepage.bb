SUMMARY = "Margin adjustment and detection of odd/even pages"
DESCRIPTION = "The package provides commands to change the page layout in the \
middle of a document, and to robustly check for typesetting on \
odd or even pages. Instructions for use are at the end of the \
file. The package is an extraction of code from the memoir \
class, whose user interface it shares. It is intended the this \
package will eventually replace the chngpage package, which is \
distributed with the package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0csvn15878"

RPM_NAME = "texlive-changepage-2023.201.1.0csvn15878-52.1.noarch.rpm"
RPM_HASH = "f4705e6fdcc14614b167f108ea37aeeb150c22ab8cdabcaecda10c0511d4ec5df325d738504ee7242171f1e80c34683f8d09d04fb4d46810b5df644a58151ba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(changepage.sty) \
tex(chngpage.sty) \
texlive-changepage"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
