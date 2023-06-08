SUMMARY = "Kernel Symbol Versions (modversions)"
DESCRIPTION = "Kernel symbols, such as functions and variables, have version \
information attached to them. This package contains the symbol versions \
for the standard kernels. \
 \
This package is needed for compiling kernel module packages with proper \
package dependencies. \
 \
 \
Source Timestamp: 2023-05-03 05:18:39 +0000 \
GIT Revision: 8a31779f5544166bb801a03085764c84a737a62d \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "kernel-syms-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "006ae072a358f9d4de902e1f3021464ca3826d4344d61972ba71ad2f2359470c9eddb14ac680be7af3384bc2c2e10dd07008b06205848c825e26a7e373307675"

RPROVIDES:${PN} += "kernel-syms kernel-syms(aarch-64) kernel-syms-srchash-8a31779f5544166bb801a03085764c84a737a62d multiversion(kernel)"
RDEPENDS:${PN} += "kernel-64kb-devel kernel-default-devel kernel-devel pesign-obs-integration"

inherit rpm
