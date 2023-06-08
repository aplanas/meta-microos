SUMMARY = "A library for working with praat"
DESCRIPTION = "A library for working with praat, time aligned audio transcripts, and \
audio files. \
 \
Praat uses a file format called textgrids, which are time aligned \
speech transcripts. This library also provides utilities are to work \
with  transcripts and associated audio file and some other tools for \
use with praat."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python310-praatio-4.1.0-1.12.noarch.rpm"
RPM_HASH = "d7a79f7b0164c2a7e624d0177eb627af36c47295ff086f23bf13da2a718e72db19b4a6c529594b97fb96426ae6c875f85fdfc58b39328b17a2e7c0776fcb2e24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-praatio python3.10dist(praatio) python310-praatio python3dist(praatio)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
