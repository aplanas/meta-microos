SUMMARY = "Development files for libXISF"
DESCRIPTION = "This package contains all the needed development files to use libXISF."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.3"

RPM_NAME = "libXISF-devel-0.2.3-1.1.aarch64.rpm"
RPM_HASH = "ef6c6616aca1a917f826f478351585dc9a93ec915dfd0f02048ccdcaad0e21350ec0d21df6a6775edd272adc1c9a18bcb63017b9bfbdf59d001480a86fd93bca"

RPROVIDES:${PN} += "libXISF-devel libXISF-devel(aarch-64)"
RDEPENDS:${PN} += "libXISF0"

inherit rpm
