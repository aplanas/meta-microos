SUMMARY = "Perl bindings for OpenWSMAN client API"
DESCRIPTION = "This package provides Perl bindings to access the OpenWSMAN client API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "openwsman-perl-2.7.2-2.5.aarch64.rpm"
RPM_HASH = "15f9560db2743fd360b95bf50528ffb16c0db3b4c4e834c4b9aed21d1953c6b701ac53c36f54a6daba9cd6a0620f1c87341ca51435c65af611313b483ba1b5ef"

RPROVIDES:${PN} += "openwsman-perl openwsman-perl(aarch-64) perl(openwsman) perl(openwsman::Client) perl(openwsman::ClientOptions) perl(openwsman::Context) perl(openwsman::EndPointReference) perl(openwsman::EnumerateInfo) perl(openwsman::Fault) perl(openwsman::Filter) perl(openwsman::Soap) perl(openwsman::SoapOp) perl(openwsman::Status) perl(openwsman::Transport) perl(openwsman::XmlAttr) perl(openwsman::XmlDoc) perl(openwsman::XmlNode) perl(openwsman::XmlNs) perl(openwsmanc)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libwsman.so.1()(64bit) libwsman_client.so.5()(64bit) libwsman_curl_client_transport.so.1()(64bit) perl"

inherit rpm
