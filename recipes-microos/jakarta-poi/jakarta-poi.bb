SUMMARY = "Java API To Access Microsoft Format Files"
DESCRIPTION = "The POI project consists of APIs for manipulating various file formats \
based upon Microsoft's OLE 2 Compound Document format using pure Java. \
In short, you can read and write MS Excel files using Java. Soon, \
you'll be able to read and write Word files using Java. POI is your \
Java Excel solution as well as your Java Word solution. However, we \
have a complete API for porting other OLE 2 Compound Document formats \
and welcome others to participate. OLE 2 Compound Document Format based \
files include most Microsoft Office files such as XLS and DOC as well \
as MFC serialization API based file formats."
LICENSE = "Apache-2.0"

PV = "2.5.1"

RPM_NAME = "jakarta-poi-2.5.1-31.6.noarch.rpm"
RPM_HASH = "02768b2463504bd6506909320d90cc9f5b9a92f53cfed6aaca6e1eafdba25a651b0e9913fedc30659a91442ad19b1f63ebf297b46b32f0b710c352f63c4d04d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-poi"
RDEPENDS:${PN} += "jakarta-commons-beanutils jakarta-commons-collections jakarta-commons-lang jakarta-commons-logging reload4j xalan-j2 xerces-j2"

inherit rpm
