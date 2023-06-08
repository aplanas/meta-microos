SUMMARY = "Javadoc for languagetool-core"
DESCRIPTION = "This package contains javadoc for languagetool-core."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8"

RPM_NAME = "languagetool-core-javadoc-4.8-3.1.noarch.rpm"
RPM_HASH = "2102d0387850f1075f1b6ca03dbf3537e4612a8e1dd9c22d145fefd808c68e60f0af2e0499422fad2bc276c8eeb677913d72ba96b00456d516ed579383919446"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "languagetool-core-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
