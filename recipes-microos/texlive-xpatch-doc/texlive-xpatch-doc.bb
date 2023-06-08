SUMMARY = "Documentation for texlive-xpatch"
DESCRIPTION = "This package includes the documentation for texlive-xpatch"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn54563"

RPM_NAME = "texlive-xpatch-doc-2023.201.0.0.3svn54563-52.1.noarch.rpm"
RPM_HASH = "646dea125bc08cb53d2862c140e76826ecda17ee543d2a3584fb101ce4f09a9ffa3824baab4b3a17fb859b60a2f0589fdc91034fb1a32c990641044ee3b751f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpatch-doc"
RDEPENDS:${PN} += ""

inherit rpm
