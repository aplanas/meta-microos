SUMMARY = "Development headers for OpenAL Soft"
DESCRIPTION = "OpenAL is an audio library designed in the spirit of the OpenGL API. \
This subpackage contains libraries and header files for developing \
applications that want to make use of openal-soft."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "openal-soft-devel-1.22.2-1.4.aarch64.rpm"
RPM_HASH = "7df9c7323f5380773486e62b981aeb289cd7f450b38f122de974bcd6ef33e9ccca9215e4caa2a1a2d7615d17b83fe4fd71df3627ef5118bac2c39ec0baa04ac1"

RPROVIDES:${PN} += "cmake(OpenAL) openal-devel openal-soft-devel openal-soft-devel(aarch-64) pkgconfig(openal)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libopenal1"

inherit rpm
