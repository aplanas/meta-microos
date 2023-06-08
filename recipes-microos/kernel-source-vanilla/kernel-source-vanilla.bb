SUMMARY = "Vanilla Linux kernel sources with minor build fixes"
DESCRIPTION = "Vanilla Linux kernel sources with minor build fixes. \
 \
 \
Source Timestamp: 2023-05-03 05:18:39 +0000 \
GIT Revision: 8a31779f5544166bb801a03085764c84a737a62d \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "kernel-source-vanilla-6.3.1-1.2.noarch.rpm"
RPM_HASH = "df6fc179e5d36a870f81ded0777505d78665143d79ebe5cbfce6ac059ef4badf9511c05ea625643b0b08918ef5b97413d75293f4319930b4c3c454470ee89e9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-source-vanilla multiversion(kernel)"
RDEPENDS:${PN} += "kernel-macros"

inherit rpm
