SUMMARY = "Net::LDAP for Ruby (also called net-ldap) implements client access"
DESCRIPTION = "Net::LDAP for Ruby (also called net-ldap) implements client access for the \
Lightweight Directory Access Protocol (LDAP), an IETF standard protocol for \
accessing distributed directory services. Net::LDAP is written completely in \
Ruby with no external dependencies. It supports most LDAP client features and \
a \
subset of server features as well. \
Net::LDAP has been tested against modern popular LDAP servers including \
OpenLDAP and Active Directory. The current release is mostly compliant with \
earlier versions of the IETF LDAP RFCs (2251-2256, 2829-2830, 3377, and 3771). \
Our roadmap for Net::LDAP 1.0 is to gain full <em>client</em> compliance with \
the most recent LDAP RFCs (4510-4519, plutions of 4520-4532)."
LICENSE = "MIT"

PV = "0.17.1"

RPM_NAME = "ruby3.2-rubygem-net-ldap-0.17.1-1.5.aarch64.rpm"
RPM_HASH = "31911c5448ec3961cae54e2648858ef6506d3362c3bcb1fb660ad78dbc7c170d9d955caf659516ec8631a5101296ff2ab9b6243eef3d4ed9d569b68733d6341c"

RPROVIDES:${PN} += "ruby3.2-rubygem-net-ldap ruby3.2-rubygem-net-ldap(aarch-64) rubygem(net-ldap) rubygem(ruby:3.2.0:net-ldap) rubygem(ruby:3.2.0:net-ldap:0) rubygem(ruby:3.2.0:net-ldap:0.17) rubygem(ruby:3.2.0:net-ldap:0.17.1)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
