SUMMARY = "Binary files of texdirflatten"
DESCRIPTION = "Binary files of texdirflatten"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn12782"

RPM_NAME = "texlive-texdirflatten-bin-2023.20230311.svn12782-89.1.aarch64.rpm"
RPM_HASH = "0da8b706a38f0709d257c0cf6c3771f46e2160295eaa38840ff3f1a0bf3d67b5eee45bc49f105198232e34d4f0a1e04f56a9f9f9dfb611fedc13398bfdbd5f77"

RPROVIDES:${PN} += "texlive-texdirflatten-bin texlive-texdirflatten-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-texdirflatten"

inherit rpm
