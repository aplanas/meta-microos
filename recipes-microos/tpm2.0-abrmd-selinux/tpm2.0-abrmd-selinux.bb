SUMMARY = "SELinux module for the Access Broker & Resource Manager for TPM 2.0 chips"
DESCRIPTION = "This package provides the SELinux module for the Access Broker & Resource Manager for TPM 2.0 chips."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "tpm2.0-abrmd-selinux-3.0.0-1.4.noarch.rpm"
RPM_HASH = "380eaa763665faf93353262828718f68038b855c9fd13833f6c1d229f6597f3ea6e4e1023627bbe09c5a7f41d5ab1e98b665e7936f837cfff342fd21d2b44cd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tpm2.0-abrmd-selinux"
RDEPENDS:${PN} += "/bin/sh libselinux-utils policycoreutils policycoreutils-python-utils selinux-policy selinux-policy-base tpm2.0-abrmd"

inherit rpm
