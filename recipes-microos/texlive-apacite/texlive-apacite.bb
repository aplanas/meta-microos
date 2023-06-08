SUMMARY = "Citation style following the rules of the APA"
DESCRIPTION = "Apacite provides a BibTeX style and a LaTeX package which are \
designed to match the requirements of the American \
Psychological Association's style for citations. The package \
follows the 6th edition of the APA manual, and is designed to \
work with the apa6 class. A test document is provided. The \
package is compatible with chapterbib and (to some extent) with \
hyperref (for limits of compatibility, see the documentation). \
The package also includes a means of generating an author index \
for a document."
LICENSE = "LPPL-1.0"

PV = "2023.201.6.03svn54080"

RPM_NAME = "texlive-apacite-2023.201.6.03svn54080-54.1.noarch.rpm"
RPM_HASH = "50090916606d12425cb6a53dc58eb88e2427f06d36d87db4ae788a81cd9670868067aea61fa0fd8da7fb0e6e539996cb2f2d8fd545d210db14df9666ec7e36e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(apacdoc.sty) tex(apacite.sty) texlive-apacite"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(index.sty) tex(multicol.sty) tex(natbib.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
