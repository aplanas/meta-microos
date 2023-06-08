SUMMARY = "Binary files of optex"
DESCRIPTION = "Binary files of optex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53804"

RPM_NAME = "texlive-optex-bin-2023.20230311.svn53804-89.1.aarch64.rpm"
RPM_HASH = "5fd0447cc5dbe52a1bf5a3f6fb5f2f0b962928dfd040910c3ff58d585c7a8fa4b4c5a1aaf71bf243fe4f90f19a142bcbbbbfd6efb991725073e37a13179edf67"

RPROVIDES:${PN} += "texlive-optex-bin texlive-optex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-optex"

inherit rpm
