SUMMARY = "Development files for yaml-cpp"
DESCRIPTION = "Development files for yaml-cpp library."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "yaml-cpp-devel-0.7.0-1.7.aarch64.rpm"
RPM_HASH = "dadaa66537be520b23efb2c9103c8a9f26aa5e64eefbe8e5a03d7c35425f7150e8064c1bce12e744523f383708fdd334b1c46f38f55da57e905d65da087e11dc"

RPROVIDES:${PN} += "cmake(yaml-cpp) pkgconfig(yaml-cpp) yaml-cpp-devel yaml-cpp-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libyaml-cpp0_7"

inherit rpm
