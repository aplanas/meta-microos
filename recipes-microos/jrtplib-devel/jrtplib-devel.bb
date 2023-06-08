SUMMARY = "Development files for libjrtp"
DESCRIPTION = "JRTPLIB is an object-oriented library written in C++ for making use of \
the Real-time Transport Protocol (RTP) as described in RFC 3550. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libjrtp."
LICENSE = "MIT"

PV = "3.11.1"

RPM_NAME = "jrtplib-devel-3.11.1-1.20.aarch64.rpm"
RPM_HASH = "9fcaaff7460ba009419d435fb89f0bfd86203cdd0f2f2c2fa1eeba4e412461e419ee3008ce03b0babc9e4c885de5a2f0f690284548eba3342196d8b35b3846f9"

RPROVIDES:${PN} += "cmake(JRTPLIB) jrtplib-devel jrtplib-devel(aarch-64) pkgconfig(jrtplib)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libjrtp3_11_1"

inherit rpm
