SUMMARY = "Open source TPM software for Bootstrapping and Maintaining Trust"
DESCRIPTION = "Keylime is a TPM based highly scalable remote boot attestation \
and runtime integrity measurement solution."
LICENSE = "Apache-2.0 & MIT"

PV = "7.0.0"

RPM_NAME = "python39-keylime-7.0.0-1.1.noarch.rpm"
RPM_HASH = "012935550cb0be329ad0905f2a7504a86f436cb92e72135160d1681f1deced7da1b7d607621d7a453d04ce0f3fe6202e39e43de81bcad2b96b4665757eaaceb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(keylime) python39-keylime python3dist(keylime)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 libtss2-tcti-device0 libtss2-tcti-tabrmd0 procps python(abi) python39-M2Crypto python39-PyYAML python39-SQLAlchemy python39-alembic python39-cryptography python39-gpg python39-lark python39-psutil python39-pyzmq python39-requests python39-tornado python39-typing_extensions tpm2-0-tss tpm2.0-abrmd tpm2.0-tools update-alternatives"

inherit rpm
