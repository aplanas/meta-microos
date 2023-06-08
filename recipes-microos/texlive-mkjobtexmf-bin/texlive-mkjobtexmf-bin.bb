SUMMARY = "Binary files of mkjobtexmf"
DESCRIPTION = "Binary files of mkjobtexmf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn8457"

RPM_NAME = "texlive-mkjobtexmf-bin-2023.20230311.svn8457-89.1.aarch64.rpm"
RPM_HASH = "d19b68b8a4403dc051082d1780dc01c0de57ff415faafcc3f57e538d3dc58476598202897e78c2da665bdbd222063cb1e94e7c6657b82d84e926b74034c4f9c2"

RPROVIDES:${PN} += "texlive-mkjobtexmf-bin texlive-mkjobtexmf-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-mkjobtexmf"

inherit rpm
