SUMMARY = "Module to play and record sound with Python"
DESCRIPTION = "This Python module provides bindings for the PortAudio library and a few \
convenience functions to play and record NumPy arrays containing audio signals."
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "python310-sounddevice-0.4.5-1.3.noarch.rpm"
RPM_HASH = "dcc04f34283bb832476941388b43313e326d8f2d899d59700abe6e2289bf9612e448f0e88ea06e22b627dc62f19ef76b2f4f194d0c0794855ff0145c017cc901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sounddevice python3.10dist(sounddevice) python310-sounddevice python3dist(sounddevice)"
RDEPENDS:${PN} += "portaudio python(abi) python310-cffi"

inherit rpm
