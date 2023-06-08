SUMMARY = "Binary files of texcount"
DESCRIPTION = "Binary files of texcount"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13013"

RPM_NAME = "texlive-texcount-bin-2023.20230311.svn13013-89.1.aarch64.rpm"
RPM_HASH = "35247e6bc768306bba06868b3c75a2d1467ff42dab123850925824b4fe4885a4ac00783f55edaa4358175fd7e3d926c3fcaf0e543c7534c52e2759023933b3be"

RPROVIDES:${PN} += "texlive-texcount-bin texlive-texcount-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-texcount"

inherit rpm
