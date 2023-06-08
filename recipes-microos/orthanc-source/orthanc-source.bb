SUMMARY = "This package includes the source files for Orthanc"
DESCRIPTION = "This package includes the source files for Orthanc. Use it in conjunction with the -devel package"
LICENSE = "GPL-3.0-or-later"

PV = "1.12.0"

RPM_NAME = "orthanc-source-1.12.0-1.2.aarch64.rpm"
RPM_HASH = "386e25ed4a453e767330be73dc3b2e6d31d38d6a2fe9ef5a8a76a186ddf593bfb409f64f0902ca8e71f0e58af871acb65e977b980e88556c31a1d9ed9f48e315"

RPROVIDES:${PN} += "orthanc-source orthanc-source(aarch-64)"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
