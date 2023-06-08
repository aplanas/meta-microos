SUMMARY = "Shared data files for the various gmic frontends"
DESCRIPTION = "This package contains shared data files for the various gmic frontends."
LICENSE = "CECILL-2.1"

PV = "3.2.3"

RPM_NAME = "gmic-data-3.2.3-2.1.noarch.rpm"
RPM_HASH = "2df32065f311afef772589f82cbd69862b35eadaed71d10df8b0864d68b4c38064bfb8483da24c8e962b9068069117eebc24878b46a213aad3164e7d2cf35bbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gmic-data"
RDEPENDS:${PN} += ""

inherit rpm
