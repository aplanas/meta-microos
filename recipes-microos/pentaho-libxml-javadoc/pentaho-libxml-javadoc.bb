SUMMARY = "Javadoc for pentaho-libxml"
DESCRIPTION = "Javadoc for pentaho-libxml."
LICENSE = "LGPL-2.0-only"

PV = "1.1.3"

RPM_NAME = "pentaho-libxml-javadoc-1.1.3-6.6.noarch.rpm"
RPM_HASH = "f87824ca2855d6b7ea0e33f5dc321f11011bee23a4f41b4a41185bc7cf86bc703c0405879cf4e8a36bc523b4f7bc3d09b8bca915381760c178f13ba43c57b3b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pentaho-libxml-javadoc"
RDEPENDS:${PN} += ""

inherit rpm
