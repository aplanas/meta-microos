SUMMARY = "Digital Forensics date and time (dfDateTime)"
DESCRIPTION = "dfDateTime, or Digital Forensics date and time, provides date and time \
objects to preserve accuracy and precision."
LICENSE = "Apache-2.0"

PV = "0~20230225"

RPM_NAME = "python39-dfdatetime-0~20230225-1.2.noarch.rpm"
RPM_HASH = "77bdb8f47e6db6be9026434edafd9743021a3d919f8ec06f1533c53b5b70b37b4158b87a5144f27740cae795dd43629aed07f7227a5d6994dc94ea9867828a0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dfdatetime) python39-dfdatetime python3dist(dfdatetime)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
