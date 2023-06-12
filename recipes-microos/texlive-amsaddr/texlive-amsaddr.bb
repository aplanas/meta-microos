SUMMARY = "Alter the position of affiliations in amsart"
DESCRIPTION = "The package is to be used with the amsart documentclass. It \
lets you move the authors' affiliations either just below the \
authors' names on the front page or as footnotes on the first \
page. The email addresses are always listed as a footnote on \
the front page."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn64357"

RPM_NAME = "texlive-amsaddr-2023.201.1.2svn64357-54.1.noarch.rpm"
RPM_HASH = "ce215f0ae2ddb9f035614ff03afbf4ab8d8e16f2bd0f9ee44250185d38331178b9c85c44b81fb63eae78f2817ec05257489e2a3e4503ec3f830ae5a8efdbf877"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(amsaddr.sty) \
texlive-amsaddr"
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
