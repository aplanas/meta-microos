SUMMARY = "Header files and libraries for compiling against htscodecs"
DESCRIPTION = "Header files and libraries of the samtools project for compiling against htscodecs."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "htscodecs-devel-1.3.0-1.3.aarch64.rpm"
RPM_HASH = "dae612892d200a18ab64ed30c31cd1c263f88fbc4cf406ee1d99020a7eb538fe79eb62bad65455a46eecb5433a3a5b723d96a78ebb5d66d3627be54b220452d8"

RPROVIDES:${PN} += "htscodecs-devel htscodecs-devel(aarch-64)"
RDEPENDS:${PN} += "libhtscodecs2"

inherit rpm
