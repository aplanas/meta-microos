SUMMARY = "Spying framework"
DESCRIPTION = "Mockito is a spying framework originally based on the Java library with the same name."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python39-mockito-1.4.0-1.3.noarch.rpm"
RPM_HASH = "751dcad4f25e8e3c09be7024f89f101c0564d13b6be467341d296802afc569f7673c29917e02fedfff290e9e1b95961b3ea51505c3ea438d43a1918850b066ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mockito) \
python39-mockito \
python3dist(mockito)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
