SUMMARY = "Python module to talk to Google Chromecast"
DESCRIPTION = "Library to communicate with the Google Chromecast. It currently supports \
Auto discovering connected Chromecasts on the network, start the default \
media receiver and play any online media, control playback of current \
playing media, implement Google Chromecast api v2, communicate with apps \
via channels, easily extendable to add support for unsupported namespaces, \
multi-room setups with Audio cast devices."
LICENSE = "MIT"

PV = "13.0.7"

RPM_NAME = "python310-PyChromecast-13.0.7-1.1.noarch.rpm"
RPM_HASH = "cddecd606a79813c168341821fc157aa830cc0e947cef1a1c99659967332feaee3ac5a68f60018944cf8798b51d8b6fa5b68656bad47d795f698c958b9ade3ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyChromecast python3.10dist(pychromecast) python310-PyChromecast python3dist(pychromecast)"
RDEPENDS:${PN} += "python(abi) python310-casttube python310-protobuf python310-zeroconf"

inherit rpm
