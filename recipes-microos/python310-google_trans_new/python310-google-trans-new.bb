SUMMARY = "A free and unlimited python tools for google translate api"
DESCRIPTION = "This a free and unlimited python tools for google translate api."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "python310-google_trans_new-1.1.9-1.1.noarch.rpm"
RPM_HASH = "e440324bbd1ac63ec769b088976c13660acca9a71b56099edf74f881fac4a61fb59be667bd2fecad0cab1b6ba1cb0f29485adde8281204b7cee1bfb877f434d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google_trans_new python3.10dist(google-trans-new) python310-google_trans_new python3dist(google-trans-new)"
RDEPENDS:${PN} += "python(abi) python310-requests python310-urllib3"

inherit rpm
