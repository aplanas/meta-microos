SUMMARY = "Development files needed for building kernel modules"
DESCRIPTION = "Kernel-level headers and Makefiles required for development of \
external kernel modules. \
 \
Source Timestamp: 2023-05-03 05:18:39 +0000 \
GIT Revision: 8a31779f5544166bb801a03085764c84a737a62d \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "kernel-devel-6.3.1-1.2.noarch.rpm"
RPM_HASH = "e97d834fe373fe913b2b5c840ea46b788970d74d325477c21443144a0e9290cb0fc6261a9e1daa055f3175bebd0e4a40a35a12a202fc384c46d67969d6884609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-devel multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils kernel-macros"

inherit rpm
