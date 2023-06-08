SUMMARY = "Binary files of uplatex"
DESCRIPTION = "Binary files of uplatex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn52800"

RPM_NAME = "texlive-uplatex-bin-2023.20230311.svn52800-89.1.aarch64.rpm"
RPM_HASH = "205f58993f5bb946ce4f0c7660efbd5c52b89ee400c6aa31b3c00a216ec33f0287594cfaa3e5be6ea4da6b998da9381ea4a7f374ce7d67e7682f773bd6f5cec6"

RPROVIDES:${PN} += "texlive-uplatex-bin texlive-uplatex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-uplatex"

inherit rpm
