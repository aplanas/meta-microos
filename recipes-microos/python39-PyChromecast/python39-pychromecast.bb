SUMMARY = "Python module to talk to Google Chromecast"
DESCRIPTION = "Library to communicate with the Google Chromecast. It currently supports \
Auto discovering connected Chromecasts on the network, start the default \
media receiver and play any online media, control playback of current \
playing media, implement Google Chromecast api v2, communicate with apps \
via channels, easily extendable to add support for unsupported namespaces, \
multi-room setups with Audio cast devices."
LICENSE = "MIT"

PV = "13.0.4"

RPM_NAME = "python39-PyChromecast-13.0.4-1.3.noarch.rpm"
RPM_HASH = "514dc5acc4b6657d90c8cd9defa6ac2c1b1109058b82979f008862b020cb128901f769fd3c7d04c5ed18d1499a35e32490c410908122137598cc7632c548ed57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pychromecast) python39-PyChromecast python3dist(pychromecast)"
RDEPENDS:${PN} += "python(abi) python39-casttube python39-protobuf python39-zeroconf"

inherit rpm
