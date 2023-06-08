SUMMARY = "Development files for the FCD and FCDpro Plus addon"
DESCRIPTION = "gr-funcube is an linux oot-module for gnuradio to implement a FUNcube \
Dongle and a FUNcube Dongle PRO+ source. It autodetects the correct \
soundcard from /proc/asound/cards. This idea was taken from the osmosdr \
 drivers. To control the device, the hidraw code of the HID API is used."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "libgnuradio-funcube-devel-3.10.0.rc3-1.1.aarch64.rpm"
RPM_HASH = "fd9ec6ff29551339019aeb0f3ca02d8ec4c698180cc1ac9c21adb29db00354163ba3b229e1fbdbbedeb2eb4f217ddf79227ebb3e1afbebc8e3a2e1abfa102f53"

RPROVIDES:${PN} += "cmake(funcube) cmake(gnuradio-funcube) libgnuradio-funcube-devel libgnuradio-funcube-devel(aarch-64)"
RDEPENDS:${PN} += "libgnuradio-funcube3_10_0"

inherit rpm
