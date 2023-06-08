SUMMARY = "Python module to talk to Google Chromecast"
DESCRIPTION = "Library to communicate with the Google Chromecast. It currently supports \
Auto discovering connected Chromecasts on the network, start the default \
media receiver and play any online media, control playback of current \
playing media, implement Google Chromecast api v2, communicate with apps \
via channels, easily extendable to add support for unsupported namespaces, \
multi-room setups with Audio cast devices."
LICENSE = "MIT"

PV = "13.0.4"

RPM_NAME = "python310-PyChromecast-13.0.4-1.3.noarch.rpm"
RPM_HASH = "08824faf4c7665783d18c722e04e59629809f152832b0e77b7f94776cdbb459c7daa6f0f4f99aa6f0d46f24a8b6347e0a3056e6cf7960c73050a19cd21a13cbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyChromecast python3.10dist(pychromecast) python310-PyChromecast python3dist(pychromecast)"
RDEPENDS:${PN} += "python(abi) python310-casttube python310-protobuf python310-zeroconf"

inherit rpm
