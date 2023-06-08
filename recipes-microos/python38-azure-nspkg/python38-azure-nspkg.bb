SUMMARY = "Microsoft Azure namespace package"
DESCRIPTION = "This is the Microsoft Azure namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure namespace."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python38-azure-nspkg-3.0.2-3.9.noarch.rpm"
RPM_HASH = "4c0a91f951e4a9982dd84ffab586f277b9361523670c586d3a4ff120a745577c571ab5cc477536d73aad6157cd3ac742314d46e8d22802780438993e1b05ab24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(azure-nspkg) python38-azure-nspkg python3dist(azure-nspkg)"
RDEPENDS:${PN} += ""

inherit rpm
