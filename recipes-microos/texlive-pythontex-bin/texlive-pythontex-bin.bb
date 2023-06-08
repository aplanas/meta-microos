SUMMARY = "Binary files of pythontex"
DESCRIPTION = "Binary files of pythontex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn31638"

RPM_NAME = "texlive-pythontex-bin-2023.20230311.svn31638-89.1.aarch64.rpm"
RPM_HASH = "7a2075460b964556a7c63de3770c4e24bf63668a73dc882770a98c55bee706875584b6baf99a311ed1c4ebefe43d675e2070fd8f3702c5151f39373784e2fcc6"

RPROVIDES:${PN} += "texlive-pythontex-bin texlive-pythontex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pythontex"

inherit rpm
