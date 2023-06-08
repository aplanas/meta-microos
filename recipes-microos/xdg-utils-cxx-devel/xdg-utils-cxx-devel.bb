SUMMARY = "Development files for xdg-utils-cxx"
DESCRIPTION = "Development files for xdg-utils-cxx."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "xdg-utils-cxx-devel-1.0.1-1.3.aarch64.rpm"
RPM_HASH = "9a6ebf5d2efa303f0a051c1b93ed1d88de341f90c693861fc46654ac0df7b117ffe389cd4c391b35128a893c459fe28e830fb9d63b6ea4de6ab87bd90742eec6"

RPROVIDES:${PN} += "cmake(XdgUtils) xdg-utils-cxx-devel xdg-utils-cxx-devel(aarch-64)"
RDEPENDS:${PN} += "libXdgUtilsBaseDir1_0_1 libXdgUtilsDesktopEntry1_0_1"

inherit rpm
