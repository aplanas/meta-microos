SUMMARY = "Real-time microphone noise suppression on Linux"
DESCRIPTION = "NoiseTorch is an easy to use open source application for Linux with PulseAudio. \
It creates a virtual microphone that suppresses noise, in any application. Use \
whichever conferencing or VOIP application you like and simply select the \
NoiseTorch Virtual Microphone as input to torch the sound of your mechanical \
keyboard, computer fans, trains and the likes."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.2"

RPM_NAME = "noisetorch-0.12.2-2.5.aarch64.rpm"
RPM_HASH = "dd2d36425565f43ed9fdb4cb12c509e74c74d5acb02e73d94046259c51e8b88cf497e46ab8dee0ca6833f9a0c15be5bd8ad7d6bcdf518fe2db39cdc75b0dd633"

RPROVIDES:${PN} += "application() \
application(noisetorch.desktop) \
noisetorch \
noisetorch(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
