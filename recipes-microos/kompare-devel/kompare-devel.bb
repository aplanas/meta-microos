SUMMARY = "Development files for the File Comparator"
DESCRIPTION = "Development files for the File Comparator package"
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.0"

RPM_NAME = "kompare-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "217d2436e3fb26bf3c15ca7c136adb266638c36f231cce6f925aceeefe70f239a25cf32173807188b3a2dd61c1a8ca4c83a4d6e81e4c9bf42de14a8a2dd64bc4"

RPROVIDES:${PN} += "kompare-devel kompare-devel(aarch-64)"
RDEPENDS:${PN} += "kompare"

inherit rpm
