SUMMARY = "Python module to create MP3 files from spoken text via the Google TTS API"
DESCRIPTION = "gTTS is a Python interface for Google's Text to Speech API. An MP3 \
file may be created with the gTTS module or the gtts-cli command line \
utility. It allows unlimited lengths to be spoken by tokenizing long \
sentences where the speech would naturally pause."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python310-gTTS-2.3.1-1.5.noarch.rpm"
RPM_HASH = "65e3b2bdcc5e089141e5f85cce5f8ef885e6c3dae3f616e3671efa12741aacfe44e6b336bbdbb73a820b492d8715bec9bd3464216e8873bf808ca8d91c5383a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gTTS \
python3.10dist(gtts) \
python310-gTTS \
python3dist(gtts)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-beautifulsoup4 \
python310-click \
python310-gTTS-token \
python310-requests \
python310-setuptools \
python310-six \
update-alternatives"

inherit rpm
