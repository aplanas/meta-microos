SUMMARY = "Development files for rtaudio"
DESCRIPTION = "RtAudio is a set of C++ classes that provide a common API for \
realtime audio input/output across different operating systems. \
 \
This subpackage contains the headers for rtaudio."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "rtaudio-devel-5.1.0-1.15.aarch64.rpm"
RPM_HASH = "886fe14af9e8360b5148f6d1461d18e6432a9088b70268112adcbfc949e3ecf6b3f7b3b33b0184f681cf70a377ffba3633236d8fd98515dbec29f1dd64a745ef"

RPROVIDES:${PN} += "pkgconfig(rtaudio) rtaudio-devel rtaudio-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config librtaudio6 pkgconfig(alsa) pkgconfig(jack) pkgconfig(libpulse-simple)"

inherit rpm
