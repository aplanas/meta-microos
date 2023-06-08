SUMMARY = "Documentation for texlive-pst-bspline"
DESCRIPTION = "This package includes the documentation for texlive-pst-bspline"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.62svn40685"

RPM_NAME = "texlive-pst-bspline-doc-2023.201.1.62svn40685-52.1.noarch.rpm"
RPM_HASH = "3b263a1cf6f29ff7b4ce2fce486dda59854bf2e8883a86a549c1a944469c942b5513621cb56932d361f96b9806289c625eac24cc63f7f8379606611d488da504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-bspline-doc"
RDEPENDS:${PN} += ""

inherit rpm
