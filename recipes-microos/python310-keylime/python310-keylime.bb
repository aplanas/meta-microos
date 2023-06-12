SUMMARY = "Open source TPM software for Bootstrapping and Maintaining Trust"
DESCRIPTION = "Keylime is a TPM based highly scalable remote boot attestation \
and runtime integrity measurement solution."
LICENSE = "Apache-2.0 & MIT"

PV = "7.0.0"

RPM_NAME = "python310-keylime-7.0.0-2.1.noarch.rpm"
RPM_HASH = "624fecef0f297a0178aa7678070be9c1e41660b03dd4ad67f5b1d9e3e836406fba72e3e83824def2b4ee8f153a8c9ab840204cac53a58c3e2dc56818db5656f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keylime \
python3.10dist(keylime) \
python310-keylime \
python3dist(keylime)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
libtss2-tcti-device0 \
libtss2-tcti-tabrmd0 \
procps \
python(abi) \
python310-M2Crypto \
python310-PyYAML \
python310-SQLAlchemy \
python310-alembic \
python310-cryptography \
python310-gpg \
python310-jsonschema \
python310-lark \
python310-psutil \
python310-pyzmq \
python310-requests \
python310-tornado \
python310-typing_extensions \
tpm2-0-tss \
tpm2.0-abrmd \
tpm2.0-tools \
update-alternatives"

inherit rpm
