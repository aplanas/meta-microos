SUMMARY = "Shibboleth Development Headers"
DESCRIPTION = "Shibboleth is a Web Single Sign-On implementations based on OpenSAML \
that supports multiple protocols, federated identity, and the extensible \
exchange of rich attributes subject to privacy controls. \
 \
This package includes files needed for development with Shibboleth."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "shibboleth-sp-devel-3.4.1-1.4.aarch64.rpm"
RPM_HASH = "f63ef35247ddf5aabe94d5d57358f9fef40bc9c9b0f5c2c8b4600ee40484a39c1b84a65b6c7939798ad828cd2c8a110d5584c581f9ae4ea3e83860ad5951af4b"

RPROVIDES:${PN} += "pkgconfig(shibsp) pkgconfig(shibsp-lite) shibboleth-sp-devel shibboleth-sp-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liblog4shib-devel libsaml-devel libshibsp-lite11 libshibsp11 libxerces-c-devel libxml-security-c-devel libxmltooling-devel pkgconfig(krb5-gssapi) pkgconfig(log4shib) pkgconfig(opensaml) pkgconfig(xerces-c) pkgconfig(xml-security-c) pkgconfig(xmltooling) pkgconfig(xmltooling-lite) shibboleth-sp"

inherit rpm
