SUMMARY = "Open source TPM software for Bootstrapping and Maintaining Trust"
DESCRIPTION = "Keylime is a TPM based highly scalable remote boot attestation \
and runtime integrity measurement solution."
LICENSE = "Apache-2.0 & MIT"

PV = "7.0.0"

RPM_NAME = "python310-keylime-7.0.0-1.1.noarch.rpm"
RPM_HASH = "80aff877ec29fae0b8c95e0cc96ea05f8ef232cb89f516785fe5c09d9ffdeb9c4dfc2f404cef813b588752e87e9ff4b3cbbdfba83a037f02a749c28435052997"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keylime python3.10dist(keylime) python310-keylime python3dist(keylime)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 libtss2-tcti-device0 libtss2-tcti-tabrmd0 procps python(abi) python310-M2Crypto python310-PyYAML python310-SQLAlchemy python310-alembic python310-cryptography python310-gpg python310-lark python310-psutil python310-pyzmq python310-requests python310-tornado python310-typing_extensions tpm2-0-tss tpm2.0-abrmd tpm2.0-tools update-alternatives"

inherit rpm
