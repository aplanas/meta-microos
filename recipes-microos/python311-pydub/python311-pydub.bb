SUMMARY = "Audio manipulation with Python"
DESCRIPTION = "A Python module to manipulate audio with a high level interface."
LICENSE = "MIT"

PV = "0.25.1"

RPM_NAME = "python311-pydub-0.25.1-2.3.noarch.rpm"
RPM_HASH = "8bcec6092e6f676aecb7b6b4e85c1ebda4d6e4827df2308fc6e138a567f75360f24c049ce0c5f545c4d16adb832b7bfc921c4457f406069a54e0070c3750c00e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pydub) \
python311-pydub \
python3dist(pydub)"
RDEPENDS:${PN} += "ffmpeg \
python(abi)"

inherit rpm
