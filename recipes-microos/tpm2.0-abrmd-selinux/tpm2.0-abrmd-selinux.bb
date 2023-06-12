SUMMARY = "SELinux module for the Access Broker & Resource Manager for TPM 2.0 chips"
DESCRIPTION = "This package provides the SELinux module for the Access Broker & Resource Manager for TPM 2.0 chips."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "tpm2.0-abrmd-selinux-3.0.0-2.1.noarch.rpm"
RPM_HASH = "7fae30df7e03965325670056287966d371f4c8e0bffda5a8bd60c8a630de7520b01c96510a679b75af2afa0e34c58ad88b83e132212ef1f6ea7c859feba087f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tpm2.0-abrmd-selinux"
RDEPENDS:${PN} += "/bin/sh libselinux-utils policycoreutils policycoreutils-python-utils selinux-policy selinux-policy-base tpm2.0-abrmd"

inherit rpm
