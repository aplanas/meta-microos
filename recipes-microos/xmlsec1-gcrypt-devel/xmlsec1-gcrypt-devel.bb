SUMMARY = "GCrypt crypto plugin for XML Security Library"
DESCRIPTION = "Libraries, includes, etc. for developing XML Security applications with GCrypt."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "xmlsec1-gcrypt-devel-1.2.37-2.2.aarch64.rpm"
RPM_HASH = "0a4fa92eef307f0a0558bd820f743aef7b97cbafa51257f192e70a824570eaad8da0a06618446619916fb20c98e37eedca022e2df329834d34506b4a1ec93173"

RPROVIDES:${PN} += "pkgconfig(xmlsec1-gcrypt) \
xmlsec1-gcrypt-devel \
xmlsec1-gcrypt-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxmlsec1-gcrypt1 \
pkgconfig(libxml-2.0) \
pkgconfig(libxslt) \
xmlsec1-devel"

inherit rpm
