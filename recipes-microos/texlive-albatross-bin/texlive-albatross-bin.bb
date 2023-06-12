SUMMARY = "Binary files of albatross"
DESCRIPTION = "Binary files of albatross"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn57089"

RPM_NAME = "texlive-albatross-bin-2023.20230311.svn57089-91.1.aarch64.rpm"
RPM_HASH = "08dce9d9ab76cc7cd4bbc55c97c36f2705a49023773dddab4c208f281508fa1080f71f0658622a2c129eaf5d19393efe7c7e1c8cf9257fbdda2b9ae37ab2b2b3"

RPROVIDES:${PN} += "texlive-albatross-bin texlive-albatross-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-albatross"

inherit rpm
