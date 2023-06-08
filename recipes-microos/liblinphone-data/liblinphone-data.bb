SUMMARY = "Web Phone data files"
DESCRIPTION = "Linphone is a Web phone with a Qt interface. It lets you make \
two-party calls over IP networks such as the Internet. It uses the IETF \
protocols SIP (Session Initiation Protocol) and RTP (Realtime TransporT \
Protocol) to make calls, so it should be able to communicate with other \
SIP-based Web phones. With several codecs available, it can be used \
with high speed connections as well as 28k modems. \
 \
This package contains data files such as sounds."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.10"

RPM_NAME = "liblinphone-data-5.2.10-2.3.noarch.rpm"
RPM_HASH = "4e89a22328512803540edae9d6eb5d6af0a80f8301fcdc165e6645314edc7312e16f7114f208ff46ca199ded5461f46b5cdf868260bd54d70d52f76958a59b52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblinphone-data"
RDEPENDS:${PN} += ""

inherit rpm
