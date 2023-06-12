SUMMARY = "Development package for SpeeX"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
SpeeX library."
LICENSE = "BSD-3-Clause & GFDL-1.1-or-later"

PV = "1.2.1"

RPM_NAME = "speexdsp-devel-1.2.1-2.1.aarch64.rpm"
RPM_HASH = "6e4a49db74b703b28292f2b641dd2dac2bb1ded03824b0ac98b594ebe66047bd8923573a8a1114505a489a5d196843879a5fc71914019080900581b3bda00ad8"

RPROVIDES:${PN} += "pkgconfig(speexdsp) \
speexdsp-devel \
speexdsp-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspeexdsp1"

inherit rpm
