SUMMARY = "Warewulf Cluster Provisioning Module initramfs for aarch64 systems"
DESCRIPTION = "Warewulf is a scalable systems management suite originally developed to \
manage large high-performance Linux clusters. Focused on general \
scalable system management, it includes a framework for system \
configuration, management, provisioning/installation, monitoring, event \
notification, and more via a modular plugin architecture.  The \
provision module provides functionality for provisioning, configuring, \
and booting systems. \
 \
This package contains the aarch64-specific initramfs used to build the \
bootstrap for aarch64 systems."
LICENSE = "BSD-3-Clause-LBNL"

PV = "3.8.1"

RPM_NAME = "warewulf-provision-aarch64-initramfs-3.8.1-7.11.noarch.rpm"
RPM_HASH = "b1808bce09d5795009ca49f4adb3e1f9a587a214b06c7f0e3deddcbe3d261e3ebb2050e4155386491d8a5b350db705048ef28f7b5fa0eff7ebe28d7d26817d18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "warewulf-provision-aarch64-initramfs"
RDEPENDS:${PN} += "warewulf-provision"

inherit rpm
