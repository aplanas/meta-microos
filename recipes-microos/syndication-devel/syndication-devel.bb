SUMMARY = "RSS/Atom parsing library - development headers"
DESCRIPTION = "KF5Syndication is an RSS/Atom parsing library, which \
also provides an API to fetch feeds from the network. This \
package contains development headers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "syndication-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "16c17aa157c70c0699efb5ebb4f6c630e7a4d9bc6efe53d6bda0bbfd6bf532cd7b7e9cb0216bd693e32534930cdd098a80945a8197ac87d0c41db81b6ed86382"

RPROVIDES:${PN} += "cmake(KF5Syndication) syndication-devel syndication-devel(aarch-64)"
RDEPENDS:${PN} += "libKF5Syndication5"

inherit rpm
