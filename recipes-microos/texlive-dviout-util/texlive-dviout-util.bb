SUMMARY = "Package dviout-util"
DESCRIPTION = "The dviout-util package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-dviout-util-2023.201.svn66186-53.1.noarch.rpm"
RPM_HASH = "d3a34d026a018664e4a3de56140f02061957fdeba9e62d61a28ba88bf40122b117cf1ac89768a3514e5caf6df0d3732042412b2a99b155c3b4e5d67699182eeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(chkdvifont.1) man(dvispc.1) texlive-dviout-util"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-dviout-util-bin texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
