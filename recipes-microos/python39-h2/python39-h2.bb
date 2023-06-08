SUMMARY = "HTTP/2 State-Machine based protocol implementation"
DESCRIPTION = "Pure-Python implementation of a HTTP/2 protocol stack. \
It's written from the ground up to be embeddable in whatever program \
you choose to use, ensuring that you can speak HTTP/2 regardless of \
your programming paradigm."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python39-h2-4.1.0-3.1.noarch.rpm"
RPM_HASH = "4f31340af972cad5fe81ee582a7939dabeca9275b215ef16c4fc91d77b21f00b638c2896047cfa967192322d411954299e0243e80efa9abcfc133cd3d0ab8726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(h2) python39-h2 python3dist(h2)"
RDEPENDS:${PN} += "python(abi) python39-hpack python39-hyperframe"

inherit rpm
