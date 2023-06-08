SUMMARY = "Spying framework"
DESCRIPTION = "Mockito is a spying framework originally based on the Java library with the same name."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python310-mockito-1.4.0-1.3.noarch.rpm"
RPM_HASH = "0efcc3f6be3bb6939033107f1799a013261b0674988288178e32e5602c8cbdabf83d48d8427563a5c4839e0a35b91f6e2b9521dcac2259e6d619d2742e467166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mockito python3.10dist(mockito) python310-mockito python3dist(mockito)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
