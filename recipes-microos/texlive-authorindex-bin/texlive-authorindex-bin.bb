SUMMARY = "Binary files of authorindex"
DESCRIPTION = "Binary files of authorindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn18790"

RPM_NAME = "texlive-authorindex-bin-2023.20230311.svn18790-91.1.aarch64.rpm"
RPM_HASH = "3ad30c525bdb85aca897ab1b0a79d74e811b0038f440fa18b33802bf0e179be83b3b7feaf7198b92c6d5189b9ad7834ffbd86d4bf0b7cd3befaf0dcd869ec70e"

RPROVIDES:${PN} += "texlive-authorindex-bin texlive-authorindex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-authorindex"

inherit rpm
