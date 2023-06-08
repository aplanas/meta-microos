SUMMARY = "Python wrapper for the Twitter API"
DESCRIPTION = "Twython is a Python library providing a way to access Twitter data. \
 \
Features include: \
 \
- Query data for: \
    - User information \
    - Twitter lists \
    - Timelines \
    - Direct Messages \
    - and anything found in `the docs <https://dev.twitter.com/docs/api/1.1>`_ \
- Image Uploading: \
    - Update user status with an image \
    - Change user avatar \
    - Change user background image \
    - Change user banner image \
- OAuth 2 Application Only (read-only) Support \
- Support for Twitter's Streaming API \
- Seamless Python 3 support!"
LICENSE = "MIT"

PV = "3.9.1"

RPM_NAME = "python311-twython-3.9.1-1.3.noarch.rpm"
RPM_HASH = "d6330d0bccfc47fec02ff72f119402725f55bbd5f3089b471582ed6ab22345a1f14fddbba170ec796e23473e445ea86285d20afec5f208b42145e86d09ca935f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(twython) python311-twython python3dist(twython)"
RDEPENDS:${PN} += "python(abi) python311-requests python311-requests-oauthlib"

inherit rpm
