SUMMARY = "GNUTls crypto plugin for XML Security Library"
DESCRIPTION = "Libraries, includes, etc. for developing XML Security applications with GNUTls."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "xmlsec1-gnutls-devel-1.2.37-2.2.aarch64.rpm"
RPM_HASH = "1197a732a05a797ba39393b15aab482b47a59e0884b8fb8b6d3d5830811a0894cfb8986f0844cd34d3abe7de75d3fb2d94af13ee5d65a6bf35dff458b738553e"

RPROVIDES:${PN} += "pkgconfig(xmlsec1-gnutls) xmlsec1-gnutls-devel xmlsec1-gnutls-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gnutls-devel libgcrypt-devel libxmlsec1-gnutls1 pkgconfig(libxml-2.0) pkgconfig(libxslt) xmlsec1-devel xmlsec1-openssl-devel"

inherit rpm
