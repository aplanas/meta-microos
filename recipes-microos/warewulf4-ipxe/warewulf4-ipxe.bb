SUMMARY = "Binaries of iPXE for ww4 installation"
DESCRIPTION = "For the boot of the nodes iPXE binaries are needed. As these package includes these files for \
x86, i386 and ARM. \
These are the binaries from the upstream project."
LICENSE = "BSD-3-Clause"

PV = "4.4.0"

RPM_NAME = "warewulf4-ipxe-4.4.0-6.3.noarch.rpm"
RPM_HASH = "4e00f92bacdd7598d3cc71d97ee1007722817b044da7c17d02e19e6de19ec2cb50539add33f2462b3ff7327db121bb5c060416e3decb1a7f476dfb0c6cb3cc6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "warewulf4-ipxe"
RDEPENDS:${PN} += ""

inherit rpm
