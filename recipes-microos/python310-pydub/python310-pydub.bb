SUMMARY = "Audio manipulation with Python"
DESCRIPTION = "A Python module to manipulate audio with a high level interface."
LICENSE = "MIT"

PV = "0.25.1"

RPM_NAME = "python310-pydub-0.25.1-2.3.noarch.rpm"
RPM_HASH = "635affc11bf5a12c765d4e168241568bbdea3dcf5436506094d6cf8cb4a9a108d4cc03517fca27948ac97415d420f668b338311a48f955b19954ccdadbc540db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydub python3.10dist(pydub) python310-pydub python3dist(pydub)"
RDEPENDS:${PN} += "ffmpeg python(abi)"

inherit rpm
