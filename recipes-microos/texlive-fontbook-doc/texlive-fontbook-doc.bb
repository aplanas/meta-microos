SUMMARY = "Documentation for texlive-fontbook"
DESCRIPTION = "This package includes the documentation for texlive-fontbook"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn23608"

RPM_NAME = "texlive-fontbook-doc-2023.201.0.0.2svn23608-52.1.noarch.rpm"
RPM_HASH = "29bf72b51c54f5c24cccf60cdf647e280a02421d19be6a1c593be525f4960c3cbf1ddeb48ff2497998fc7ff949895471749def832f78ad839bceb25d123f9a2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontbook-doc"
RDEPENDS:${PN} += ""

inherit rpm
