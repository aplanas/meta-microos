SUMMARY = "Binary files of bundledoc"
DESCRIPTION = "Binary files of bundledoc"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn17794"

RPM_NAME = "texlive-bundledoc-bin-2023.20230311.svn17794-89.1.aarch64.rpm"
RPM_HASH = "c2fa6936f1787c8eeb66656da2db188488aa72e2023d5f194de8fb38f33813274e4af294d1a8726bfe4a16c11d0159780a5904b6d6b9be8265ee79f82a197038"

RPROVIDES:${PN} += "texlive-bundledoc-bin texlive-bundledoc-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-bundledoc"

inherit rpm
