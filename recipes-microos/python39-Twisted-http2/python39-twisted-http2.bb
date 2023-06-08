SUMMARY = "HTTP/2 support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature http2"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-http2-22.10.0-5.1.noarch.rpm"
RPM_HASH = "48939b6a9f259ffc382e4f22880c14287501687604fc886439df3513f1a7a33a2ec2e924687fa9e0387c0f030173c9af3cb874c6e3cc94311913716db3be3556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-http2"
RDEPENDS:${PN} += "python39-Twisted python39-h2 python39-priority"

inherit rpm
