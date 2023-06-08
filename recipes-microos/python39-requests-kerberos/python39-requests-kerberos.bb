SUMMARY = "A Kerberos authentication handler for python-requests"
DESCRIPTION = "Requests is an HTTP library, written in Python, for human beings. This library \
adds optional Kerberos/GSSAPI authentication support and supports mutual \
authentication. Basic GET usage:"
LICENSE = "ISC"

PV = "0.14.0"

RPM_NAME = "python39-requests-kerberos-0.14.0-1.8.noarch.rpm"
RPM_HASH = "7fef9b1a9f9feeee4156e4355c121ca5a934ac8e8adc31bd454762c4f3bfb81609f1a7d77cd14028b145d8ced09fb844d360542fb79cf21915b0201a6e55519b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(requests-kerberos) python39-requests-kerberos python3dist(requests-kerberos)"
RDEPENDS:${PN} += "python(abi) python39-pyspnego python39-requests"

inherit rpm
