SUMMARY = "Open source TPM software for Bootstrapping and Maintaining Trust"
DESCRIPTION = "Keylime is a TPM based highly scalable remote boot attestation \
and runtime integrity measurement solution."
LICENSE = "Apache-2.0 & MIT"

PV = "7.0.0"

RPM_NAME = "python311-keylime-7.0.0-1.1.noarch.rpm"
RPM_HASH = "5b6f52c7f12f8a62768cddf561d6d2fc1b264facb5f1555486e74c476cb81fb88f4782402572864bf27e90e79de2d693a828841b4619be27f43b8abb47ba40c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(keylime) python311-keylime python3dist(keylime)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 libtss2-tcti-device0 libtss2-tcti-tabrmd0 procps python(abi) python311-M2Crypto python311-PyYAML python311-SQLAlchemy python311-alembic python311-cryptography python311-gpg python311-lark python311-psutil python311-pyzmq python311-requests python311-tornado python311-typing_extensions tpm2-0-tss tpm2.0-abrmd tpm2.0-tools update-alternatives"

inherit rpm
