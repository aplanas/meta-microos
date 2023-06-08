SUMMARY = "Make JSON greppable"
DESCRIPTION = "gron transforms JSON into discrete assignments to make it easier \
to grep for what you want and see the absolute 'path' to it. It \
eases the exploration of APIs that return large blobs of JSON but \
have terrible documentation."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "gron-0.7.1-1.6.aarch64.rpm"
RPM_HASH = "c707ecf85f4955cb37d2a8d21923a5348cd67701bce153bbfac695bdf93d1111b44ff5687db7adcb28594c1f2c74326b02d77bff25154bd012af0f04a32969ad"

RPROVIDES:${PN} += "gron gron(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
