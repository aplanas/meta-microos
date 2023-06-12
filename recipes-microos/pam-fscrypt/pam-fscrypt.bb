SUMMARY = "Go tool for managing Linux filesystem encryption (the pam module)"
DESCRIPTION = "fscrypt is a high-level tool for the management of Linux filesystem encryption. \
This tool manages metadata, key generation, key wrapping, PAM integration, and \
provides a uniform interface for creating and modifying encrypted directories. \
 \
This package holds the pam module for fscrypt."
LICENSE = "Apache-2.0"

PV = "0.3.4"

RPM_NAME = "pam-fscrypt-0.3.4-3.4.aarch64.rpm"
RPM_HASH = "898c044959cf828b1914f246e3ef3154d81d2ea526c76f2e6ac5a3a74246ff98f6044d20e37a100c129df3da8e79411677db768ab253cae309b74ea0ede18972"

RPROVIDES:${PN} += "pam-fscrypt \
pam-fscrypt(aarch-64)"
RDEPENDS:${PN} += "fscrypt \
libc.so.6(GLIBC_2.34)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit)"

inherit rpm
