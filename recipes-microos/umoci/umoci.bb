SUMMARY = "Open Container Image manipulation tool"
DESCRIPTION = "umoci modifies Open Container images. umoci is a manipulation tool for OCI \
images. In particular, it is a more complete alternative to oci-image-tools \
provided by the OCI."
LICENSE = "Apache-2.0"

PV = "0.4.7"

RPM_NAME = "umoci-0.4.7-3.1.aarch64.rpm"
RPM_HASH = "6614c11bcaeda81a9a0135c98123dc56232cde6fcf161d3ccd93041b445d5d3bda12a07c1176e6c6132089a4500337126df0569a090f28aa0cb5aad22b03e763"

RPROVIDES:${PN} += "umoci umoci(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
