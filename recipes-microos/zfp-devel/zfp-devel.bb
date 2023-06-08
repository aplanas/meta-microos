SUMMARY = "Development files for zfp"
DESCRIPTION = "Development package for zfp."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "zfp-devel-1.0.0-1.3.aarch64.rpm"
RPM_HASH = "8109c1eaf5f4be81c696f85478a5ee7d3a48f05d43e40a0cfdc991eb5fe83d6671dcaec37079f47e8dd514f1dc57ea7395cfde22f341fe43c4ab1591d96ea510"

RPROVIDES:${PN} += "cmake(zfp) zfp-devel zfp-devel(aarch-64)"
RDEPENDS:${PN} += "libzfp1"

inherit rpm
