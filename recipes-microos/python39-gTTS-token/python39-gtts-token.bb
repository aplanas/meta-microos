SUMMARY = "Python module for calculating a token to run the Google text-to-speech engine"
DESCRIPTION = "gTTS-token (Google Text to Speech token) is a Python implementation \
of the token validation required by Google Translate when making \
a request to its API."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python39-gTTS-token-1.1.4-1.3.noarch.rpm"
RPM_HASH = "44c9430a8f78ca90a2921fd54c289f192db79964b10daf0803b3de493cae308aa19dc6114f7a609f0ecccf461e3089d2a23713fce107e661bf9b94cdbda2d9f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(gtts-token) python39-gTTS-token python3dist(gtts-token)"
RDEPENDS:${PN} += "python(abi) python39-requests"

inherit rpm
