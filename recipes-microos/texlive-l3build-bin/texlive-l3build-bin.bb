SUMMARY = "Binary files of l3build"
DESCRIPTION = "Binary files of l3build"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn46894"

RPM_NAME = "texlive-l3build-bin-2023.20230311.svn46894-91.1.aarch64.rpm"
RPM_HASH = "b8d2e5941d2952e0d048dfcca9bcfa2cc9d6b0f1aa2978ec831c47e83e5c7fdc87d24fa7e0d6b03953be6e08979eef8ae513f7843a2fd3dd31d3d71c52df0f2a"

RPROVIDES:${PN} += "texlive-l3build-bin texlive-l3build-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-l3build"

inherit rpm
