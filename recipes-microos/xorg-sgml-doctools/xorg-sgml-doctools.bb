SUMMARY = "Set of SGML entities and XML/CSS style sheets for building X.org documentation"
DESCRIPTION = "This package provides a common set of SGML entities and XML/CSS style \
sheets used in building/formatting the documentation provided in other \
X.Org packages."
LICENSE = "MIT"

PV = "1.12"

RPM_NAME = "xorg-sgml-doctools-1.12-1.5.noarch.rpm"
RPM_HASH = "59678c20a56631d388470d46a6680e071ffe9c085d71e781e70cd169f2ed43f833734b0ebd6da3d3410257c3f19ca08df00a1a19540de0d84836b4be3c8506b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig(xorg-sgml-doctools) \
xorg-sgml-doctools"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
