SUMMARY = "RPM macros for building Kernel Module Packages"
DESCRIPTION = "This package provides the rpm macros and templates for Kernel Module Pakcages \
 \
Source Timestamp: 2023-05-03 05:18:39 +0000 \
GIT Revision: 8a31779f5544166bb801a03085764c84a737a62d \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "kernel-macros-6.3.1-1.2.noarch.rpm"
RPM_HASH = "b1c48aa3c095e6fd2f76bbd80cd0ccab6d7dc67a855b9cdc18c262daa0f081066a4708333388c0f18fd7f28f3fbc9dc9fe83e42842974b901b911656c23960bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-macros kernel-subpackage-macros rpm_macro(_kernel_module_package) rpm_macro(cpu_arch) rpm_macro(kernel_build_shell_package) rpm_macro(kernel_module_directory) rpm_macro(kernel_module_package) rpm_macro(kernel_module_package_buildreqs) rpm_macro(kernel_module_package_release) rpm_macro(linux_arch) rpm_macro(linux_make_arch) rpm_macro(suse_kernel_module_package)"
RDEPENDS:${PN} += "/bin/bash /bin/sh"

inherit rpm
