SUMMARY = "Open Fingerprint Architecture Library"
DESCRIPTION = "MusicDNS and the Open Fingerprint Architecture provide a system for \
identifying a piece of music with nothing more than the sound of the \
piece itself. \
This library is by design compatible with the MusicDNS web service. \
Non-commercial access to the service is available at \
http://www.musicdns.org."
LICENSE = "GPL-2.0-or-later | APL-1.0"

PV = "0.9.3"

RPM_NAME = "libofa-devel-0.9.3-104.15.aarch64.rpm"
RPM_HASH = "842497c11b3aa398839a4e006f0a9b17c0d6c28f312421669504d7b7b1b8158e0f0180367da77432633a7bf6f0c49f5e165fcfd66569b2d0319117f1e6533844"

RPROVIDES:${PN} += "libofa-devel libofa-devel(aarch-64) pkgconfig(libofa)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libofa0 pkgconfig(expat) pkgconfig(fftw3)"

inherit rpm
