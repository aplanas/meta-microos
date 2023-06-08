SUMMARY = "Libraries, includes for XML Signatures/Encryption"
DESCRIPTION = "Libraries, includes, etc. you can use to develop applications with XML Digital \
Signatures and XML Encryption support."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "xmlsec1-devel-1.2.37-2.2.aarch64.rpm"
RPM_HASH = "9f93e44711b9c1c17c5b9d9935bb3026c4ca2a5747f0dd56e3c71b37c1ca67ea80928eb5018bf375c257c47d14ebe0659ce2eb9789766d1df9eb4da1f5e98584"

RPROVIDES:${PN} += "pkgconfig(xmlsec1) xmlsec1-devel xmlsec1-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config libxml2-devel libxmlsec1-1 libxslt-devel openssl-devel pkgconfig(libxml-2.0) pkgconfig(libxslt) pkgconfig(zlib)"

inherit rpm
