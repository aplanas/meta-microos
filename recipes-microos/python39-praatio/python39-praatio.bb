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

RPM_NAME = "python39-praatio-4.1.0-1.12.noarch.rpm"
RPM_HASH = "0db2587e0a1ad2a2bec99e48e85a3a9bcd194a2341f67fc75d2514cc26d70f1b1af493827ba9389b7a50cdeb01f1ad2828b40f7df421f4911735d86545146954"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(praatio) \
python39-praatio \
python3dist(praatio)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
