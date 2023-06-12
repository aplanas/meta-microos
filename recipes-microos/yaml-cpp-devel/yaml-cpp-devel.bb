SUMMARY = "Development files for yaml-cpp"
DESCRIPTION = "Development files for yaml-cpp library."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "yaml-cpp-devel-0.7.0-2.1.aarch64.rpm"
RPM_HASH = "c96e8a10a28d857e240205f3f3d890f48b743bd1903d4cce6d26611537178925908950929fbb110fe6a688eb4fc56e83217b394fce94b688bf132b7bd64b2f42"

RPROVIDES:${PN} += "cmake(yaml-cpp) \
pkgconfig(yaml-cpp) \
yaml-cpp-devel \
yaml-cpp-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyaml-cpp0_7"

inherit rpm
