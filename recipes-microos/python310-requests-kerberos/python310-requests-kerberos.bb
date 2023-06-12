SUMMARY = "A Kerberos authentication handler for python-requests"
DESCRIPTION = "Requests is an HTTP library, written in Python, for human beings. This library \
adds optional Kerberos/GSSAPI authentication support and supports mutual \
authentication. Basic GET usage:"
LICENSE = "ISC"

PV = "0.14.0"

RPM_NAME = "python310-requests-kerberos-0.14.0-1.8.noarch.rpm"
RPM_HASH = "aaea42392efeaa140f0dcab58a8346fabd06b73582e99e4c263c552cbe1cc0adb36a4d3f940e18139fec724af260b9309b0152c6a31875f32c50fba0dcec6597"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-kerberos \
python3.10dist(requests-kerberos) \
python310-requests-kerberos \
python3dist(requests-kerberos)"
RDEPENDS:${PN} += "python(abi) \
python310-pyspnego \
python310-requests"

inherit rpm
