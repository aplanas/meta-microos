SUMMARY = "Specify version and compression level of output PDF files"
DESCRIPTION = "This package enables users to specify in their sources the \
following settings on the PDF document to output: PDF version \
(1.4, 1.5 etc.); whether or not to compress streams; whether or \
not to use object streams. This package supports all major \
PDF-output engines and dvipdfmx."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn63185"

RPM_NAME = "texlive-bxpdfver-2023.201.0.0.6svn63185-52.1.noarch.rpm"
RPM_HASH = "ba21acef2563b09250a0f544625d7eac1a535cb9811c96ab90bfb91c9b0a113b556f6a606b628e537ed4217557d41ee29651024e5bdfb42e107e1a9257141144"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bxpdfver.sty) \
texlive-bxpdfver"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(atbegshi.sty) \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
