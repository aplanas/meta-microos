SUMMARY = "Python module to talk to Google Chromecast"
DESCRIPTION = "Library to communicate with the Google Chromecast. It currently supports \
Auto discovering connected Chromecasts on the network, start the default \
media receiver and play any online media, control playback of current \
playing media, implement Google Chromecast api v2, communicate with apps \
via channels, easily extendable to add support for unsupported namespaces, \
multi-room setups with Audio cast devices."
LICENSE = "MIT"

PV = "13.0.4"

RPM_NAME = "python311-PyChromecast-13.0.4-1.3.noarch.rpm"
RPM_HASH = "72ccdd37c3b12639b47504fec913fa1f39287de925f8887df04895d62e80d2e6b6d2fd8ef412dd962f68e60d24a2f4d19ce98ee8b8f8e4cccd63012abdf354d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pychromecast) python311-PyChromecast python3dist(pychromecast)"
RDEPENDS:${PN} += "python(abi) python311-casttube python311-protobuf python311-zeroconf"

inherit rpm
