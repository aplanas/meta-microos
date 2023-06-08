SUMMARY = "Header files for rapidyaml, a library to parse and emit YAML"
DESCRIPTION = "ryml is a C++ library to parse and emit YAML. \
 \
This package contains development headers and examples."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "rapidyaml-devel-0.5.0-1.3.aarch64.rpm"
RPM_HASH = "e907cfe02a70f9b595a5cdf416c5daa913999fc04ca8dcad6c7e34154654f29a46da933e8432fe69b6b4d673dfbde6560747600f7777a0d3b9c07bb9703187cd"

RPROVIDES:${PN} += "cmake(c4core) cmake(ryml) rapidyaml-devel rapidyaml-devel(aarch-64)"
RDEPENDS:${PN} += "libc4core0_1_11 libryml0_5_0"

inherit rpm
