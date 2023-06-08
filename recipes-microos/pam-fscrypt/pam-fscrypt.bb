SUMMARY = "Go tool for managing Linux filesystem encryption (the pam module)"
DESCRIPTION = "fscrypt is a high-level tool for the management of Linux filesystem encryption. \
This tool manages metadata, key generation, key wrapping, PAM integration, and \
provides a uniform interface for creating and modifying encrypted directories. \
 \
This package holds the pam module for fscrypt."
LICENSE = "Apache-2.0"

PV = "0.3.4"

RPM_NAME = "pam-fscrypt-0.3.4-3.3.aarch64.rpm"
RPM_HASH = "75f52e2b0df022324f47c8b7e7c764b6433620a93b19850f3033791d509370d9557e89343535466a8749c602e2c23363ca12fde85fade8d1c55228d8d4c22850"

RPROVIDES:${PN} += "pam-fscrypt pam-fscrypt(aarch-64)"
RDEPENDS:${PN} += "fscrypt libc.so.6(GLIBC_2.34)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit)"

inherit rpm
