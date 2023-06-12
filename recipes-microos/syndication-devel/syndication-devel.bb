SUMMARY = "RSS/Atom parsing library - development headers"
DESCRIPTION = "KF5Syndication is an RSS/Atom parsing library, which \
also provides an API to fetch feeds from the network. This \
package contains development headers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "syndication-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "49fb3b749b72c180295b76605fdee840be9f8ea072c00fdada3fa45e4d69ff5964b073f94a798e83265addc0694cba300ce46be5cfbcfe3785bc711ed7e59ff1"

RPROVIDES:${PN} += "cmake(KF5Syndication) \
syndication-devel \
syndication-devel(aarch-64)"
RDEPENDS:${PN} += "libKF5Syndication5"

inherit rpm
