SUMMARY = "NTLM authentication for the python-requests library"
DESCRIPTION = "This package allows for HTTP NTLM authentication using \
python-requests. HttpNtlmAuth extends requests' AuthBase, so it can \
be dropped directly in place, or used in conjunction with a Session \
to make use of connection pooling."
LICENSE = "ISC"

PV = "1.2.0"

RPM_NAME = "python39-requests_ntlm-1.2.0-1.2.noarch.rpm"
RPM_HASH = "0a14a0d08dd59872340e546520b21943c9a293b74239e54d85fb7e7bcc14cd3d912abb180a4d2e141f95f869e2d851d62703cbec0ae681f5bdbb94b7026a2a76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(requests-ntlm) python39-requests_ntlm python3dist(requests-ntlm)"
RDEPENDS:${PN} += "python(abi) python39-cryptography python39-pyspnego python39-requests"

inherit rpm
