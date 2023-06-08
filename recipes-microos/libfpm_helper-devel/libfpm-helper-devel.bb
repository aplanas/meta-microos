SUMMARY = "Development files of libfpm_helper0"
DESCRIPTION = "Development Files of libfpm_helper0."
LICENSE = "MIT"

PV = "4.7.1"

RPM_NAME = "libfpm_helper-devel-4.7.1-1.16.aarch64.rpm"
RPM_HASH = "2884002e99e3cbb51f1e940e8012362adb3009e60dafb200026549e4c4622de28c28440bd180c307164e01982405fef0acadc7b72f5d74d72b27dfc5a1f64071"

RPROVIDES:${PN} += "libfpm_helper-devel libfpm_helper-devel(aarch-64)"
RDEPENDS:${PN} += "libfpm_helper0"

inherit rpm
