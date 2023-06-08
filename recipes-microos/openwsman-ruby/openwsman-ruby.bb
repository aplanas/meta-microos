SUMMARY = "Ruby bindings for OpenWSMAN client API"
DESCRIPTION = "This package provides Ruby bindings to access the OpenWSMAN client API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "openwsman-ruby-2.7.2-2.5.aarch64.rpm"
RPM_HASH = "cd389bdec686a3511c7cebc214f622e3a9ae6d850602bfd451dd6fd063a4acc8bb1c8c1155af28ae0d054a1a91ee1741b68d58d79714b86329b91709406970b5"

RPROVIDES:${PN} += "openwsman-ruby openwsman-ruby(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libwsman.so.1()(64bit) libwsman_client.so.5()(64bit) libwsman_curl_client_transport.so.1()(64bit) ruby ruby(abi)"

inherit rpm
