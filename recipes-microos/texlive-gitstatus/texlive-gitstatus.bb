SUMMARY = "Include Git information in the document as watermark or via variables"
DESCRIPTION = "If your LaTeX-document is version-controlled with git, you \
might encounter situations, where you want to include some \
information of your git-repository into your LaTeX-document- \
e.g. to keep track on who gave you feedback on which version of \
your document. This git-information can be included on every \
page by a watermark or (for custom needs) via provided \
variables."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64662"

RPM_NAME = "texlive-gitstatus-2023.201.1.1svn64662-53.1.noarch.rpm"
RPM_HASH = "f2d8c174b43f16e5a42d709c2c3a537e846d5a2eacdcd1f66b77b62772ca90527c25d410bef736d7a32e7e9e43625db4e75069694c9f7ca81374164a51e3e5db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gitstatus.sty) texlive-gitstatus"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(catchfile.sty) tex(kvoptions.sty) tex(xcolor.sty) tex(xstring.sty) tex(xwatermark.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
