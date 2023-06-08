SUMMARY = "Javadoc for gmavenplus-plugin"
DESCRIPTION = "This package contains javadoc for gmavenplus-plugin."
LICENSE = "Apache-2.0"

PV = "1.13.1"

RPM_NAME = "gmavenplus-plugin-javadoc-1.13.1-1.14.noarch.rpm"
RPM_HASH = "d8a175a3af9fdbaf0f5d9f6550160304d34b201ced8fe9613a6d104b30be211eb02317af871631724b549c85f7cbda0e434848d1974039bbe0f9429135a1c2dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gmavenplus-plugin-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
