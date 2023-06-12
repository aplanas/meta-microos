SUMMARY = "Java XML parser"
DESCRIPTION = "A slightly improved version of the AElfred Java XML parser from \
Microstar."
LICENSE = "MPL-1.0"

PV = "6.5.5"

RPM_NAME = "saxon6-aelfred-6.5.5-16.6.noarch.rpm"
RPM_HASH = "934f87d737e0c7dd6f53798d5ae296bccbb6ae7e802be2f01c87b123d0bc62850ec6a52fd52ebe7613bde79d48963049672bc19eab3a23320be436a8533018f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(saxon:saxon-aelfred) \
saxon-aelfred \
saxon6-aelfred"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
xml-commons-apis"

inherit rpm
