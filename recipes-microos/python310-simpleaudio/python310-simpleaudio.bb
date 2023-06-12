SUMMARY = "Asynchronous audio playback for Python"
DESCRIPTION = "The simplaudio package provides audio playback capability for Python 3 \
on OSX, Windows, and Linux."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python310-simpleaudio-1.0.4-1.19.aarch64.rpm"
RPM_HASH = "191bdd74e18659f6d4ab6d8daff7b1c2b959e8fec3fad126aa1eef84a18135a8cf5459afa2a69e2e3564f37d58f6ddb45868ae2e0b104562cf64aa49e6e54c61"

RPROVIDES:${PN} += "python3-simpleaudio \
python3.10dist(simpleaudio) \
python310-simpleaudio \
python310-simpleaudio(aarch-64) \
python3dist(simpleaudio)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
python(abi)"

inherit rpm
