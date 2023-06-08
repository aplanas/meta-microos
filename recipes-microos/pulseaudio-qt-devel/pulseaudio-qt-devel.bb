SUMMARY = "Development files for pulseaudio-qt, Qt bindings for PulseAudio"
DESCRIPTION = "Development files for pulseaudio-qt, a library providing Qt bindings to \
PulseAudio."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3"

RPM_NAME = "pulseaudio-qt-devel-1.3-1.10.aarch64.rpm"
RPM_HASH = "4af83756193d747a2647b2944386e88dd5b00b7c380004121233fc1970f2a71edfe1aa38a1671da7a7f89be090470c425672bfb13ae93041b71260124287b635"

RPROVIDES:${PN} += "cmake(KF5PulseAudioQt) pulseaudio-qt-devel pulseaudio-qt-devel(aarch-64)"
RDEPENDS:${PN} += "libKF5PulseAudioQt3"

inherit rpm
