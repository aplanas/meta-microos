SUMMARY = "A tool to test PAM applications and PAM modules"
DESCRIPTION = "If you plan to develop tests for a PAM module, you can use this library, \
which simplifies testing of modules. This subpackage includes the header \
files for libpamtest"
LICENSE = "GPL-3.0-or-later"

PV = "1.1.4"

RPM_NAME = "libpamtest-devel-1.1.4-2.3.aarch64.rpm"
RPM_HASH = "8e5364b6ee47c4507a5254f264e40b1e509737a725f672f6afdeb738ebb19cee8cf0dcb6dcb075ed5e7656fa3327fb2c7c6f8a983d3887698a556194876dd0e1"

RPROVIDES:${PN} += "cmake(pamtest) libpamtest-devel libpamtest-devel(aarch-64) pkgconfig(libpamtest)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libpamtest0 pam_wrapper"

inherit rpm
