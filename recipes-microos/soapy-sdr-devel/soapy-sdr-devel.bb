SUMMARY = "Development files for the SoapySDR library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libSoapySDR."
LICENSE = "BSL-1.0"

PV = "0.8.1"

RPM_NAME = "soapy-sdr-devel-0.8.1-1.11.aarch64.rpm"
RPM_HASH = "583aebc33e2fff74c6c60483d799f0ca56d2a98a234bc034010acc482fced6bf9391c5b83b2fe3bd65caafc461958722cd086eff40e6f135bf53bedfd5d548ba"

RPROVIDES:${PN} += "cmake(SoapySDR) \
pkgconfig(SoapySDR) \
soapy-sdr-devel \
soapy-sdr-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSoapySDR0_8"

inherit rpm
