SUMMARY = "Utilities for Google Media Downloads and Resumable Uploads"
DESCRIPTION = "Utilities for Google Media Downloads and Resumable Uploads"
LICENSE = "Apache-2.0"

PV = "2.4.1"

RPM_NAME = "python311-google-resumable-media-2.4.1-1.2.noarch.rpm"
RPM_HASH = "eccd3ae2f6d2c59f0bd50abeda71346c2bf19427425c920e64c73ec36cc9fd130bf6692cad823f5e2d4f3b90531d441344dd128b7835f2dfc2235e43471be471"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(google-resumable-media) python311-google-resumable-media python3dist(google-resumable-media)"
RDEPENDS:${PN} += "python(abi) python311-google-crc32c"

inherit rpm
