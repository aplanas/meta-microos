SUMMARY = "Binary files of ctanupload"
DESCRIPTION = "Binary files of ctanupload"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23866"

RPM_NAME = "texlive-ctanupload-bin-2023.20230311.svn23866-89.1.aarch64.rpm"
RPM_HASH = "66ad8481fa2dd303106643cf2190324cb007eb0e3b2adc35cbae3ffdd3b0e6d6529833b3427b7a59e83f9d8a602d6dafc7509be05abec7ea00f716d0062a4970"

RPROVIDES:${PN} += "texlive-ctanupload-bin texlive-ctanupload-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-ctanupload"

inherit rpm
