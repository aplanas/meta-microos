SUMMARY = "Javadoc for libserializer"
DESCRIPTION = "Javadoc for libserializer."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.6"

RPM_NAME = "libserializer-javadoc-1.1.6-1.4.noarch.rpm"
RPM_HASH = "c8d311136978e5b1b61f9fdcc5b7915f032c75c663edcc7bd2ae2253e18e8cbd45991314d50f3a0588716dbcd109f8650f0d8d1995de2277c633553fefca3965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libserializer-javadoc"
RDEPENDS:${PN} += ""

inherit rpm
